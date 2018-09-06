import java.util.ArrayList;
import java.util.List;

public class LoopPt{
    public ArrayList LoopPtFuc(){
        ArrayList<String> dynamicArray = new ArrayList<String>();
            dynamicArray.add("Hello");
            dynamicArray.add("World");
            dynamicArray.add("etc");

                for(int i = 0; i<dynamicArray.size(); i++){
                    System.out.println(dynamicArray.get(i));
                }
            
                for(String name : dynamicArray){
                    System.out.println("hello "+ name);
                }//this similar to the following line.
                for(String i : dynamicArray){
                    System.out.println("hello "+ i);
                }
            return dynamicArray;

            

    }
}