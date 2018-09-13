import java.util.*;

public class HashMapPt{
    public static void main(String[] args){
        HashMap<String, String> userMap = new HashMap<String, String>();

        userMap.put("James@cooperson.com", "James Cooper");
        userMap.put("John@underscon.com", "John Anderson");

        String name = userMap.get("James@cooperson.com");

        System.out.println(name);
        //get the keys

        Set<String> keys = userMap.keySet();
        for(String key: keys){
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
    }
}