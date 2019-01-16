
import java.util.Scanner;

public class Email{
    private String firstName;
    private String lastName;
    private int age;
    private String state;
    private String password;
    private int defaultPasswordLength = 8;
    
    public Email( ){
        this.firstName = setFirstName();
        this.lastName = setLastName();
        this.age = setAge();
        this.password = randomPassword(defaultPasswordLength);

        // System.out.println(setFirstName());
    }


    
    public String setFirstName(){
        
        Scanner inputFirstName = new Scanner(System.in);
        String fName = inputFirstName.nextLine();
        return  fName;
    }
    public String setLastName(){
        Scanner inputLastName = new Scanner(System.in);
        String LName = inputLastName.nextLine();
        return LName;
    }

    public int setAge(){
        Scanner inputAge = new Scanner(System.in);
        age = inputAge.nextInt();
        return age;
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }




    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public int getAge(){return this.age;}
    public String getPassword(){return this.password;}
}