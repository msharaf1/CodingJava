import java.util.ArrayList;
import java.util.*;

// import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Puzzling{
    
    // public ArrayList<Integer> numbers;
    public Puzzling(){}; //Empty constructor.

        public void getValue(){
            ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(3,5,1,2,7,9,8,13,25,32,50));
            int counter = 0;
            int sum =0;
            ArrayList<Integer> gtn10 = new ArrayList<Integer>();
            
            for(int i =0; i < numbers.size(); i++){
                // System.out.println(numbers.get(i));
                sum += numbers.get(i);
                counter++;
                if(numbers.get(i) > 10){
                    gtn10.add(numbers.get(i));
                    
                }

            }
            System.out.println("counter is: "+(counter));
            System.out.println("sum is: "+(sum));
            System.out.println("Numbers greater than 10 are: "+(gtn10));

        }

    // public void getValue(){
    //     ArrayList<Integer> numbers = new ArrayList<Integer>();
    //     numbers.add(5);
    //     numbers.add(4);
    //     numbers.add(3);
    //     numbers.add(2);
    //     numbers.add(1);
    
    //     // System.out.println(numbers);
    //     Collections.shuffle(numbers);
    //     // System.out.println(numbers);
    //     Collections.sort(numbers);
    //     // Collections.sort(numbers);
    //     // System.out.println(numbers);

    //     Random rand = new Random();
    //     int randFirst = rand.nextInt();
    //     // System.out.println(randFirst);
        
    //     int ranSecond = rand.nextInt(20)+10;
    //     // System.out.println(ranSecond);
    
    // int[] myNumbers = {3,5,1,2,7,9,8,13,25,32};
    // ArrayList<Integer> myArrTest = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
    // // myArrTest.addAll(3,5,1,2,7,9,8,13,25,32);
    // // System.out.println(myNumbers);
    // // System.out.println(myArrTest);

    
    
    
    
    // }//Get method
    
    
    
}//class