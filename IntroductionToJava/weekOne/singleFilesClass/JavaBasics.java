import java.util.ArrayList;



public class JavaBasics {
	public static void main(String[] args){
		JavaBasics basics = new JavaBasics();

		// basics.print1to255(); //prints from 1 to 255.
		// basics.printOdd1To255();
		// basics.printSum1To255();

		// int[] myArrays = new int[] {1, 2, 3, 4};

		// basics.printArray();
    	// int[] myArrays = new int[] {2, 4, 8, 10};
    // int[] myArrays = new int[] {2, 4, 8, 10, 3};
		// basics.findMax(myArrays);
    // basics.getAvg(myArrays);
    	basics.oddArray();
    
  //   for(int i = 0; i < myList.size(); i++) {
  //     Integer castedValue = (Integer) myList.get(i);
  // }

  }

    // public  void print1to255() {
    //     for (int i = 1; i <= 255; i++) {
    //         System.out.println(i);
    //     }
    // }

    // public void printOdd1To255(){
    // 	for(int i = 0; i<=255; i++){
    // 		if(i % 2 != 0){
    // 		System.out.println(i);
    // 			}
    // 		}
    // }

    // public void printSum1To255(){
    // 	int count=0;
    // 	while(count <=255){
    // 		// System.out.println(count);
    // 		count++;
    // 		count += count;
    // 		System.out.println(count);
    // 	}

    // }
    // public void printSum1To255(){
    // 	int sum = 0;
    // 	for(int i = 0; i <=255; i++){
    // 		sum += i;
    // 	System.out.println(sum);
    // 	}

    // }

    // public void printArray(){
    // 	int[] myArrays = new int[] {1,3,5,7,9,13};
    // 		for(int i = 0; i < myArrays.length; i++){
    // 			System.out.println(myArrays[i]);
    // 		}
    // }
    // public void findMax(int[] myArrays){
    	
    // 	int max = myArrays[0];
    // 	// int maxi = myArrays[i];
    // 	for(int i = 0; i < myArrays.length; i++){
    // 		if(myArrays[i] > max){
    // 			max = myArrays[i];
    // 		}
    // 	}
    // 	System.out.println(max);
    // }

    // public void getAvg(int[] myArrays){
    // 	int sum = 0;
    	
    	
    // 	for(int i = 0; i < myArrays.length; i++){
    // 		System.out.println("Value of i is: " +i);
    // 		// System.out.println("Sum before addition: " + sum);
    // 		sum += myArrays[i];
    // 		System.out.println("Sum After addition: " + sum);
    // 	}
    // 	float avg = sum / myArrays.length;
    // 	// System.out.println(sum);
    // 	System.out.println("Average is : " + avg);
    // 	// System.out.println(avg);
    // }



  public void oddArray(){
    ArrayList<Integer> myOddArrays = new ArrayList<Integer>();
      for(int i = 0; i <= 10; i++){
        if(i % 2 != 0){
          myOddArrays.add(i);

          // System.out.println(myOddArrays);

        }
       }
       System.out.println(myOddArrays);
  }


}