package Hashes;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        //country(key), population(value)
        HashMap<String, Integer> maps = new HashMap<String, Integer>();

        maps.put("India", 1234544);
        maps.put("China", 1234333);
        maps.put("USA", 123454);
        maps.put("UK", 123454);

//        System.out.println(maps);
//        maps.put("China", 123433334);
//        System.out.println(maps);
//
//        //Search Operation
//
//        if(maps.containsKey("China")){
//            System.out.println("Key is present");
//        }else{
//            System.out.println("Not present");
//        }
//        if(maps.containsKey("Sweden")){
//            System.out.println("Key is present");
//        }else{
//            System.out.println("Not present");
//        }
//
//        System.out.println(maps.get("China"));
//        System.out.println(maps.get("Sweden"));
//
//        //Iteration in hashmap
//
//         int[] arr = {12,13,14};
//         for (int i=0;i<3;i++){
//             System.out.print(arr[i]+ " ");
//         }
//        System.out.println();
//
//         for(int num:arr){
//             System.out.print(num+" ");
//         }
//        System.out.println();
         for(Map.Entry<String, Integer> e:maps.entrySet()){
             System.out.println(e.getKey());
             System.out.println(e.getValue());
         }
    }
}
