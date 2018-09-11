import java.util.ArrayList;



public class JavaBasics {
	public static void main(String[] args){
		JavaBasics basics = new JavaBasics();

		// basics.print1to255(); //prints from 1 to 255.
		// basics.printOdd1To255();
		// basics.printSum1To255();

		// int[] myArrays = new int[] {1, 2, 3, 4};

		// basics.printArray();
		int[] myArrays = new int[] {-2, -5, 20, 19, 200, -1, 500, 9000};
		basics.findMax(myArrays);



  }

    public  void print1to255() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public void printOdd1To255(){
    	for(int i = 0; i<=255; i++){
    		if(i % 2 != 0){
    		System.out.println(i);
    			}
    		}
    }

    // public void printSum1To255(){
    // 	int count=0;
    // 	while(count <=255){
    // 		// System.out.println(count);
    // 		count++;
    // 		count += count;
    // 		System.out.println(count);
    // 	}

    // }
    public void printSum1To255(){
    	int sum = 0;
    	for(int i = 0; i <=255; i++){
    		sum += i;
    	System.out.println(sum);
    	}

    }

    public void printArray(){
    	int[] myArrays = new int[] {1,3,5,7,9,13};
    		for(int i = 0; i < myArrays.length; i++){
    			System.out.println(myArrays[i]);
    		}
    }
    public void findMax(int[] myArrays){
    	
    	int max = myArrays[0];
    	// int maxi = myArrays[i];
    	for(int i = 0; i < myArrays.length; i++){
    		if(myArrays[i] > max){
    			max = myArrays[i];
    		}
    	}
    	System.out.println(max);
    }

    // public void printMax(){
    // 	int[] myArrays = new int[];
    // }


}