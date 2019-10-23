public class Bat extends Mammal {

    public Bat(){
        super();
        this.setEnergeLevel(300);
    }

    public String fly(){
        this.setEnergeLevel(this.getEnergeLevel()-50);
        return "Bat bat flying ... current energy level is: " +this.getEnergeLevel();
    }
    public String eatHumans(){
        this.setEnergeLevel(this.getEnergeLevel() +25);
        return "So - well, it was spicy and gained: "+ this.getEnergeLevel(); 
    }

    public void attackTown(){
        this.setEnergeLevel(this.getEnergeLevel()-100);
        System.out.println("Burning town, the town is now destroyed." +this.getEnergeLevel() +" Energy left");
    }



}