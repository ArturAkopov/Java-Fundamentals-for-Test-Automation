package Enum;

import java.util.Scanner;
/*
Изучите предлагаемый код.
Реализуйте метод closestToDegrees, возвращающий ближайший к введеным градусам экземпляр Direction.
Вводимые значения могут быть отрицательными, а также быть больше 360 градусов.

Sample Input:
205
Sample Output:
SW

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        System.out.println(Direction.closestToDegrees(d));
    }
}

enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public static Direction closestToDegrees(int degrees) {
        // Напишите свой код здесь
    }
}
 */

public class ClosestToDegrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        System.out.println(Direction.closestToDegrees(d));
    }
}

enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public int getDegrees() {
        return degrees;
    }

    public static Direction closestToDegrees(int degrees) {
        int b = 0; // целое число, для дальнейшего вычисления, введено для ограничения в дальнейшем по границе 360градусов
        if ((Math.abs(degrees) % 360) >= 0) b=Math.abs(degrees)/360; // если остаток от деления >=0, то вычисляем количество полностью пройденных кругов
        int c = b*360; // вычисление кол-ва градусов прошедших b полных кругов(360град)
        int a = Math.abs(degrees) - c; // вычисляем значение оставшихся градусов = вводимое значение - 360град * кол-во целых кругов
        int[] degree = new int[Direction.values().length]; // создаем массив для записи в него значений из перечисления, длина устанавливается по длине массива перечисления
        int x= 0;

        for(Direction value: Direction.values()){ //Цикл записывает в массив degree значения разницы между a и значением degrees для каждой из переменных массива value
            if (a>315&a<360){N.degrees=360;} // приравнивание 0 и 360 градусов
            degree[x] = Math.abs(a - value.getDegrees());
            x++;
        }

        int min = degree[0]; //ввод переменной для минимального значения массива

        for (int i = 0; i<degree.length;i++) // цикл для вычисления минимального значения массива
        {
            if (min>degree[i]) min=degree[i];
        }
        int ordinal = 0; // ввод переменной для вычисления индекса минимального значения массива

        for (int i = 0; i < degree.length; i++) // вычисление индекса минимального значения массива
        {
            if (degree[i] == min) {
               ordinal=i;
            }
        }

        for(Direction value: Direction.values()){ // цикл для сравнения индексов каждого элемента массива перечисления с переменной индекса минимального значения
            if (value.ordinal()==ordinal) return value; // возвращение искомого объекта массива перечисления
        }

        return null;

    }
}
