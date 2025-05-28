package dsa1;
import java.util.*;

public class HashMapp {
    //key and value pairs
    //key is always unique
    public static void main(String[] args) {

        HashMap<String,Integer> hm = new HashMap<>();
        //Insertion
        hm.put("one",1);
        hm.put("two",2);
        hm.put("three",3);
        //unordered maps ... prints in unordered foam
        System.out.println(hm);

        hm.put("one",2);//updates the value

        System.out.println(hm);

        //search contains returns boolean
        if(hm.containsKey("one")){
            System.out.println("Contains one");
        }
        System.out.println(hm.get("one")); //prints the value of this key
        //hm.get any key that does not exist then it will print null


        //Iteration using for each loop
        for(Map.Entry<String,Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        // .keySet gives all the keys
        Set<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key+" "+hm.get(key));
        }
        //removing a pair
        hm.remove("one");
        System.out.println(hm);
    }
}
