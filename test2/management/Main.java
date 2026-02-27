package test2.management;

import test2.student.student;
import test2.professor.Professor;
import test2.management.batch;

public class Main {

    public static void main(String[] args) {

        batch batch = new batch();

        student s1 = new student("Arun", 20, 101, "MCA");
        student s2 = new student("Meera", 21, 102, "MCA");

        student s3 = new student("Rahul", 22, 201, "MBA");
        student s4 = new student("Anjali", 23, 202, "MBA");

        Professor p1 = new Professor("Dr. Kumar", 45, 1001, "Computer Science");
        Professor p2 = new Professor("Dr. Nair", 50, 1002, "Management");

        batch.addStudentToBatch1(s1);
        batch.addStudentToBatch1(s2);

        batch.addStudentToBatch2(s3);
        batch.addStudentToBatch2(s4);

        batch.assignProfessorToBatch1(p1);
        batch.assignProfessorToBatch2(p2);

        batch.displayBatchDetails();
    }
}