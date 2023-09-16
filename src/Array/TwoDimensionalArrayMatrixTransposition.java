package Array;

import java.util.Scanner;

//Напишите программу, которая принимает в качестве параметра размеры двумерного целочисленного массива ,
// а затем и сам массив (матрицу) и возвращает его транспонированным. В качестве разделителя в строке используйте пробел.
//Результат транспонирования матрицы – это перевернутая по главной диагонали версия исходной матрицы.
public class TwoDimensionalArrayMatrixTransposition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Создаем класс сканер
        int l = scanner.nextInt();// создаем переменную длина
        int h = scanner.nextInt();// создаем переменную высота
        int[][] array = new int[h][l];// говорим, что это длина массива
        int a=0;
        int b=0;
        while (a<l) {//Заходим в цикл
            array[a][b] = scanner.nextInt();
            b++;
            if (b==h) { b=0; a++;}
        }
        for (int i = 0; i < h; i++) {//идём по строкам
            for (int j = 0; j < l; j++) {//идём по столбцам
               if (j<l-1) System.out.print(array[j][i] + " ");//условием убираем лишнии пробелы в конце строки вывода
               else {System.out.print(array[j][i]);}
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
            }
    }
}
