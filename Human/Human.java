publci abstract class Human{
    protected String name;

    public Human(Stirng name){
        this.name = name;
    }

    public abstract void attack(Human human);
    public abstract void defend();
    public abstract void jump();
    public abstract double heal();

    public String getName(){
        return name;
    }
    public double getHealth(){
        return health;
    }
    public long getExperience(){
        return 1.2;
    }
    public void setAttackPower(int attackPower){...}
    public long gainExperience(long experience){...}
    public double heal(double additoinalHealth){...}
    public double decreaseHealth(int opponentAttackPower){...}
}