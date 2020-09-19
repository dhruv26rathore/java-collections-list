package com.Collection.java;
import java.util.LinkedList;
//add two lists
public class list16 {
    public static void main(String[]args) {
        LinkedList<String> list_Strings = new LinkedList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        System.out.println(list_Strings);
        LinkedList<String> list_Strings2 = new LinkedList<String>();
        list_Strings2.add("Aashish");
        list_Strings2.add("Praveen");
        list_Strings2.add("Tarun");
        list_Strings2.add("Vijay");
        list_Strings2.add("Lakshya");
        list_Strings2.add("Deepak");
        System.out.println(list_Strings2);
        LinkedList<String> a = new LinkedList<String>();
        a.addAll(list_Strings);
        a.addAll(list_Strings2);
        System.out.println(a);
    }
}
