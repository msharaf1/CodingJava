public class Vehicle extends Crashable implements Driveable{
    public int numOfWheels = 2;
    public double theSpeed = 0.0;
    public int carStrength = 9;
    // double PI = 3.14;

    public int getWheel(){
        return this.numOfWheels;
    }
    public void setWheels(int numOfWheels){
        this.numOfWheels = numOfWheels;
    }

    public double getSpeed(){
        return this.theSpeed;
    }
    public void setSpeed(double theSpeed){
        this.theSpeed = theSpeed;
    }

    public Vehicle(int numOfWheels, double theSpeed){
        this.numOfWheels = numOfWheels;
        this.theSpeed = theSpeed;
    }

    public void setCarStrength(int carStrength){
        this.carStrength = carStrength;
    };
    public int getCarStrength(){
        return carStrength;
    };
}