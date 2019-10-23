import java.util.ArrayList;


public class Portfolio {
    ArrayList<Project> projectList = new ArrayList<>();
    public Portfolio(){}

    public void addProjects(Project project){
        projectList.add(project);
    }
    public ArrayList<Project> getProjectList(){
        return projectList;
    }
    public double getPortfolioCost(){
        double sum =0.0;
        for(int i=0; i < this.projectList.size(); i++){
            sum+= this.projectList.get(i).getCost();
        }
        return sum;
    }
    public void showPortfolio(){
        for(int i=0; i< projectList.size(); i++){
            String pitch = projectList.get(i).elevatorPitch();
            System.out.println(pitch);
        }
        System.out.println("\nTotal Portfolio Cost: $"+this.getPortfolioCost());
    }
    @Override
    public String toString(){
        return "Project" +projectList.get(1).getCost();
    }

    // double tCost =0.00;
    // public void calcPrice(ArrayList<Project> projectList){
    //     // System.out.println(projectList.size());
    //     for(int i =0; i < projectList.size(); i++){
    //         // double totalCost=0.00;
    //         tCost+= projectList.get(i).getCost();
    //         // System.out.println(tCost);
            
    //     }
    // }

    // public void calProjectPrice(){
    //     double newCost=0;
    //     // newCost = project.getCost() + project.getCost();
    //     for(int i=0; i < projectList.size(); i++){
    //             newCost +=projectList.get(i).getCost();
                
    //         // System.out.println(portfolio.getProjectList().get(i));
    //     }
    //     System.out.println(newCost);
    // }

    //  public float getPortfolioCost(){
    //     float sum = 0.0f;

    //     for(int i=0;i<this.projectList.size();i++){
    //         sum += this.projectList.get(i).getCost();
    //     }
    //     System.out.println(sum);
    //     return sum;
    // }

}