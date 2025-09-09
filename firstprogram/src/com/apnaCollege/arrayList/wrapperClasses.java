package com.apnaCollege.arrayList;

import java.util.ArrayList;

public class wrapperClasses {
    public static void main(String[] args) {
//        Integer i=Integer.valueOf(4);  // wrapper classes
//        System.out.println(i);
//        Float f=Float.valueOf(4.3f);
//        System.out.println(f);
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        // print element at index 1
        //System.out.println(l1.get(1));

        // print array list using loop
        /*
        for(int j=0;j<l1.size();j++){
            System.out.print(l1.get(j)+" ");
        }

         */

        // print array list directly
        //System.out.println(l1);     // [ 5 6 7 8 ]

        // adding element at index i
        l1.add(1, 100);
        //System.out.println(l1);   // [5 100 6 7 8]

        // modify element at index i
        l1.set(1, 10);
        //System.out.println(l1); //[ 5 10 6 7 8]

        // removing element at i index
        l1.remove(1);
        // System.out.println(l1);  // [5 6 7 8]

        // removing element e
        boolean res=l1.remove(Integer.valueOf(7));
        //System.out.println(res);
        //System.out.println(l1);  // [5 6 7 ]

        // checking if an elements exist in array or not
        boolean ans = l1.contains(Integer.valueOf(6));
        //System.out.println(ans);

        // if you don't specify class , you can put anything inside
        ArrayList l= new ArrayList();
        l.add("hello");
        l.add( 10);
        l.add(true);
        System.out.println(l);



    }
}
