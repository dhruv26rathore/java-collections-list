package com.Collection.java;
import java.util.LinkedList;
//remove the first and last element
public class list12 {
    public static void main(String[]args) {
        LinkedList<String> list_Strings = new LinkedList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        System.out.println(list_Strings);
        Object First_Element = list_Strings.removeFirst();
        System.out.println(First_Element);
        Object Last_Element = list_Strings.removeLast();
        System.out.println(Last_Element);
        System.out.println(list_Strings);
    }
}