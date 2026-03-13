
import java.util.*;

class Attendee {

    String name;
    String email;
    int registrationId;

    Attendee(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.registrationId = id;
    }

}

public class prgm_20_ListofAttendees {

    public static void main(String[] args) {

        HashMap<Integer,Attendee> map=new HashMap<>();

        Attendee a1=new Attendee("Arun","arun@gmail.com",1);
        Attendee a2=new Attendee("Meera","meera@gmail.com",2);

        map.put(a1.registrationId,a1);
        map.put(a2.registrationId,a2);

        for(Attendee a:map.values())
            System.out.println(a.registrationId+" "+a.name+" "+a.email);
    }
}