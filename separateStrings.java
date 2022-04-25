package com.democardla.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class separateStrings {//commaSeparate
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String myString = myScanner.next();
        //String myString = "hello,world,";
//        char addition = 'c';
//        String outcomes = "";
//        outcomes = myString + addition;
//        System.out.println(outcomes);
        int thelengthOfString = myString.length();
        String theword = "";
        List<String> myList = new ArrayList<>();

        for (int i = 0;i < thelengthOfString;i++){
            char beingChecked = myString.charAt(i);
            if (beingChecked == ','){
                myList.add(theword);
                theword = "";
                continue;
            } else {
                theword = theword + beingChecked ;
            }
        }
        System.out.println(myList);
        String[] myArray = myList.toArray(new String[myList.size()]);//将列表list转化成数组
        System.out.println(myArray[0]);
    }
}
