import java.io.Serializable;

public class EmployeeBean implements Serializable{

    private String firstName;
    private String lastName;
    private int startYear;
    private double payRate;

    public EmployeeBean(){}

    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public int getStartYear(){return this.startYear;}
    public double getPayRate(){return this.payRate;}

    public void setFirstname(String firstName){this.firstName = firstName;}
    public void setLastName(String lastNaem){this.lastName = lastNaem;}
    public void setStartYear(int startYear){this.startYear = startYear;}
    public void setPayRate(double payRate){this.payRate = payRate;}

}