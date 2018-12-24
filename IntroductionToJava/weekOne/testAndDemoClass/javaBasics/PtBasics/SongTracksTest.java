import java.util.*;
public class SongTracksTest{

    public static void main(String[] args){
        // System.out.println("hello");

        HashMap<String, String> userMap = new HashMap<String, String>();

        userMap.put("firstName", "James");
        userMap.put("lastName", "Mattis");
        userMap.put("job", "Singer");
        
        
        String FirstName = userMap.get("firstName");
        String LastName = userMap.get("lastName");
        String Job = userMap.get("job");
        // System.out.println("First name: "+ FirstName +", Last Name: "+ LastName +", Job: " +Job);
        

        Set<String> keys = userMap.keySet();
        // Set<String> values = userMap.get(keys);
        // Set<String> getValues = userMap.values(add);

        for(String key: keys){
            // System.out.println(key +": "+userMap.get(key));
            
        }

        HashMap<String, List<Integer>> songID = new HashMap<String, List<Integer>>();
        HashMap<String, List<String>> songsList = new HashMap<String, List<String>>();

        Integer[] trackRecord = {100,244,666,33};
        songID.put("Rock", Arrays.asList(trackRecord));

        List tRs = songID.get("Rock");
        // System.out.println(tRs);

        
        
        String[] listRockSongs = {"Jimi", "ColdWater", "AirLover","CrazyLove"};
        
        songsList.put("RockSongs", Arrays.asList(listRockSongs));
        // System.out.println(songsList.get("RockSongs"));

        for(int i=0; i < listRockSongs.length; i++){
            Integer sID = songID.get("Rock").get(i);
            String sL = songsList.get("RockSongs").get(i);
            System.out.println(sID +": " +sL);
        }




    }
}