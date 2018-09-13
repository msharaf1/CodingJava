public class PersonTest{
    public static void main(String[] args){
        Person firstPerson = new Person("Jason", 44);
        Person secondPerson = new Person("Jimmi", 23);
        Person thirdPerson = new Person("Jacks", 33);

        secondPerson.getFullName();
        String JS = firstPerson.getFullName();

        System.out.println(JS);
        System.out.println(thirdPerson.getAge());
        System.out.println(secondPerson.getFullName());
        System.out.println(Person.numberOfPeople);

    }
}