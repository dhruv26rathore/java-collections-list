package com.Collection.java;
import java.util.LinkedList;
//check that element is present in the list or not
public class list20 {
    public static void main(String[]args){
        LinkedList<String> list_Strings = new LinkedList<String>();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        System.out.println(list_Strings);
        if (list_Strings.contains("Dhruv")){
            System.out.println("yes its present");
        }
        else{
            System.out.println("not found");
        }
    }
}
