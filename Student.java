package com.studentmanagement;

public class Student {
    private int id;
    private String name;
    private Integer age;
    private String grade;

    //default constructor
    public Student(){
        this.id = 0;
        this.name = "Unknown";
        this.age = 0;
        this.grade = "Not Assigned";
    }

    //Parameterized constructor
    public Student(int id, String name, Integer age, String grade){
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    public String getGrade(){
        return grade;
    }

    //setters
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public void setGrade(String grade){
        this.grade =grade;
    }

    //toString() with override
    @Override
    public String toString() {
        return "Student Details:\n" +
                "ID    : " + id + "\n" +
                "Name  : " + name + "\n" +
                "Age   : " + age + "\n" +
                "Grade : " + grade;
    }

}
