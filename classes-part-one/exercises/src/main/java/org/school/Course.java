package org.school;

import java.util.ArrayList;

public class Course {

    private int id;

    public Course(int id, String title, String department, ArrayList<Student> students) {
        this.id = id;
        this.title = title;
        this.department = department;
        this.students = students;
    }

    private String title;
    private String department;
    private ArrayList<Student> students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
