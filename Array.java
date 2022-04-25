package com.democardla.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组的要素：
 * 1数组的元素
 * 2数组的名称
 * 3使用编号来进行管理：index
 * 4数组的长度
 *
 * 数组的特点：
 * 1数组是有序的
 * 2数组是属于引用数据类型的，数组的元素是可以为引用数据类型，也可以是基本数据类型
 * 3数组的长度一旦固定，便不能被修改了
 *
 * 数组的分类：
 * 1维度：
 * 2数组元素的类型：
 */
public class Array {
    public static void main(String[] args) {
        //一维数组的声明与初始化
        int[] ids;//声明

            //数组的初始化和数组元素的初始化同时进行，即当你指定数组中的元素是什么的时候，数组的大小便固定了
            // 静态初始化
        ids = new int[]{1001,1002,1003,1004};
        List list = new ArrayList(Arrays.asList(ids));
        if (list.contains(1001)){
            System.out.println("ture");
        }
            //数组的初始化和数组元素的初始化不同时进行，即你先指定数组的大小，后来再指定里面的元素是什么
            //动态初始化
        String[] myString = new String[4];
        myString[0] = "hello";//初始化元素
            //类型推断
        int[] arr3 = {1,2,3,4};//当初始化数组和初始化数组元素声明在同一行时，这样编写可以运行


        //调取特定位置的值

        int outcome = ids[0];
        System.out.println(outcome);

        //获取数组的长度

        System.out.println(myString.length);

        //遍历数组

        for (int i=0;i< myString.length;i++){
            System.out.println(myString[i]);
        }

        //数组元素的默认初始化值

        System.out.println(myString[2]);//默认为null
            //整型：0
            //布尔：false
            //浮点型：0.0
            //char：0 (ASCIIcode)//不过在idea里面好像不是这样
            //引用数据类型时：字符串：null
        char[] myChar = new char[4];

        System.out.println(myChar[0]);

        //数组的内存解析


        //关于数组的复制
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 ;
        arr2 = arr1;//这个不是复制一遍数组，而是将储存位置的值赋给arr2
        System.out.println(arr2);
        //数组的反转
        for (int i = 1;i<=arr1.length/2;i++){
            arr1[i-1] = arr1[i-1] ^ arr1[arr1.length-i];
            arr1[arr1.length-i] = arr1[i-1] ^ arr1[arr1.length-i];
            arr1[i-1] = arr1[i-1] ^ arr1[arr1.length-i];

        }
        for (int i = 0;i < arr1.length;i++){
            System.out.println(arr1[i]);
        }

        //查找
            //线性查找：数组中的线性查找
        String[] stringarr = new String[]{"aa","ss","dd","ff"};
        String trager = "dd";
        for (int i = 0;i<stringarr.length;i++){
            if (trager.equals(stringarr[i])){//类似swift的contains()用法
                System.out.println("find it");
            }
        }
            //二分法查找


    }
}
