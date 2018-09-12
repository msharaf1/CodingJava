public class SpaceShipTest{
    public static void main(String[] args){
        SpaceShip moonSpace = new SpaceShip("Red");
        SpaceShip moonSpaceN = new SpaceShip(4);

        SpaceShip Solar = new SpaceShip("Green", 25);

        String moonX = moonSpace.getColor();
        int moonXN = moonSpaceN.getNumberOfWheels();

        // String solarX = Solar.getColor().getNumberOfWheels();

        System.out.println(moonX);
        System.out.println(moonXN);
        // System.out.println(solarX);
    }
}