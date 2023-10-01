package AbstractClassesAndInterfaces;
/*
Реализуйте классы Triangle, Quadrilateral, Circle так, чтобы они расширяли абстрактный класс Figure.

Реализуйте методы классов Triangle, Quadrilateral, Circle:

конструкторы со следующими параметрами:
Triangle – три вершины (точки) в качестве параметров.
Quadrilateral – четыре вершины (точки) в качестве параметров.
Circle – точка центра и самая правая точка окружности.
Все входные наборы данных в тестах гарантированно образуют невырожденные фигуры. Для четырехугольников гарантируется, что все тестовые наборы данных будут
образовывать выпуклые четырехугольники.
public double area()
Возвращает площадь фигуры.
Примечание: выпуклые четырехугольники можно разделить на два треугольника по любой из их диагоналей.
public String pointsToString()
Возвращает значение String в следующих форматах:
Triangle –
Формат: (a.x,a.y)(b.x,b.y)(c.x,c.y)
Пример: (0.0,0.0)(0.1,5.8)(7.0,7.0)
Quadrilateral –
Формат: (a.x,a.y)(b.x,b.y)(c.x,c.y)(d.x, d.y)
Пример: (0.0,0.0)(0.0,7.1)(7.0,7.0)(7.0,0.0)
Circle –
Формат: (center.x,center.y)
Пример: (0.0,0.6)
Класс Point уже существует.

Программа должна принимать на вход количество точек далее их координаты, после чего последовательно выводить на экран результаты работы методов area,
 pointsToString, toString. Каждый результат выводится в новой строке.

 import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Triangle tr = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4));
        Quadrilateral qu = new Quadrilateral(new Point(1, 0), new Point(2, 1), new Point(1, 2), new Point(0, 1));
        Circle ci = new Circle(new Point(1, 1), 3);

        System.out.println(tr.area());
        System.out.println(qu.area());
        System.out.println(ci.area());

        System.out.println(tr.pointsToString());
        System.out.println(qu.pointsToString());
        System.out.println(ci.pointsToString());
    }
}

(
    Опишите требуемые классы здесь
)

abstract class Figure{

    public abstract double area();

    public abstract String pointsToString();

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }
}


class Point {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +"," + y +')';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
 */



public class TriangleQuadrilateralCircle {
    public static void main(String[] args){
        Triangle2 tr = new Triangle2(new Point1(0, 0), new Point1(3, 0), new Point1(0, 4));
        Quadrilateral qu = new Quadrilateral(new Point1(1, 0), new Point1(2, 1), new Point1(1, 2), new Point1(0, 1));
        Circle ci = new Circle(new Point1(1, 1), 3);

        System.out.println(tr.area());
        System.out.println(qu.area());
        System.out.println(ci.area());

        System.out.println(tr.pointsToString());
        System.out.println(qu.pointsToString());
        System.out.println(ci.pointsToString());
    }
}

class Triangle2 extends Figure{
Point1 a,b,c;
    public Triangle2(Point1 a, Point1 b, Point1 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double A = Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
        double B = Math.sqrt((b.getX() - c.getX()) * (b.getX() - c.getX()) + (b.getY() - c.getY()) * (b.getY() - c.getY()));
        double C = Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY()));
        double s = Math.abs(0.5 * ((c.getX() - a.getX()) * (b.getY() - a.getY()) - (c.getY() - a.getY()) * (b.getX() - a.getX())));
        if ((((A + B) <= C) || ((A + C) <= B) || ((B + C) <= A))) {
            return s = 0;
        }
        else {
            return s;}
    }

    @Override
    public String pointsToString() {
        return a.toString()+b.toString()+c.toString();
    }
}

class Quadrilateral extends Figure{
    Point1 a,b,c,d;
    public Quadrilateral(Point1 a, Point1 b, Point1 c, Point1 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    public double area() {
        double A = Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
        double B = Math.sqrt((b.getX() - c.getX()) * (b.getX() - c.getX()) + (b.getY() - c.getY()) * (b.getY() - c.getY()));
        double C = Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY()));
        double D = Math.sqrt((a.getX() - d.getX()) * (a.getX() - d.getX()) + (a.getY() - d.getY()) * (a.getY() - d.getY()));
        double E = Math.sqrt((d.getX() - c.getX()) * (d.getX() - c.getX()) + (d.getY() - c.getY()) * (d.getY() - c.getY()));
        double s = Math.abs(0.5 * ((c.getX() - a.getX()) * (b.getY() - a.getY()) - (c.getY() - a.getY()) * (b.getX() - a.getX())))+
                Math.abs(0.5 * ((c.getX() - a.getX()) * (d.getY() - a.getY()) - (c.getY() - a.getY()) * (d.getX() - a.getX())));
        if ((((A + B) <= C) || ((A + C) <= B) || ((B + C) <= A))) {
            return s = 0;
        }
        else if ((((D + E) <= C) || ((D + C) <= E) || ((E + C) <= D))){
            return s = 0;}
        else return s;
    }

    @Override
    public String pointsToString() {
        return a.toString()+b.toString()+c.toString()+d.toString();
    }
}

class Circle extends Figure{
    Point1 a;
    int rad;
    public Circle(Point1 a,int rad){
        this.a=a;
        this.rad=rad;
    }

    @Override
    public double area() {
        double s = Math.abs(Math.PI*Math.pow(rad,2));
        return s;
    }

    @Override
    public String pointsToString() {
        return a.toString();
    }
}
abstract class Figure{

    public abstract double area();

    public abstract String pointsToString();

    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }
}


class Point1 {
    private double x;
    private double y;

    public Point1(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +"," + y +')';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
