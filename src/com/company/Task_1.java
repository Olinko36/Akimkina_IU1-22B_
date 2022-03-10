package com.company;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Задание 1. Программа проверяет является ли введенное число числом Фибоначчи.");
        System.out.println("Введите число");
        int x = input.nextInt();
        int a = 0;
        int b = 1;
        int c = a + b;
        boolean bool = false;
        if (x == a){
            System.out.println("Число является числом Фибоначчи");
        }
        else if (x == b){
            System.out.println("Число является числом Фибоначчи");
        }
        else {
            int i = x;
            while (i > 0){
                i --;
                a = b;
                b = c;
                c = a + b;
                if (x == c){
                    bool = true;
                    i = 0;
                }
                else {
                    bool = false;
                }
            }
            if (bool){
                System.out.println("Число является Фибоначчи");
            } else {
                System.out.println("Число не является числом Фибоначчи");
            }
        }
    }
}