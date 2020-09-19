package com.Collection.java;
import java.util.LinkedList;
//Insert elements into the linked list at the first and last position
public class list6 {
    public static void main(String[]args){
        LinkedList<String> list_Strings = new LinkedList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        System.out.println(list_Strings);
        list_Strings.addFirst("Aashish");
        list_Strings.addLast("Mehul");
        System.out.println(list_Strings);
    }
}
