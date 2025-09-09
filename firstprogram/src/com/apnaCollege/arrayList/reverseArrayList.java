package com.apnaCollege.arrayList;
import java.util.*;
public class reverseArrayList {
    public static void reverseList(ArrayList<Integer> list){
    int i=0 ,j=list.size()-1;
    while(i<j){
        Integer temp=Integer.valueOf(list.get(i));
        list.set(i,list.get(j));
        list.set(j,temp);
        i++;
        j--;
    }
    }
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        l.add(0);
        l.add(10);
        l.add(3);
        l.add(5);
        l.add(22);
        l.add(10);
        System.out.println("Oroinal list "+l);
       // reverseList(l);
        Collections.reverse(l);
        System.out.println("reverse list "+l);
        Collections.sort(l);
        System.out.println("Acending order "+l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("decending order"+l);

        ArrayList<String> l1=new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");
        System.out.println("original list "+l1);
        Collections.sort(l1);
        System.out.println("lexicographically order"+l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("reverse lexicographically order "+l1);

    }
}
