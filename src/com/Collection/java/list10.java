package com.Collection.java;
import java.util.LinkedList;
//get the value with thier respective index number
public class list10 {
    public static void main(String[]args){
        LinkedList<String> list_Strings = new LinkedList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        System.out.println(list_Strings);
        for(int p=0; p < list_Strings.size(); p++)
        {
            System.out.println("Element at index "+p+": "+list_Strings.get(p));
        }
    }
}