public class VehicleTest{
    public static void main(String[] args){
        Vehicle redSedan = new Vehicle("Red", 4);
        
        Vehicle blackBike = new Vehicle("Black", 3);
        Vehicle blueCycle = new Vehicle ("DarkMaroon", 2); 
        Vehicle toyotaCorolla = new Vehicle("Maroon", 4);
        
        
        String color = redSedan.getColor();
        String corolla =  toyotaCorolla.getColor();
        int corolla1 = toyotaCorolla.getNumberOfWheels();
        System.out.println(color);
        System.out.println(corolla);
        System.out.println(corolla1);
    }
}

        // System.out.println();