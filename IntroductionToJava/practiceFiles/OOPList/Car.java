package helloWorld;

public class Car {
	private String owner;
	private String model;
	private String make;
	private int maxSpeeed;
	
	public Car(String owner, String model, String make, int maxSpeed) {
		this.owner = owner; this.model = model; this.make = make; this.maxSpeeed = maxSpeed;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getMaxSpeeed() {
		return maxSpeeed;
	}

	public void setMaxSpeeed(int maxSpeeed) {
		this.maxSpeeed = maxSpeeed;
	}
	
	

}
