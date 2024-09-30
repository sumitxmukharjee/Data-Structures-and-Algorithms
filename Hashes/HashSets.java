package Hashes;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        // set is a data structure that does not allow duplicates
        // Just like we have studies in maths class
        // and this same property is known as HashSet in java

//        Insert/Add = O(1)
//        Search/ Contains = O(1)
//        Delete/ Remove = O(1)
        HashSet<Integer> set = new HashSet<Integer>();

        //Insert
        set.add(122);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4); //list.add(el)

        System.out.println(set);

        //size

        System.out.println("Size of set is "+ set.size());

        //Search/ Contaisn
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Does not contain 6");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Does not contains 1");
        }

        //iterator
        Iterator it = set.iterator();
        System.out.println(it);

        //next() -  first value is null in iterator
        System.out.println(it.next());
        System.out.println(it.next());
        //hasNext;
        //returns true or false if there is value

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
