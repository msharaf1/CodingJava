public class ZooKeeperMammal {
	// private String name;
	private int energy;

	public ZooKeeperMammal(){ // constructor should match the class. Constructors don't need any return.
		// this.name = name;
		this.energy = 100;

	}

	public int getEnergy(){ //method can call. 
		return this.energy;
	}
	// public void setEnergy(int val){
	// 	this.energy = val;
	// }
	public ZooKeeperMammal setEnergy(int val){
		this.energy = val;
		return this;
	}
}