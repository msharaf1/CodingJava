public class Mammal{
    private int energyLevel = 100;

    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
        // setEngeryLevel(energyLevel);
        
    }
    public void setEngeryLevel(int energyLevel){
        this.energyLevel = energyLevel;
    }
    public int disPlayEnergyLevel(){
        return this.energyLevel;
    }

    
    // public void eatsBana(int increaseByTen){
    //     increaseByTen = 10;
    //     this.energyLevel = (disPlayEnergyLevel()+increaseByTen);
    //     increaseByTen += 10;
    // }
}