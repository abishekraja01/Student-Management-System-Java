package com.studentmanagement;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class DatabaseHelper {
    private static final String URL = "jdbc:mysql://localhost:3306/student_db";
    private static final String USER = "root";
    private static final String PASSWORD = "@Raja0108";

    public DatabaseHelper(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    //Adding student data into the database
    public boolean addStudent(Student student){
        String sql = "INSERT INTO students (id, name, age, grade) VALUES(?, ?, ?, ?)";
        try(Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setInt(1, student.getId());
                pstmt.setString(2, student.getName());
                pstmt.setInt(3, student.getAge());
                pstmt.setString(4, student.getGrade());
                int rowsInserted = pstmt.executeUpdate();
                return rowsInserted > 0;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    //Updating student data into the database
    public boolean updateStudent(Student student){
        StringBuilder sql = new StringBuilder("UPDATE students SET ");
        List<Object> params = new ArrayList<>();

        if (student.getName() != null && !student.getName().isEmpty()) {
            sql.append("name = ?, ");
            params.add(student.getName());
        }
        if (student.getAge() != null) { // Allow age updates only if not null
            sql.append("age = ?, ");
            params.add(student.getAge());
        }
        if (student.getGrade() != null && !student.getGrade().isEmpty()) {
            sql.append("grade = ?, ");
            params.add(student.getGrade());
        }

        // Remove trailing comma if any fields were added
        if (params.isEmpty()) {
            return false; // No updates to perform
        }

        sql.setLength(sql.length() - 2); // Remove last comma
        sql.append(" WHERE id = ?");
        params.add(student.getId()); // Add ID condition

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = con.prepareStatement(sql.toString())) {

            for (int i = 0; i < params.size(); i++) {
                if (params.get(i) instanceof Integer) {
                    pstmt.setInt(i + 1, (Integer) params.get(i));
                } else {
                    pstmt.setString(i + 1, (String) params.get(i));
                }
            }

            int rowsUpdated = pstmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    //Deleting data from the database
    public boolean deleteStudent(int id){
        String sql = "DELETE FROM students WHERE id = ?";
        try(Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setInt(1, id);
                int rowsDeleted = pstmt.executeUpdate();
                return rowsDeleted > 0;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    //Getting all data from the database
    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try(Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(sql)){
                while (res.next()){
                    Student student = new Student(
                            res.getInt("id"),
                            res.getString("name"),
                            res.getInt("age"),
                            res.getString("grade")
                    );
                    students.add(student);
                }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return students;
    }
}
