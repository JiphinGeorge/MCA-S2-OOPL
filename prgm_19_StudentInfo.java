
import java.util.*;
public class prgm_19_StudentInfo {

    public static void main(String[] args) {

        HashMap<Integer,String> students = new HashMap<>();

        students.put(101,"Arun");
        students.put(102,"Meera");
        students.put(103,"Rahul");

        int id = 102;

        if(students.containsKey(id))
            System.out.println("Student Name: "+students.get(id));
        else
            System.out.println("Student not found");
    }
}