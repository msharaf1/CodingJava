package novacollege;

public class Student {
    //Step 1;
//    public String firstName = "Ahamd";
//    public String lastName = "Khalid";

    private String firstName;
    private String lastName;
//    int 1 = int value1;

    //defualt step 1 + 2;
    public Student(){

    }
    //Step3

    public Student(String initialFirstName, String initialLastName){
        this.firstName = initialFirstName;
        this.lastName = initialLastName;
    }


    public void setFirstName(String firstNameValue){
        this.firstName = firstNameValue;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }


}
