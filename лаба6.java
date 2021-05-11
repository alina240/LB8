package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение x");
        int a = in.nextInt();
        System.out.println("Введите значение a");
        int x = in.nextInt();
        System.out.println("Введите значение b");
        int b = in.nextInt();
        System.out.println("Введите значение c");
        int c = in.nextInt();
        System.out.println("Введите значение x нач.");
        int xнач = in.nextInt();
        System.out.println("Введите значение x кон.");
        int xкон = in.nextInt();
        if (x < 1 && c != 0) {
            double fx = a * Math.pow(x, 2)+b/c;
        } else if (x > 15 && c == 0) {
            double fx = (x-a) / Math.pow((x * c),2);
        } else {
            System.out.println(x);
        }
        in.close();
    }