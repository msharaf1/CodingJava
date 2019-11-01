package helloWorld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TestTer {

	public static void main(String[] args) {
		//String owner, String model, String make, int maxSpeed
		Car car1 = new Car("Noor", "Corolla", "Toyota", 120);
		Car car2 = new Car("Zahoor", "Corolla", "Toyota", 120);
		Car car3 = new Car("Zabi", "Corolla", "Toyota", 120);
		Car car4 = new Car("Shila", "Corolla", "Toyota", 120);
		
		HighWay hw = new HighWay("I95", 70);
		hw.cars.add(car1);
//		System.out.println(hw.getCars().get(0).getModel());
		
//		ArrayList<Car> carList = new ArrayList<>(Arrays.asList(car1, car2, car3));
//		System.out.println(carList.get(0).getModel());
		
		HighWay hwWithList = new HighWay("270", 55, car1, car2, car3, car4);
		hwWithList.readCars();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
//		Date date = new Date();
//		Algo person = new Algo();
//		
//		person.setFullName("James Anthoy");
//		person.setDoB("2019/01/20");
//		person.setStartWork(new Date());
//		person.setPublishedBooks( new String[] {"CSIC", "Kimber", "James", "Tony"});
//		person.setSerials(new ArrayList<Integer> (Arrays.asList(100, 200, 400, 500)));
//		person.setCashInHand(2000.055);
//		
//		System.out.println(
//						"Full Name: " + person.getFullName() +" \n " +
//						"Date of Birth: " + person.getDoB() +" \n "+ 
//						"Cash in Hand: "+ person.getCashInHand() +" \n "+  
//						"PUblished Books"+ person.getPublishedBooks() +" \n "+  
//						"Serials: "+ person.getSerials()+" \n "+ 
//						"Start Date: "+ person.getStartWork()
//				
//				);
		
//		int num = 123456;
//		String strNum = Integer.toString(num);
//		String revNum = "";
//		for(int i = strNum.length()-1; i >= 0; i--) {
//			revNum += strNum.charAt(i);
//		}
//		System.out.println(revNum +" It is a string type.");
//		int convertedInt = Integer.parseInt(revNum);
//		System.out.println(convertedInt+"  It is an integer type" );
		
		//Check for Palindrum
		


	}
	

}
