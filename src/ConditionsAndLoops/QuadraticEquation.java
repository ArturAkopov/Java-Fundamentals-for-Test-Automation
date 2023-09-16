package ConditionsAndLoops;

import java.util.Scanner;
// Напишите программу для решения квадратных уравнений.
//Для заданных коэффициентов квадратного уравнения (ax² + bx + c = 0), верните один или два корня уравнения, если они существуют в области действительных чисел.
//Входное значение задается через System.in. Выходное значение должно быть напечатано в System.out.
//Формат вывода:
//"x₁ x₂" (два корня в порядке возрастания, разделенные пробелом), если есть два корня.
// "x" (просто значение корня), если есть единственный корень.
//просто строковое значение "без корней", если корня нет.
//корни - вещественные числа.
//Параметр a гарантированно не равен нулю.
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double D = (b * b) - (4 * a * c); //вычисление дискриминанта
        if (a == 0) {
            System.out.print(false);
        } else {
            if (D > 0) {
                double x1 = (-b - Math.sqrt(D)) / (2 * a);
                double x2 = (-b + Math.sqrt(D)) / (2 * a);
                System.out.print((x1>x2)?(x2+" "+x1):(x1+" "+x2));
            } else if (D == 0) {
                double x = (-b) / (2 * a);
                System.out.println(x);
            } else {
                System.out.print("без корней");
            }
        }
    }
}
