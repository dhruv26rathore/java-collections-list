package com.Collection.java;
import java.util.LinkedList;
// Remove the respective element
public class list11 {
    public static void main(String[]args) {
        LinkedList<String> list_Strings = new LinkedList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        System.out.println(list_Strings);
        list_Strings.remove(1);
        System.out.println(list_Strings);
    }
}
