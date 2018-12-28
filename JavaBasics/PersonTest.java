public class PersonTest{
    public static void main(String[] args) {
        Person empPerson1 = new Person(20, "James");
        System.out.println(empPerson1.getName());
        System.out.println(empPerson1.getAge());
        System.out.println(Person.countTotal);
        Person empPerson2 = new Person(30, "Tim");
        System.out.println(empPerson2.getName());
        System.out.println(empPerson2.getAge());
        
        
        // empPerson1.getTotal();
        System.out.println(Person.countTotal);
        System.out.print(Person.getTotal());;
        

    }
}