public abstract class Crashable{
    boolean carDriveable = true;

    public void youCrashed(){
        this.carDriveable = false;
    }


    public abstract void setCarStrength(int carStrength);
    public abstract int getCarStrength();
}