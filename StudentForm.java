package com.studentmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class StudentForm extends JFrame {
    private JTextField idField, nameField, ageField, gradeField;
    private JButton addButton, updateButton, deleteButton, viewButton;
    private DatabaseHelper dbHelper = new DatabaseHelper();

    public StudentForm() {
        dbHelper = new DatabaseHelper();
        setTitle("Student Management System");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 10, 20, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Labels and Fields
        JLabel idLabel = new JLabel("ID:");
        gbc.gridx = 0; gbc.gridy = 0;
        add(idLabel, gbc);

        idField = new JTextField(15);
        gbc.gridx = 1;
        add(idField, gbc);

        JLabel nameLabel = new JLabel("Name:");
        gbc.gridx = 0; gbc.gridy = 1;
        add(nameLabel, gbc);

        nameField = new JTextField(15);
        gbc.gridx = 1;
        add(nameField, gbc);

        JLabel ageLabel = new JLabel("Age:");
        gbc.gridx = 0; gbc.gridy = 2;
        add(ageLabel, gbc);

        ageField = new JTextField(15);
        gbc.gridx = 1;
        add(ageField, gbc);

        JLabel gradeLabel = new JLabel("Grade:");
        gbc.gridx = 0; gbc.gridy = 3;
        add(gradeLabel, gbc);

        gradeField = new JTextField(15);
        gbc.gridx = 1;
        add(gradeField, gbc);

        // Buttons
        JButton addButton = new JButton("Add Student");
        gbc.gridx = 0; gbc.gridy = 4;
        add(addButton, gbc);

        JButton updateButton = new JButton("Update Student");
        gbc.gridx = 1;
        add(updateButton, gbc);

        JButton deleteButton = new JButton("Delete Student");
        gbc.gridx = 0; gbc.gridy = 5;
        add(deleteButton, gbc);

        JButton viewButton = new JButton("View Students");
        gbc.gridx = 1;
        add(viewButton, gbc);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateStudent();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteStudent();
            }
        });

        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Student> students = dbHelper.getAllStudents();
                new StudenTable(students);
            }
        });

    }

    private void addStudent(){
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        String grade = gradeField.getText();
        Student student = new Student(id, name, age, grade);

        if (dbHelper.addStudent(student)){
            JOptionPane.showMessageDialog(this, "Student added successfully!!!");
        }
        else {
            JOptionPane.showMessageDialog(this, "Failed to add student!!!");
        }
        clearFields();
    }

    private void updateStudent(){
        int id = Integer.parseInt(idField.getText().trim());
        String name = nameField.getText().trim();
        String ageText = ageField.getText().trim();
        String grade = gradeField.getText().trim();
        Integer age = ageText.isEmpty() ? null : Integer.parseInt(ageText);
        Student student = new Student(id, name.isEmpty() ? null : name, age, grade.isEmpty() ? null : grade);

        if (dbHelper.updateStudent(student)){
            JOptionPane.showMessageDialog(this, "Student updated successfully!!!");
        }
        else {
            JOptionPane.showMessageDialog(this, "Failed to update student!!!");
        }
        clearFields();
    }

    private void deleteStudent(){
        int id = Integer.parseInt(idField.getText());
//        String name = nameField.getText();
//        int age = Integer.parseInt(ageField.getText());
//        String grade = gradeField.getText();
//        Student student = new Student(id, name, age, grade);

        if (dbHelper.deleteStudent(id)){
            JOptionPane.showMessageDialog(this, "Student deleted successfully!!!");
        }
        else {
            JOptionPane.showMessageDialog(this, "Failed to delete student!!!");
        }
        clearFields();
    }

    private void clearFields(){
        idField.setText("");
        nameField.setText("");
        ageField.setText("");
        gradeField.setText("");
    }

}
