package com.democardla.java;

import java.util.Arrays;

public class ArraysTest {
    //工具类：用来执行操作的类，一般使用***s来代表或者***util ->我们在该类下面定义***的方法，相当于方法的集合
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,3,2,4};

        //equals()  判断相等
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);//false

        //toString(int[] a)   输出数组信息
        System.out.println(Arrays.toString(arr1));//[1,2,3,4]

        //fill(int[] a,int val)     将指定的值填充到数组中，使其替换所有元素的原始值
        //sort(int[] a )
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //binarySearch(int[] a, int key)    查找值并返回它在数组中的索引
        int index = Arrays.binarySearch(arr1, 10);
        System.out.println(index);//找到了：0，未找到：负数
            //但是它没有办法来查找string






    }
}
