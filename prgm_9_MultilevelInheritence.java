import java.util.Scanner;

class Person {
    String name, gender, address;
    int age;

    Person(String n, String g, String a, int ag) {
        name = n;
        gender = g;
        address = a;
        age = ag;
    }
}

class Employee extends Person {
    int empid;
    String company, qualification;
    double salary;

    Employee(String n,String g,String a,int ag,int id,String c,String q,double s) {
        super(n,g,a,ag);
        empid = id;
        company = c;
        qualification = q;
        salary = s;
    }
}

class Teacher extends Employee {
    int teacherId;
    String subject, department;

    Teacher(String n,String g,String a,int ag,int id,String c,String q,double s,
            int tid,String sub,String dep) {

        super(n,g,a,ag,id,c,q,s);
        teacherId = tid;
        subject = sub;
        department = dep;
    }

    void display() {
        System.out.println("\nTeacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class prgm_9_MultilevelInheritence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();

        Teacher t[] = new Teacher[n];

        for(int i=0;i<n;i++) {
            t[i] = new Teacher("Jiphin","Male","Kerala",22,
                    101,"ABC","MCA",40000,
                    i+1,"Java","CS");
        }

        for(int i=0;i<n;i++)
            t[i].display();
    }
}
