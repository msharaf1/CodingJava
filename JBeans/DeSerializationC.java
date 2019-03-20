import java.io.*;

public class DeSerializationC {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        Employee emp = null;
        try{
            FileInputStream fis = new FileInputStream("/Users/menhaj/Documents/CodingJava/JBeans/empFOS.txt");
            ObjectInputStream fln = new ObjectInputStream(fis);
            emp = (Employee) fln.readObject();
            fln.close();
            fis.close();

        }finally {
            System.out.println("Object received is: " + emp.firstName + "\n" + emp.lastName + "\n" + emp.Address + "\n");
        }
    }
}