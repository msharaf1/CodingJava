

public class Person{
    private int age;
    private String name;
    public static int countTotal=0;
    private static double counter =1;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
        countTotal++;
        counter += 3.5;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public static double getTotal(){
        return counter;
    }
}