package test2.professor;


import test2.person.person;
import test2.person.Display;

public class Professor extends person implements Display {

    private int employeeId;
    private String department;

    public Professor(String name, int age, int employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    public void display() {
        System.out.println("Professor Name: " + name +
                ", Age: " + age +
                ", Employee ID: " + employeeId +
                ", Department: " + department);
    }
}