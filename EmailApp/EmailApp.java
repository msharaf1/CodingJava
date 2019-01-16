import java.util.*;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailC cE = new EmailC();
		Random rand = new Random();
		
		 	int leftLimit = 97; // letter 'a'
		    int rightLimit = 122; // letter 'z'
		    int targetStringLength = 10;
		    // Random rand = new Random();
		    StringBuilder buffer = new StringBuilder(targetStringLength);
		    for (int i = 0; i < targetStringLength; i++) {
		        int randomLimitedInt = leftLimit + (int) 
		          (rand.nextFloat() * (rightLimit - leftLimit + 1));
		        buffer.append((char) randomLimitedInt);
		    }
			String generatedString = buffer.toString();
			// String generatedString1 = buffer.toString();
		 
		    
	    
	    // System.out.println(generatedString);
	    
		cE.setCompany("Microsoft");
		cE.setDepartment("IT");
		cE.setFirstName("John");
		cE.setLastName("Jason");
		cE.setPassword(generatedString);
		cE.setEmail("g");
		cE.getEmail();
//	
		
		System.out.println(cE.getEmail());
		cE.setPassword(generatedString);
		
		System.out.println(cE.getPassword());
		cE.changePasword("hello");
		System.out.println(cE.getPassword());
		
		
		
		

	}//void

}
