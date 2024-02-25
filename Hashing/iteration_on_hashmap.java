package Hashing;
import java.util.*;
public class iteration_on_hashmap {
    public static void main (String[]args){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Tea",20);
        hm.put("Coffee",25);
        hm.put("Pizza",200);
        hm.put("Sandwich",150);
        hm.put("Noodles",100);
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key = "+k+" , value = "+hm.get(k));
        }
    }
}
