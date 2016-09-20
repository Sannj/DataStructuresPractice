package DataStructuresPractice;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by sanjanabadam on 9/20/16.
 */
public class TreeMapProg {
    public static void main(String[] args) {
        Map<Integer , String> days =
                new TreeMap<Integer,String>();
//TreeMap sorts the keys and then inserts into the map. If you print this; you'll get Monday at the end cz of key value.
        days.put(10, "Monday");
        days.put(2, "Tuesday");
        days.put(3, "Wednesday");
        days.put(4, "Thursday");
        days.put(5, "Friday");
        days.put(6, "Saturday");
        days.put(7, "Sunday");


// Check p r e s e n c e :
        assert (days.containsKey("Monday"));
        assert (!days.containsKey("abcd"));

// I t e r a t e key s i n o r d e r o f Comparable :
        for(Map.Entry<Integer, String> i : days.entrySet()) {
            int key = i.getKey();
            String value = i.getValue();
            System.out.println("Key : "+key + " Value : "+value);
        }

    }
}
