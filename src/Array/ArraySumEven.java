package Array;

import java.util.Scanner;
//Напишите программу, которая должна получить на вход размерность массива больше нуля и сам массив значений int
// и вернуть сумму четных чисел. Если четных чисел в массиве нет, сумма равна 0.
public class ArraySumEven {
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
        }
        int sum = 0; // задаем целочисленную переменную для нулевой суммы
        for (int i=0; i<array.length; i++) //заходим в цикл для сравнения чисел массива
        { if (array[i] % 2 == 0) { //задаем условие четности чисел
            int x = array[i]; //задаем переменную для каждого числа массива в цикле
            sum = sum+x;// записываем новую переменную для суммы чисел масива
        }
        }
        System.out.println(sum);
    }
}