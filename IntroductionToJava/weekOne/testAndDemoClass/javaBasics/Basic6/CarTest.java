public class CarTest{
    public static void main(String[] args){
        Car mySedan = new Car();
        Car myBike = new Car();
        
        mySedan.setNumberOfWheels(4);
        mySedan.setColor("black");

        int carWheels = mySedan.getNumberOfWheels();
        String carColor = mySedan.getColor();

        System.out.println("My Sedan Car has: " + carWheels + " and my Car Color is Red: " + carColor);

        myBike.setNumberOfWheels(2);
        myBike.setColor("Red");

        String bikeColor = myBike.getColor();
        int bikeWheels = myBike.getNumberOfWheels();

        System.out.println("My Beatual Bike has: " + bikeWheels + " and the color is: " + bikeColor);
        

    }
}