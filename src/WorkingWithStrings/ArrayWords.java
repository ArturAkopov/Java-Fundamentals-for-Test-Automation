package WorkingWithStrings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Напишите программу, которая получает на вход текстовую строку и разделяет её на массив слов, используя следующие разделительные символы: ",", ".", ";", ":", " ", "?", "!"

Слова, состоящие только из пробелов необходимо игнорировать.

Если получившийся массив пуст, выведите []

Получившийся массив выведите в консоль, используя программу, написанную на предыдущем шаге.

Sample Input:

go with ...the:;        FLOW
Sample Output:

[go, with, the, FLOW]
 */


public class ArrayWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Pattern pattern = Pattern.compile("[,.;: ?!]+");
        Matcher matcher = pattern.matcher(string);
        string = matcher.replaceAll(" ");
        String[] word = string.split(" ");
        System.out.println(Arrays.toString(word));
    }
}
