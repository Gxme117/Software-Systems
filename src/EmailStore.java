import java.util.Set;
import java.util.HashSet;

public class EmailStore {

    // Creating a Set
    public Set<String> emailaddresses = new HashSet<String>();

    // Creating a method to add emails to Set
    public boolean addEmail (String email){
        return emailaddresses.add(email);

    };

    // Creating a method to check for duplicate emails
    public boolean hasEmail (String email){
        return emailaddresses.contains(email);

    };

    // Creating a method to display all emails in set
    public void displayEmails() {

        //Using for each loop
        for (String email : emailaddresses) {
            System.out.println(email);
        }
    }



}
