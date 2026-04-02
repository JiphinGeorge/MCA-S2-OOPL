import java.io.*;

class Employee implements Serializable {

    int id;
    String name, department;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.department = dept;
        this.salary = salary;
    }
}
public class prgm_28_employee_file {

    public static void main(String[] args) {

        try {

            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("emp.dat"));

            Employee e = new Employee(101, "Arun", "IT", 50000);
            oos.writeObject(e);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("emp.dat"));

            Employee emp = (Employee) ois.readObject();
            ois.close();

            System.out.println("Employee Details:");
            System.out.println(emp.id + " " + emp.name + " " +
                    emp.department + " " + emp.salary);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
