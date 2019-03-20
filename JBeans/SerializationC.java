import java.io.*;

public class SerializationC {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.firstName = "John";
        emp.lastName = "Smith";
        emp.Address = "USA";
        try {
            FileOutputStream fos = new FileOutputStream("/Users/menhaj/Documents/CodingJava/JBeans/empFOS.txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(emp);
            out.close();
            fos.close();
            System.out.println("Data Saved!");

        } catch(IOException e){
            e.printStackTrace();
        }
    }//void main
}//main class