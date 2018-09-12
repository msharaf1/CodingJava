class SpaceShip{
    private int numberOfWheels;
    private String color;

    public SpaceShip(){
    
    }
    public SpaceShip(String color){
        this.color = color;

    }
    public SpaceShip(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }
    public SpaceShip(String color, int numberOfWheels){
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels(){
        return numberOfWheels;
    }
    public String getColor(){
        return color;
    }

    public void setNumberofWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    public void setColor(String color){
        this.color = color;
    }

}