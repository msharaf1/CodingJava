package novacollege;

public class StudentTester {
    public static void main(String[] args) {
        //step1
        Student s1 = new Student();
//        System.out.println(s1.firstName +" || "+ s1.lastName);
//
//        s1.firstName = "Jawid";
//        s1.lastName = "Sarwar";
//        System.out.println(s1.firstName +" || "+ s1.lastName);

        //step2
//        Student s2 = new Student();
//        s2.setFirstName("John");
//        s2.setLastName("Smith");
//        String jonsLastName = s2.getLastName();
//
//        System.out.println(s2.getFirstName() +" "+ jonsLastName);
        //step3
        Student s3 = new Student("Kim", "Tony");
        System.out.println(s3.getFirstName() +" || "+ s3.getLastName());
    }
}
