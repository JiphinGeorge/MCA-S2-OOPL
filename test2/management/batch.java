package test2.management;

import java.util.ArrayList;
import test2.student.student;
import test2.professor.Professor;

public class batch {

    private ArrayList<student> batch1 = new ArrayList<>();
    private ArrayList<student> batch2 = new ArrayList<>();

    private Professor professor1;
    private Professor professor2;

    public void addStudentToBatch1(student s) {
        batch1.add(s);
    }

    public void addStudentToBatch2(student s) {
        batch2.add(s);
    }

    public void assignProfessorToBatch1(Professor p) {
        professor1 = p;
    }

    public void assignProfessorToBatch2(Professor p) {
        professor2 = p;
    }

    public void displayBatchDetails() {

        System.out.println("=== Batch 1 ===");
        professor1.display();
        for (student s : batch1) {
            s.display();
        }

        System.out.println("\n=== Batch 2 ===");
        professor2.display();
        for (student s : batch2) {
            s.display();
        }
    }
}