public class Gorilla extends Mammal{
    
    public Gorilla(){
        super();
    }

    public String throwSomething(){
        //implement random items

        this.setEnergeLevel(this.getEnergeLevel() -5);
        System.out.println(this.getEnergeLevel());
        return "Throw Something at you ";
    }
    @Override
    public String displayEnergy(){
        return "Energy Level is: " +getEnergeLevel();
    }

    public String eatBananas(){
        this.setEnergeLevel(this.getEnergeLevel() +10);
        return "Gorilla's energy increased by 10 and is now "+this.getEnergeLevel();
    }

    public String climbsTree(){
        this.setEnergeLevel(this.getEnergeLevel() - 10);
        return "Gorilla climbed the tree and lost 10 EG-points, its engery is : "+this.getEnergeLevel();
    }
}