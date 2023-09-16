package ConditionsAndLoops;

import java.util.Scanner;
//Напишите программу, которая считывает последовательность целочисленных значений из стандартного ввода и выводит максимальное из них.
//Подробности:
//Вы должны считывать значения последовательности, пока следующее не станет 0. Нулевое значение означает конец входной последовательности и не является ее элементом.
//Последовательность гарантированно содержит хотя бы одно значение.
public class SequenceMAX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int max = Integer.MIN_VALUE; //присвоено минимальное число которе содержит int, можно задать и конкретное. Например: 1
        while (true){ // цикл выполняется бесконечно пока не наткнется на условие выхода
            x = scanner.nextInt(); // ввод в строку любых целых чисел через пробел
            if (x==0){break;}; // условие выхода из цикла
            if (x >=max){max=x;}; //условие замены max на x, каждое новое число x, которе больше max записывается как max
        }
        System.out.println(max);
    }
}
