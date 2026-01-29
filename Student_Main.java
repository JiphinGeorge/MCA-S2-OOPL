import java.util.Scanner;

class Student {
    int rollno;
    String name;
    double marks;
    static int count = 0; 

    Student() {
        rollno = 0;
        name = "Unknown";
        marks = 0.0;
        count++;
    }

    Student(int r, String n, double m) {
        rollno = r;
        name = n;
        marks = m;
        count++;
    }

    Student(Student s) {
        rollno = s.rollno;
        name = s.name;
        marks = s.marks;
        count++;
    }

    void display() {
        System.out.println("Roll No: " + rollno + ", Name: " + name + ", Marks: " + marks);
    }

    static void compare(Student s1, Student s2) {
        if (s1.marks > s2.marks)
            System.out.println(s1.name + " has higher marks than " + s2.name);
        else if (s1.marks < s2.marks)
            System.out.println(s2.name + " has higher marks than " + s1.name);
        else
            System.out.println("Both students have equal marks.");
    }
}

public class Student_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));
            System.out.print("Roll No: ");
            int r = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Marks: ");
            double m = sc.nextDouble();

            students[i] = new Student(r, name, m); 
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].marks < students[j].marks) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        System.out.println("\n--- RANK LIST ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Rank " + (i + 1) + ": ");
            students[i].display();
        }

        System.out.println("\nTotal number of students: " + Student.count);

        if (n >= 2) {
            System.out.println("\n--- Comparison of first two students ---");
            Student.compare(students[0], students[1]);
        }

        sc.close();
    }
}
