package com.Collection.java;
//Get the first and last occurrence of the specified elements
import java.util.LinkedList;
public class list9 {
    public static void main(String[]args) {
        LinkedList<String> list_Strings = new LinkedList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        System.out.println(list_Strings);
        Object fist_element= list_Strings.getFirst();
        Object last_element= list_Strings.getLast();
        System.out.println(fist_element);
        System.out.println(last_element);
    }
}
