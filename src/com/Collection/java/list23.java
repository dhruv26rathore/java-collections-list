package com.Collection.java;
import java.util.LinkedList;
//check whether the list is empty or not
public class list23 {
    public static void main(String[]args) {
        LinkedList<String> list_Strings = new LinkedList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        System.out.println(list_Strings);
        System.out.println(list_Strings.isEmpty());
        list_Strings.clear();
        System.out.println(list_Strings.isEmpty());
    }
}