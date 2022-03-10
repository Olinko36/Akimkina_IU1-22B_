package com.company;

//enum - создание нового типа данных, который будет принимать то, что будет прописанно внутри него

import java.util.Random;
import java.util.Scanner;
import java.math.BigDecimal;

public class Task_2 {
    public static double F(double x) {
        return Math.pow(x, 3.0) - Math.pow(x, 2.5) + x - 1.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        double p = Double.MAX_VALUE;
//double mid = p/2;
//double x = random.nextDouble(1, p);
        for (double i = 0; i < p; i += 0.001){
            System.out.println(i);
            if (F((Math.round(i))) == 0){
                System.out.println("answer: " + i);
            }

        }
    }
}