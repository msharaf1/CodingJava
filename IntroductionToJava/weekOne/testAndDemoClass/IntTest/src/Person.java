public class Person {
    private int age;
    private String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void objectMethods(Person anotherObject){
        System.out.println("Class Name: "+ this.getClass().getSimpleName());
        System.out.println("To String: " +this.toString());
        System.out.println("Equals " +this.equals(anotherObject));
    }

}
