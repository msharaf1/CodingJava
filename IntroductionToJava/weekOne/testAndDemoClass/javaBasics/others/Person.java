public class Person{
    private String fullName;
    private int age;

    public static int numberOfPeople = 0;

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
        numberOfPeople++;


    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    // public int peopleCount(){
    //     return numberOfPeople;
    // }
}