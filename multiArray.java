package com.democardla.java;

/**
 * 二维数组使用
 */
public class multiArray {
    public static void main(String[] args) {
        //声明&初始化
        int[][] arr1 = new int[][]{{1,2,3},{2,3,4},{3,4}};
        int[][] arr2 = new int[3][2];//行：列//行必须要写，列可以不写
        int[][] arr3 = new int[3][];

        //输出指定位置的元素//定行定列
            //输出arr3的元素
        arr3[1]= new int[4];//指定行(row)数组位置链接,即第2行的数据从新建的4元素的数组中找
        System.out.println(arr3[1][3]);//

        //多元数组的长度：是最高级数组集合的元素数
        System.out.println(arr1.length);//输出3

        //遍历二维数组：嵌套循环遍历
        //默认初始化值：
        System.out.println(arr2);//输出地址值:[[I@372f7a8d//二维数组Int型+位置
        System.out.println(arr2[0]);//外层数组的初始化值是地址，内层的是数据类型
        System.out.println(arr3[0]);//因为列未被指定，因此输出null
        System.out.println(arr3);//二元数组

        //内存解析：




    }
}
