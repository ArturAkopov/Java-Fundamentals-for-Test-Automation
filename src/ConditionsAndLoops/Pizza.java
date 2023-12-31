package ConditionsAndLoops;

import java.util.Scanner;
//Напишите программу, которая должна прочитать два значения из System.in:
//количество людей
//количество кусочков в одной пицце.
//Гарантируется, что входные параметры — целые положительные числа.
//Программа должна напечатать минимальное количество пицц (не ноль), которое надо заказать, чтобы у всех было одинаковое количество ломтиков и не осталось ни одного лишнего.
public class Pizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value; //количество человек
        int piece; //кол-во кусков в одной пицце
        do { //задаем условие и цикл, выбираем do while для того, что бы хотябы 1 раз условие выполнялось, на случай, если количество кусков и человек равно сразу.
            piece = Math.abs(scanner.nextInt()); // читаем первую переменную из консоли по модулю
            value = Math.abs(scanner.nextInt()); // читаем вторую переменную из консоли по модулю
            piece=piece+piece; // условие увеличения количества кусков каждый цикл
            }
        while (piece%value != 0); //условие работы цикла (true), когда число кусков поделиться на число человек без остатка цикл прекратиться.
        int pizza = piece/value; // считаем коли-во пицц куски(значение после всех циклов) / кол-во человек
        System.out.println(pizza); // выводим на экран количество необходимых пицц, что бы на всех человек было одинаковое количество кусков
    }
}
