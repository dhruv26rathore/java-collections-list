package com.Collection.java;
import java.util.Collections;
import java.util.LinkedList;
//Swap two elements
public class list14 {
    public static void main(String[]args) {
        LinkedList<String> list_Strings = new LinkedList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        System.out.println(list_Strings);
        Collections.swap(list_Strings,0,3);
        System.out.println(list_Strings);
    }
}
