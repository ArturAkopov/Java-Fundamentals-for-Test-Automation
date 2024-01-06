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
        int a = degrees%360; // вычисление остатка от деления. Пример degrees = 400, a = 40
        if (a<0) a = 360+a; // если a < 0, то идем по окружности в обратную сторону
        int min = a;
        for(Direction value: Direction.values()){ //Цикл поиска минимального значения разницы между degrees и a
            if (a>315&a<360){N.degrees=360;} // приравнивание 0 и 360 градусов
            if (Math.abs(a - value.getDegrees()) <= min) min = Math.abs(a - value.getDegrees()); //запись минимального значения min
        }

        for(Direction value: Direction.values()){ // цикл для поиска value с минимальным значением разницы
            if (Math.abs(a-value.getDegrees()) == min) return value; // возвращение искомого объекта массива перечисления
        }

        return null;

    }
}
