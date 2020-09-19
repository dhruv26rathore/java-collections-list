package com.Collection.java;
import java.util.LinkedList;
//clone the link list
public class list17 {
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
        list_Strings2 = (LinkedList) list_Strings.clone();
        System.out.println(list_Strings2);
    }
}