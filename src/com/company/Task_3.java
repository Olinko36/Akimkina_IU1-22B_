package com.company;

import java.util.Scanner;

public class Task_3 {
    public static double F(double x) {
        return Math.pow(x, 5)/5 + Math.pow(x, 3)/3 + Math.pow(x, 2)/2 - 7*x;
    }
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Задание 3. Программа находит площадь под графиком функции  f(x) = x^4 + x^2 + x - 7 на интервале от a до b. ");
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        double a = input.nextInt();
        System.out.print("b = ");
        double b = input.nextInt();
        F(a);
        F(b);
        double otvet = F(b) - F(a);
        System.out.println("Answer: " + otvet);
    }
}