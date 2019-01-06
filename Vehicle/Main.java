public class Main{
    public static void main(String[] args) {
        Vehicle car = new Vehicle(4, 200.34);

        System.out.println(car.getWheel());
        System.out.println(car.getSpeed());
        car.setCarStrength(25);
        System.out.println("Car Strength is " + car.getCarStrength());
        // System.out.println(car.getCrashed());

    }
}