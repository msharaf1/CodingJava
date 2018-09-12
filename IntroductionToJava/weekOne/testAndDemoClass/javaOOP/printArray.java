import java.util.ArrayList;

public class printArray {
    private ArrayList<String> myList = new ArrayList<String>();

    public printArray(String[] name){
        for(int i = 0; i < name.length; i++){
            this.myList.add(name[i]);
        }
    }

    public void printList(){
        for(int i = 0; i < this.myList.size(); i++){
            System.out.println(this.myList.get(i));
        }
    }
}