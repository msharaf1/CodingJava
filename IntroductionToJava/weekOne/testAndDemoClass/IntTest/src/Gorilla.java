public class Gorilla extends Mammal{
    private String name;
    private int decrease;


    public Gorilla(int energyLevel, String name){
        super(energyLevel);
        this.name = name;
    }

    public void setname(String name){
        this.name = name;
    }

    @Override
    public int disPlayEnergyLevel() {
        return super.disPlayEnergyLevel ();
    }

    public void loseEnergy(int decrease){
        this.decrease = (disPlayEnergyLevel ()-decrease);
    }

    public int getDecrease(){
        return this.decrease;
    }
}
