package org.springboot.Common.SortUtil;

import org.jetbrains.annotations.NotNull;

import java.lang.System;
import java.util.Scanner;

public class SortExample {
    public static void main(String[] args) {
//        sortByMaoPao();
        System.out.println("请输入一串需要排序的数字，并用空格隔开：");
//        System.out.println("从键盘上输入数字并用空格隔开");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        try {
            if (inputString.startsWith(" ") || inputString.endsWith(" ")) {
                throw new Exception("输入不规范！");
            }
            String[] stringArray = inputString.split(" ");
            int[] num = new int[stringArray.length];
            for (int i = 0; i < stringArray.length; i++) {
                num[i] = Integer.parseInt(stringArray[i]);
//            System.out.println(stringArray[i]);
            }
            sortByMaoPao(num);
        } catch (Exception e) {
            //打印输出异常
            e.printStackTrace();
        } finally {
            System.out.println("排序结束");
            System.out.println("---------------------------------------");
        }

    }

    /**
     * 冒泡排序法
     */
    private static void sortByMaoPao(int @NotNull [] num) {
        /* 定义一个数组和三个整型变量 */
        //int[] num = {46, 65, 87, 15, 23, 46, 48, 52, 79, 97, 53};

        int temp;
        /* 冒泡排序法 */
        for (int i = 0; i < num.length - 1; i++) {
            boolean flag = false;
            for (int j = num.length - 1; j > i; j--)
                if (num[j - 1] >= num[j]) {
                    temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                    flag = true;
                }
            if(flag == false)
                return;
        }

        /* 循环输出排序后的结果 */
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    /**
     * 冒泡排序法
     */
    private static void sortByHeBing() {
        /* 定义一个数组和二个整型变量 */
        int[] num = {65, 87, 15, 23, 46, 48, 52, 79, 97, 53};
        int i, j;
        /* 合并排序法 */
        for (i = 0; i < 9; i++)
            for (j = i + 1; j < 10; j++) {
                if (num[i] > num[j]) {
                    num[i] = num[i] + num[j];
                    num[j] = num[i] - num[j];
                    num[i] = num[i] - num[j];
                }
            }
        /* 循环输出排序后的结果 */
        for (i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }
        System.out.println("---------------------------------------");
    }

    /**
     * 冒泡排序法
     */
    private static void sortByCharu() {
        /* 定义一个数组和三个整型变量 */
        int[] num = {65, 87, 15, 23, 46, 48, 52, 79, 97, 53};
        int i, j, temp;
        /* 插入排序法 */
        for (i = 1; i < 10; i++) {
            temp = num[i];
            for (j = i; j > 0 && temp < num[j - 1]; j--)
                num[j] = num[j - 1];
            num[j] = temp;
        }
        /* 循环输出排序后的结果 */
        for (i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }
        System.out.println("---------------------------------------");
    }

}
