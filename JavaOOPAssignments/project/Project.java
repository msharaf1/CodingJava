import java.util.ArrayList;

public class Project {
    private String name;
    private String description;
    private double cost;
    // private ArrayList<String> projectList= new ArrayList<>();

    public Project(){

    }
    public Project(String name, String descriptoin, double cost){
        this.name = name;
        this.description =descriptoin;
        this.cost = cost;
    }

    public void printNameDesk(){
        System.out.println(getName()+" ("+cost+")" +", " + getDescription());
    }


    //seters and getters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


 
 public String elevatorPitch(){
        return this.name+" ($"+this.cost+"): "+this.description;
    }

}