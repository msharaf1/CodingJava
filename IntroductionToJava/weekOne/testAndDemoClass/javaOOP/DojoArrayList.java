import java.util.ArrayList;
import java.util.List;

public class DojoArrayList{
    public ArrayList myList(){
    ArrayList<Object> list = new ArrayList<Object>();
        list.add(10);
        list.add("Apple");
        list.add(new ArrayList<Integer>());
        // list.add(new Double(12.0));
        // list.add(new Float(12.5));

        return list;
    }

}