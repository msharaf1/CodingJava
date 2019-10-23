public class Mammal {
    private int energeLevel;

    public Mammal(){

    }

    public int getEnergeLevel() {
        return this.energeLevel;
    }

    public void setEnergeLevel(int energeLevel) {
        this.energeLevel = energeLevel;
    }

    public String displayEnergy(){
        return "Energy Level is: " +getEnergeLevel();
    }
}