import java.util.ArrayList;

public class testArrayListTest{

    public static void main(String[] args){
        
        System.out.println("Test");

        String[] name = new String[]{"Jason", "Tim", "Kim", "Kimber"};
        
        printArray printThis = new printArray(name);
        printThis.printList();

        // printArray myArray = new printArray();
        // myArray.printList();
    //     myArrayStrings.printList(names);
    }

    public static void printList(String[] name){
        for(int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
            // return myList;
    }
}