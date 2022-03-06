package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = ((int) (Math.random() * 40));

        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int max = array[0];
        int med = 0;
        int sum = 0;
        for (int i : array) {
            if (max < i)
                max = i;
            if (min > i)
                min = i;
            med += i / array.length;
            sum = sum + i;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("med = " + med);
        System.out.println("sum = " + sum);

    }

}

