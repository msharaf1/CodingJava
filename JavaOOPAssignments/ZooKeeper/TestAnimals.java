public class TestAnimals {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        gorilla.setEnergeLevel(10);
        // gorilla.displayEnergy();
        // gorilla.throwSomething();
        // gorilla.eatBananas();

        System.out.println(
            "Enger Level " +gorilla.displayEnergy()
            +" " +gorilla.throwSomething()
            +"\n" +gorilla.eatBananas()
            +"\n"+gorilla.climbsTree()
        );
        Bat bat = new Bat();

        System.out.println(
            bat.fly() +"\n"+
            bat.eatHumans());
            
            bat.attackTown();
        }
}