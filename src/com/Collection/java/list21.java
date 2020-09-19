package com.Collection.java;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//Convert link list into array list
public class list21 {
    public static void main(String[]args){
        LinkedList<String> list_Strings = new LinkedList();
        list_Strings.add("Sumit");
        list_Strings.add("Dhruv");
        list_Strings.add("Rahul");
        list_Strings.add("Mukul");
        list_Strings.add("Abhishek");
        list_Strings.add("Amit");
        System.out.println(list_Strings);
        List<String> list = new ArrayList<String>(list_Strings);

        for (String str : list){
            System.out.println(str);
        }
    }
}
