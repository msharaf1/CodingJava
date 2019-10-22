package basicChallenges.src;

public class SumsTwo {
	
	public int addTwo(int p1, int p2) {
		int result = p1 + p2;
		return result;
	}
//	int total = addTwo(20,40);
	public SumsTwo(int p1, int p2) {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumsTwo addT = new SumsTwo(10,20);
		
		int test = addT.addTwo(30, 40);
		System.out.println(test);
		
	}

}
