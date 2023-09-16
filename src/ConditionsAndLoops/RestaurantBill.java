package ConditionsAndLoops;

import java.util.Scanner;
//Дано следующее условие: компания друзей посещает ресторан. Они решили разделить счет поровну и добавить 10 процентов от общей суммы счета в качестве чаевых.
//Далее друзья равными частями покрывают общую сумму платежа.
//Напишите программу, которая считывает общую сумму счета и количество друзей, а затем выводит размер части оплаты.
//Рассмотрим некоторые детали:
//Программа должна читать данные из System.in
//Общая сумма счета не может быть отрицательной. Если введенное значение отрицательное, программа останавливается и печатает: Еда не так плоха, чтобы за ее поедание доплачивали
//Количество друзей не может быть отрицательным или нулевым. Если такое происходит, то программа останавливается и выводит: Кто здесь?!
//Общая сумма счета, количество друзей и часть к оплате являются целыми числами.
public class RestaurantBill {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму чека");
        int bill = scanner.nextInt();
        if (bill<=0){System.out.println("Еда не так плоха, чтобы за ее поедание доплачивали");} else {
            System.out.println("Сколько было гостей?");
            int friend = scanner.nextInt();
            if (friend<=0){System.out.println("Кто здесь?!");} else {
                int parth = (int) (bill*1.1/friend);
                System.out.println("Сумма с каждого гостя с учетом 10% чаевых");
                System.out.println(parth);
            }
        }
    }
}