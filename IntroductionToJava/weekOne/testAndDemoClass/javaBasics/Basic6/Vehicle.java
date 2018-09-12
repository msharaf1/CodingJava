class Vehicle{
    private int numberOfWheels;
    private String color;

    //constructor:
    public Vehicle(String color, int numberOfWheels){ // the number of var here defines what test must put too. Now it expects two inputs rather one.
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor(){ //Getters must have data type defined: String/int etc... and doesn't get the value ex. color
        return color;
    }

    public void setColor(String color){ //Setters take input var. 
        this.color = color;
    }

    public int getNumberOfWheels(){
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }
}