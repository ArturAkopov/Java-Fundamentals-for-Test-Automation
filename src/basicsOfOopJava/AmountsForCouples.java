package basicsOfOopJava;/*Рассмотрите предлагаемый код.
Напишите программу, принимающую на вход последовательно по одному значению типа int, double и String.
Реализуйте класс basicsOfOopJava.Action таким образом, чтобы его метод sum возвращал корректные суммы для пар переменных, указанных в методе main для пар вводимых значений.
Sample Input:
2
4.5
Jan
Sample Output:
4
6.5
Jan2

import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        String c = sc.next();

        System.out.println(basicsOfOopJava.Action.sum(a, a));
        System.out.println(basicsOfOopJava.Action.sum(a, b));
        System.out.println(basicsOfOopJava.Action.sum(s, a));
	}
}

class basicsOfOopJava.Action {
    // Напишите свой код здесь
}
 */

import java.util.Scanner;

public class AmountsForCouples {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        String s = sc.next();

        System.out.println(Action.sum(a, a));
        System.out.println(Action.sum(a, b));
        System.out.println(Action.sum(s, a));
    }
}
class Action {
    public static int sum(int x, int y){
        return x+y;
    }
    public static double sum(int x, double y){
        return x+y;
    }
    public static String sum(String x, int y){
        return x+y;
    }
}