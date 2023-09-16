package Array;

import java.util.Arrays;
import java.util.Scanner;
//Напишите программу, которая должна получить размер массива и сам массив значений int и вернуть массив логических значений,
//где каждый элемент является результатом проверки: является ли соответствующий исходный элемент суммой двух предыдущих элементов в данном массиве.
//Подробности:
//Длина входящего массива должна быть 2 или более.
//Метод возвращает массив логических значений, где каждый элемент является результатом для соответствующего элемента в данном массиве.
//Первые два элемента логического массива всегда false.
public class ArrayBooleanValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Создаем класс сканер
        int length = scanner.nextInt(); // создаем переменную длина
        int[] array = new int[length]; // говорим, что это длина массива
        if (length<2) {
            System.out.println("Массив недопустимого размера");
        } else {
            for (int i = 0;i<length;i++){
               array[i] = scanner.nextInt();
            } // цикл заполнения элементов массива числами
        }
        boolean[] array2 = new boolean[length]; // Создаем новый логический массив
        array2[0]=false;
        array2[1]=false;
        for (int x = 2;x<length;x++){
            array2[x]=array[x]-array[x-1]-array[x-2]==0; // условие для проверки логики каждого оператора
        }
                System.out.println(Arrays.toString(array2)); //выводим массив в строку
    }
}