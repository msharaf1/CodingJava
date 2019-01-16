import java.util.*;

public class EmailApp{
    public static void main(String[] args) {
        // System.out.println("text");

        Email genEmail = new Email();
        System.out.println("First Name: "+genEmail.getFirstName() + "\n" 
        +"Last Name: "+ genEmail.getLastName() + "\n" 
        +"Age: "+genEmail.getAge() + "\n"
        +"Random Password: "+genEmail.getPassword());

   
    }
}