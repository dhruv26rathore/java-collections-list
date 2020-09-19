package com.Collection.java;
import java.util.LinkedList;
// get first and last element from link list
public class list19 {
    public static void main(String[]args){
        LinkedList<String> list_Strings = new LinkedList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        System.out.println(list_Strings);
        String a = list_Strings.peekFirst();
        String b = list_Strings.peekLast();
        System.out.println(a);
        System.out.println(b);
        System.out.println(list_Strings);
    }
}
