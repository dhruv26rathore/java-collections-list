package com.Collection.java;
import java.util.LinkedList;
//iterate all the elements of the list
public class list2 {
    public static void main(String[]args){
        LinkedList<String> list_Strings = new LinkedList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        for (String element : list_Strings) {
            System.out.println(element);
        }
    }
}
