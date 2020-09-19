package com.Collection.java;
import java.util.LinkedList;
// update the element value
public class list24 {
    public static void main(String[]args){
        LinkedList<String> list_Strings = new LinkedList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        System.out.println(list_Strings);
        list_Strings.set(1,"Rudra");
        System.out.println(list_Strings);
    }
}