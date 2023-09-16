package ConditionsAndLoops;

import java.util.Scanner;
import java.io.IOException;
//Напишите простую программу, которая:
//запрашивает количество незнакомцев, с которыми нужно встретиться и их имена перечисленные через пробел
//построчно выводит: "Привет, (имя незнакомца)" для каждого незнакомца.
//Гарантируется, что введенное количество незнакомцев — целое число.
//Частные случаи:
//Если количество незнакомцев равно нулю, программа должна вывести: "Оу... Похоже здесь никого...".
//Если количество незнакомцев отрицательное, программа должна вывести: "Серьезно? А что так негативно?".
public class Exception {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько вас и как вас зовут?");
        String input = scanner.nextLine();
        String[] names = input.split(" ");
        int a = Integer.parseInt(names[0]);
        if (a < 0) {
            System.out.println("Серьезно? А что так негативно?");
        } else if (a == 0) {
            System.out.println("Оу... Похоже здесь никого...");
        } else {
            for (int i = 1; i < names.length; i++) {
                String name = names[i];
                System.out.println("Привет, " + name);
            }
        }
        }
    }

