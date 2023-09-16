package ConditionsAndLoops;

import java.util.Scanner;
//Дано следующее условие: улитка поднимается по дереву на a метров в день. Затем каждую ночь улитка сползает вниз на b метров. Высота дерева — h метров.
//Напишите программу с подсчетом количества дней, которые потребуются улитке, чтобы добраться до вершины дерева.
//Программа читает a, b, h построчно. Входные значения гарантированно являются положительными целыми числами.
//Если улитка не может добраться до вершины дерева, должно выводиться сообщение: Никогда.
public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Улитка поднимается по дереву на a метров в день, введите переменную а");
        int a = Math.abs(scanner.nextInt());
        System.out.println("Каждую ночь улитка сползает вниз на b метров, введите переменную b");
        int b = Math.abs(scanner.nextInt());
        System.out.println("Высота дерева — h метров, введите переменную h");
        int h = Math.abs(scanner.nextInt());
        int i = 0;
        if (a >= h) { int c = 1;
            System.out.println(c);}
        else if (a - b <= 0) {
            System.out.println("Никогда");}
        else {
            int c = 0;
            while (i+a<=h){
                i=i+a-b;
                c = c+1;
            }
            System.out.println(c);
        }
    }
}