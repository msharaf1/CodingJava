import java.util.ArrayList;

class Basics{
    
    public void greatherThanY(){
        System.out.println("Test");
        // ArrayList<Integer> myArrays = new ArrayList<Integer>();
        int myArrays = new int[]{3, 4, 5,6, 8};
        int y = 3;
        int total = 0;

        for(int i = 0; i < myArrays; i++){
            if(i < y){
                total +=i;
            }
        }
        System.out.print(total);
    }

}