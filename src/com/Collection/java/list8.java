package com.Collection.java;
import java.util.LinkedList;
//insert element at the specified position
public class list8 {
    public static void main(String[]args) {
        LinkedList<String> list_Strings = new LinkedList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        System.out.println(list_Strings);
        LinkedList <String> new_list_Strings = new LinkedList <String> ();
        new_list_Strings.add("Suryansh");
        new_list_Strings.add("Nilesh");
        list_Strings.addAll(1,new_list_Strings);
        System.out.println(list_Strings);
    }
}
