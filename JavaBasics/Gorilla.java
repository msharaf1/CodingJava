import java.util.Random;

public class Gorilla extends Mammal{
    private String name;
    private int age;

    public Gorilla(int energyLevel, String name, int age){
        super(energyLevel);
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    // @Override

    public int getPower(){
        return disPlayEnergyLevel();
    }
    public void eatsBanana(int banana){
        if(banana > 3){
            System.out.println("A Gorilla can't eat more than 3 times per day in this zoo.");
        }else{
        banana = banana * 10;
        setEngeryLevel(banana);
        }
        
    }

    public int throwsSomething(int rand){
        rand = (int)(Math.random() * 50 + 1);
        int loseEngery = (-5);
        int status;
        status = (setEngeryLevel(disPlayEnergyLevel() - loseEngery));
        system.out.println(status);
        
        return rand;
    }


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setStatusChange(){
        if (getPower()> 10){
            setName("Godzila");
        }
    }
    public String getSetStatusChange(){
        return getName();
    }

}