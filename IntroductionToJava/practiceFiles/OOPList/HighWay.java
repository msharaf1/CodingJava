package helloWorld;

//import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;

public class HighWay {
	private String name;
	private int speedLimit;
	ArrayList<Car> cars;
	
	public HighWay(String name, int speedLimit, Car car1, Car car2, Car car3, Car car4) {
		this.name= name;
		this.speedLimit = speedLimit;
		cars = new ArrayList<Car>(Arrays.asList(car1, car2, car3, car4));
	}
	
	public HighWay(String name, int speedLimit) {
		this.name= name;
		this.speedLimit = speedLimit;
		cars = new ArrayList<Car>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeedLimit() {
		return speedLimit;
	}

	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}
	
	public void setCars(Car car) {
		cars.add(car);
	}
	
	public void readCars(){
		for(int i =0; i < getCars().size(); i++) {
			
			System.out.println("Owner: "+getCars().get(i).getOwner()
					+"Make: " +getCars().get(i).getMake()
					+"Model: "+getCars().get(i).getModel()
					+"maxSpeed: "+ getCars().get(i).getMaxSpeeed());
		}
	}
}
