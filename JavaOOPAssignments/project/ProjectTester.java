import java.util.ArrayList;

public class ProjectTester {
    public static void main(String[] args) {
        Project project = new Project("Village Stablity", "Building a nation", 609.66);
        // p1.printNameDesk();
        Project project1 = new Project("The Blend House", "Best Coffee", 40.00);
        Portfolio portfolio = new Portfolio();
        portfolio.addProjects(new Project("B", "K", 20.30));
        portfolio.addProjects(new Project("B", "K", 30.30));
        portfolio.addProjects(new Project("B", "K", 40.30));
        portfolio.addProjects(new Project("B", "K", 5.30));
        portfolio.addProjects(project1);
        
        
        // portfolio.getPortfolioCost();
        portfolio.showPortfolio();
        
        // int x = 10;
        // int y = 90;
        // int z = 30;
        // ArrayList<Integer> calList = new ArrayList<>();
        // calList.add(x);
        // calList.add(y);
        // calList.add(z);
        // int min=0;
        // int max=0;
        // for(int i=0; i < calList.size(); i++){
        //     if(min < calList.get(i)){
        //         min = calList.get(i);
        //         // System.out.println(min);
        //     }
        // }
        // System.out.println(min);

    }
}