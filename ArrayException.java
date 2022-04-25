package com.democardla.java;

public class ArrayException {
    //数组异常
    public static void main(String[] args) {
        //数组脚标越界异常
        //空指针异常
        int[] arr1 = new int[]{1,2,3,4,5,6,7};

            //情况1：
//        arr1 = null;//这里删除了这个数组
//        System.out.println(arr1[0]);//因此空指针报错：java.lang.NullPointerException

            //情况2：
        int[][] arr2 = new int[4][];
        //System.out.println(arr2[1][0]);//空指针报错
        System.out.println(arr2[1]);//无引用变量，输出null
        int[] arr3 = new int[]{1,2,3,4,5,6};
        arr2[1] = arr3;
        System.out.println(arr2[1]);//现在有引用变量，输出被引用的成员的地址值：因为被引用的是一维数组，因此输出[I@372f7a8d
        System.out.println(arr2[1][0]);//现在不报错了

            //情况3：调用变量时，发现变量是null
        String[] stringArr = new String[]{"1","2","3","4",null};
        //System.out.println(stringArr[4].toString());//空指针报错：Cannot invoke "String.toString()" because "stringArr[4]" is null
        System.out.println(stringArr[4]);//不报错：输出null
    }
}
