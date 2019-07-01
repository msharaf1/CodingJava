import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;


// https://www.baeldung.com/java-8-date-time-intro

public class DatePt{
    private int iD;
    private String name;
    private LocalDate esbalishDate;

    public DatePt(int iD, String name, LocalDate establishDate ){
        this.iD = iD;
        this.name = name;
        this.esbalishDate = establishDate;
    }

    public int getId(){return this.iD;}
    public void setId(int iD){this.iD = iD;}

    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}

    public LocalDate getDate(){
        return this.esbalishDate;
    }

    public void setDate(LocalDate date){
        // SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
        this.esbalishDate = date;
    }
}