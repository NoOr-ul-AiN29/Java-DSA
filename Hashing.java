package dsa1;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(5);

        if(set.contains(5)) {
            System.out.println("Contains 5");
        }
        set.remove(5);

        if(!set.contains(5)) {
            System.out.println("Not contains 5");
        }
        //size
        System.out.println("Size of set: " + set.size());
        //printing whole set
        System.out.println(set);
        //Iterator
        Iterator it=set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }



    }

}
