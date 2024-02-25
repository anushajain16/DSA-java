package Hashing;
import java.util.HashMap;
public class hashmap {
    public static void main(String[]args){
        //Create hashmap
        HashMap<String,Integer> hm = new HashMap<>();

        //put - O(1)
        hm.put("Anusha", 92);
        hm.put("Dhyey",54);
        hm.put("Shalvi",215);

        System.out.println(hm);

        //get - O(1)
        int enrolno1 = hm.get("Anusha");
        System.out.println(enrolno1); 
        System.out.println(hm.get("Daksh")); // Returns null if the key is absent

        //containsKey - O(1)
        System.out.println(hm.containsKey("Dhyey")); //Returns true if key is present
        System.out.println(hm.containsKey("Mahi")); //Returns false if key is absent

        //remove - O(1)
        hm.remove("Malav");
        System.out.println(hm); //Returns same hashmap if the key was absent

        hm.remove("Shalvi");
        System.out.println(hm); //Removes the key from the hashmap

        //size - O(1)
        System.out.println(hm.size()); //Returns the number of keys in the hashmap

        //isEmpty - O(1)
        System.out.println(hm.isEmpty()); // Returns true if hashmap is empty
    }
}
