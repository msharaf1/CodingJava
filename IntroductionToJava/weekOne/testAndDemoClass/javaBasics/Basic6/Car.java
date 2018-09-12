class Car{
    private int numberOfWheels;
    private String color;
//Getter
    public int getNumberOfWheels(){
        return numberOfWheels;
    }
//Setter 
    public void setNumberOfWheels(int number){
        numberOfWheels = number; //if var numberOfWheels doesn't math number, then no need for this.number, if it does then use this. number = number;
    }

    public String getColor(){
        return color;
    }
    

    public void setColor(String color){
        this.color = color;
    }

}