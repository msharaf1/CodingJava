public class ZooKeeperTest{
  public static void main(String[] args){
  	// System.out.println("You are here");

  	ZooKeeperMammal animal = new ZooKeeperMammal();
  	ZooKeeperGorilla gorilla = new ZooKeeperGorilla();
  	ZooKeeperBat vampireBat= new ZooKeeperBat();

  	System.out.println(animal.getEnergy());
  	animal.setEnergy(200);
  	System.out.println(animal.getEnergy());
  	animal.setEnergy(300).setEnergy(500);
  	System.out.println(animal.getEnergy());

  	gorilla.throwThings().throwThings().eatBannana().throwThings().climb();
  	vampireBat.fly().fly().eatHumans().attackTown().attackTown().attackTown();


  }
}
