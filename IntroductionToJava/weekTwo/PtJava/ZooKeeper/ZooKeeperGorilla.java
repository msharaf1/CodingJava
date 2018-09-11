public class ZooKeeperGorilla extends ZooKeeperMammal {
	public ZooKeeperGorilla(){

	}
	public ZooKeeperGorilla throwThings(){
		System.out.println("Throwing Stuff");
		// System.out.println(getEnergy());
		// setEnergy(getEnergy() - 5);
		// setEnergy(getEnergy());
		// System.out.println(getEnergy());
		
		if(getEnergy() - 5 > 0){
			System.out.println("Throwing Stuff");
			setEnergy(getEnergy() - 5);
		}else {
			System.out.println("Too Tired");
		}

		return this;

	}
	public ZooKeeperGorilla eatBannana(){
		System.out.println("Nom, Nom, Nom");
		setEnergy(getEnergy() + 10);
			// if(getEnergy() - 5 > 0){
			// 	System.out.println("Eating Banana");
			// 	setEnergy(getEnergy() - 5);
			// }else {
			// 	System.out.println("Too Tired");
			// }
		
		return this;

	}
	public ZooKeeperGorilla climb(){
		
			if(getEnergy() - 10 > 0){
				System.out.println("Climbing");
				setEnergy(getEnergy() - 10);
			}else {
				System.out.println("Too Tired");
			}
		return this;

	}

}