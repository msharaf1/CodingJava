package omastery;
public class Human {
	private int strength;
	private int stealth;
	private int intelligence;
    private int health;
    private String name;


    public Human(){

    }
    public Human(String name){
        this.name = name;
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;

    }
    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStealth() {
        return this.stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }


    public int getIntelligence() {
        return this.intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }


    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attackHuman(Human human){
        human.setHealth(human.health - strength);
    }

}
