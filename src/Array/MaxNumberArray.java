package Array;

import java.util.Arrays;
import java.util.Scanner;
//Напишите программу, которая получает из стандартного ввода размерность массива и все его элементы, после чего ищет в нем максимум и выводит на печать.
//Входной массив должен иметь не нулевой размер. Если указан нулевой размер сразу вывести "Массив нулевого размера". Входной массив может содержать любое значение типа int.
public class MaxNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Создаем класс сканер
        int length = scanner.nextInt(); // создаем переменную длина
        int[] array = new int[length]; // говорим, что это длина массива
        if (length==0) {
            System.out.println("Массив нулевого размера");
        } else {
            for (int i = 0;i<length;i++){
               array[i] = scanner.nextInt();
            } // цикл заполнения элементов массива числами
            Arrays.sort(array); //сортировка в порядке неубывания
            int x = length-1; //переменная для поиска последнего элемента массива
            System.out.println(array[x]); // выводит наибольшее число массива на экран
        }
    }
}