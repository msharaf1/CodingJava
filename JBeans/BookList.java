import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// import com.sun.java.util.jar.pack.ConstantPool.Entry;

public class BookList {
    ArrayList<String> bookList = new ArrayList<String>();

    HashMap<String, String>  userMap = new HashMap<String, String>();
    HashMap<Integer, String>  bookMap = new HashMap<Integer, String>();
    

    public BookList(){}

    // public void setBookMap(HashMap<Integer, String>  bookMap ){
        
    //     this.bookMap = bookMap;
    // }

    public void setBookMap(Integer key, String value) {
        this.bookMap.put(key, value);
    }

    public HashMap<Integer, String>  getBookMap(){
        // Get the keys:
        for(Integer key: bookMap.keySet()){
            System.out.println(key);
        }
        //Get the values
        for(Object values: bookMap.values()){
            System.out.println(values);
        }
        //Get Both
        for(Entry<Integer, String> entry : bookMap.entrySet()) {
            System.out.println("BookIDNumber: " + entry.getKey() + " AuthorName: " + entry.getValue());
        }
        
        return this.bookMap;
    }


}