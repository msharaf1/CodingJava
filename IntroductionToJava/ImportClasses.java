//Java has many built in classes and methods that are readily available to developers. To tell Java that we want to use a special class for our program, all we have to do is use an import statement before our class definition. Let's say that we want to display the current date in our java program. All we have to do is import the Date class.
import java.util.Date;
public class ImportClasses {
    public String getCurrentDate() {
        Date date = new Date();
        return "Current Date is: " + date;
    }
}