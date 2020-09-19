package com.Collection.java;
import java.util.Iterator;
import java.util.LinkedList;
//iterate in reverse order
public class list4 {
    public static void main(String[]args){
        LinkedList<String> list_Strings = new LinkedList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        Iterator p = list_Strings.descendingIterator();
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}
