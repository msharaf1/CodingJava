import java.time.LocalDate;

public class DatePtTest{
    public static void main(String[] args) {
        DatePt datePt = new DatePt(1, "Sharaf", LocalDate.now());
        
        datePt.setDate(LocalDate.of(2005,10,20));
        datePt.setDate(LocalDate.parse("2014-02-20"));
        System.out.println(
            datePt.getDate()

        );
    }
}