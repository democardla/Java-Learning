package com.democardla.java;

public class PrimeNumberTest {
    public static void main(String[] args) {
        circulation1:for (int i = 2;i <= 100; i++){//循环标签
            if (i == 2){
                System.out.println(i);
                continue;//结束单次循环
            }

            boolean isFlag = true;
            for (int j = 2;j <= Math.sqrt(i);j++){
                if (i%j == 0){
                    isFlag = false;
                    //break circulation1;//结束circulation1//结束标签循环
                    break;//结束当前所有循环
                }
            }
            if (isFlag)
                System.out.println(i);
        }
    }
}
