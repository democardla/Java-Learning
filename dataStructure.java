package com.democardla.java;

public class dataStructure {
    /**
     * 1数据与数据之间的逻辑关系：集合，一对一，多对多，一对多
     * 2数据的储存结构：
     *  线性表：顺序表（数组），链表，栈，队列
     *  树形结构：
     *  图形结构：
     * 3算法：
     *  排序
     *  搜索
     */
    public static void main(String[] args) {//杨辉三角
        int[][] yanghui = new int[10][];
        for (int i = 0;i< yanghui.length;i++){
            yanghui[i] = new int[i+1];//不要忘记初始化多元数组的元素值
            yanghui[i][0] = yanghui[i][i] = 1;
            if (i>1){
                for (int j = 1;j<i;j++){
                    yanghui[i][j] = yanghui[i-1][j]+yanghui[i-1][j-1];
                }
            }
        }
        for (int i=0;i < yanghui.length;i++){
            for (int j = 0;j<=i;j++){
                System.out.print(yanghui[i][j] + ",");
            }
            System.out.println();
        }


    }
}
