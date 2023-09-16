package ConditionsAndLoops;

import java.util.Scanner;
//Напишите программу, которая считывает последовательность целочисленных значений из стандартного ввода и находит среднее значение.
//Подробности:
//Вы должны считывать значения последовательности, пока следующее не станет 0. Нулевое значение означает конец входной последовательности и не является ее частью.
//Последовательность гарантированно содержит хотя бы одно значение.
//Среднее значение также является целым числом. Используйте целочисленные операции.
public class SequenceAVG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int i = 0;
        int n = 0;
        while (true){
            x = scanner.nextInt();
            if (x==0) break;
            if (x!= 0) i=i+x;
            n++;
        }
        int sum = i/n;
        System.out.println(sum);
        }
    }

