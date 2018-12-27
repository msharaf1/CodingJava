public class Human {
/*
uman should also have the ability to attack, 
where they decrease the health of whatever they attacked by their strength.

*/
    private int strength =3;
    private int intelligence=3;
    private int stealth =3;
    private int health =100;

    public Human(int strength, int intelligence, int stealth, int health){
        this.strength=strength;
        this.intelligence = intelligence;
        this.stealth = stealth;
        this.health = health;
    }//constructor
    public Human(){}//Empty consructor

    // public void attackOp(){

    // }

    public void setStrength(int strength){this.strength=strength;}
    public void setIntelligence(int intelligence){this.intelligence = intelligence;}
    public void setStealth(int stealth){this.stealth = stealth;}
    public void setHealth(int health){this.health = health;}

    public int getStrength(){return this.strength;}
    public int getIntelligence(){return this.intelligence;}
    public int getStealth(){return this.stealth;}
    public int getHealth(){return this.health;}
    

    public int attack(int health){
        return this.health - 10;
    }

}//Human class