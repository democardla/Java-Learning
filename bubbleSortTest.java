package com.democardla.java;

public class bubbleSortTest {
    public static void main(String[] args) {
        //冒泡排序
            //普适性强
        int[] myintegers = new int[]{1,3,2,4,6,7,};
        for (int i = 0;i<myintegers.length-2;i++){//回合
            for (int j = 0;j<myintegers.length-i-2;j++){//组
                if (myintegers[j]>myintegers[j+1]){
                    int tmp = myintegers[j];
                    myintegers[j]=myintegers[j+1];
                    myintegers[j+1]=tmp;
                }
            }
        }//在第你回合中，分别对每一组相邻的数字进行比较，选出最大的放在数组末尾第你位作为第n大第数


        for (int i = 0;i<myintegers.length;i++){
            System.out.println(myintegers[i]);
        }
    }
}
