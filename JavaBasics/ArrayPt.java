import java.util.ArrayList;

// import sun.security.util.Length;

public class ArrayPt{
    
    // public ArrayList<String> myBookList = new ArrayList<String>();

    ArrayPt(){};

    public void getValues(){
        String[] myList = {"Books", "Pens", "Penciles", "Computers"};
        int[] myQty = {1,2,3,45,6,78,99,333};

        int max =0;
        int min =0;
        for(int i=0; i < myQty.length; i++){
            if(myQty[i] > max){
                max = myQty[i];
            }else if(myQty[i] > min){
                min = myQty[i];
            }
        }
        System.out.println("Maxium value is: "+max);
        System.out.println("Minimum value is: "+min);




    }

    

   
























/*

    public void getVals(){
            /*
            String[] bookList;
            bookList = new String[10];
            int[] qty = new int[10];

            bookList[0] = "Computer Science";
            bookList[1] = "Java Fundamentals";

            qty[1] = 1;
            qty[0] = 10;

            System.out.println(bookList);
            System.out.println(bookList[0]);
            System.out.println(bookList[1]);
            System.out.println(qty[1]);
        
        String[] myList = {"books", "pens", "whiteboards", "erraser"};
        int[] qty = {1,2,3,4,5,7,8};
        int l = qty.length;

        // System.out.println(myList[1]);
        // System.out.println(qty[0]);
        // System.out.println(l);
        for(int i=0; i < myList.length; i++){
            System.out.println(myList[i]);
        }
        for(int number: qty){
            System.out.println(number);
        }
    
        for(String names: myList){
            System.out.println(names);
        }


        int counter =0;
        int counterb = 0;
        for(int i=0; i < myList.length; i++){
            System.out.println(myList[i]);
            counterb++;
            ++counter;
        }
        System.out.println(counter);
        System.out.println(counterb);
    
    
    
    }
*/


}//class