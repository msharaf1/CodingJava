package vehicls;

public class Vehicle{
    private String make, model;
    private int currentSpeed;
    public Vehicle(String make, String model, int initialSpeed){
        this.make = make;
        this.model = model;
        this.currentSpeed = initialSpeed;
        
    }
    public Vehicle(){}

    // Vehicle vehicle = new Vehicle("Toyota", "Camry", 49);
    // Vehicle vehicle = new Vehicle();


    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }



}