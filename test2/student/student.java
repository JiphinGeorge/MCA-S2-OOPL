package test2.student;


import test2.person.person;
import test2.person.Display;

public class student extends person implements Display {

    private int studentId;
    private String course;

    public student(String name, int age, int studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    public void display() {
        System.out.println("Student Name: " + name +
                ", Age: " + age +
                ", ID: " + studentId +
                ", Course: " + course);
    }
}