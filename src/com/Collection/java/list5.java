package com.Collection.java;
import java.util.LinkedList;
// insert at specified position specified element
public class list5 {
    public static void main(String[]args){
        LinkedList<String> list_Strings = new LinkedList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        System.out.println(list_Strings);
        list_Strings.add(1,"Aayush");
        System.out.println(list_Strings);
    }
}
