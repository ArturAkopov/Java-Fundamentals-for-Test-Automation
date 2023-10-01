package WorkingWithStrings;

import java.util.Arrays;
import java.util.Scanner;

/*
Напишите программу, которая заполняет массив строк вводимыми с клавиатуры словами и далее соединяет слова из массива, возвращая в консоль виде строки в следующем
формате: "[str_1, str_2, ..., str_n]"

Размерность массива также вводится с клавиатуры.

Не пренебрегайте этой задачей, её реализация понадобится вам уже на следующем шаге.

Sample Input:

4
go with the FLOW
Sample Output:

[go, with, the, FLOW]
 */

public class ArrayString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String [] strings = new String[x];
             for(int i=0; i <strings.length;i++){
            strings[i]= scanner.next();
                   }
            System.out.println(Arrays.toString(strings));

    }
}
