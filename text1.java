package com.democardla.java;

public class text1 {
    public static void main(String[] args) {
        int i = 3;
        int[][] myArr = new int[i][i];
        int x = 0,y = 0;
        System.out.println(x++);
        System.out.println(++y);
        for (int j = 1;j<=i*i;j++){
           for (int z = 1;z<3;z++){
               
           }
        }
        for (int j = 0;j< myArr.length;j++){
            for (int e = 0;e<myArr[j].length;e++){
                System.out.print(myArr[j][e] + ",");
            }
            System.out.println();
        }
    }
}
