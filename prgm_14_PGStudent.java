import java.util.*;

interface Showable {
    void show();
}

class Person {
    String name, gender, phoneno;

    Person(String n, String g, String p) {
        name = n;
        gender = g;
        phoneno = p;
    }
}

class Student extends Person {
    String course;
    double score;

    Student(String n, String g, String p, String c, double s) {
        super(n, g, p);
        course = c;
        score = s;
    }
}

class PGStudent extends Student implements Showable {
    String researchArea, guide;

    PGStudent(String n, String g, String p, String c, double s,
              String r, String gu) {
        super(n, g, p, c, s);
        researchArea = r;
        guide = gu;
    }

    public void show() {
        System.out.println(name + " | " + score + " | " + researchArea);
    }
}

public class prgm_14_PGStudent {

    public static void main(String[] args) {

        PGStudent[] pg = {
            new PGStudent("A", "Male", "111", "MCA", 85, "AI", "Dr.X"),
            new PGStudent("B", "Female", "222", "MCA", 92, "ML", "Dr.Y"),
            new PGStudent("C", "Male", "333", "MCA", 78, "Cyber", "Dr.Z")
        };

        // Rank based on score (Descending)
        Arrays.sort(pg, (a,b) -> Double.compare(b.score, a.score));

        System.out.println("Ranking based on Score:");
        for(PGStudent p : pg)
            p.show();

        // Sort based on Research Area
        Arrays.sort(pg, (a,b) -> a.researchArea.compareTo(b.researchArea));

        System.out.println("\nSorted based on Research Area:");
        for(PGStudent p : pg)
            p.show();
    }
}
