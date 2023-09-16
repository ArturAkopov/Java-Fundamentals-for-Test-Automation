package Classes;//Вам необходимо реализовать метод intersection в классе Classes.Line. Он должен возвращать точку пересечения двух линий (Classes.Point).
// Если линии совпадают или не пересекаются, метод должен возвращать значение null.
//Вас может удивить, что в задании используется int для аргументов и полей координат.
// Дело в том, что использование double внесет некоторые дополнительные сложности, которых лучше избежать в этом базовом упражнении.
// Все тесты выбраны так, чтобы производить вычисления без остатков.
import java.util.Scanner;
public class IntersectionLine {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int k1 = scanner.nextInt();
            int b1 = scanner.nextInt();
            int k2 = scanner.nextInt();
            int b2 = scanner.nextInt();

            Line line1 = new Line(k1,b1);
            Line line2 = new Line(k2,b2);

            System.out.println(line1.intersection(line2));
        }
    }

    class Line {
        int k, b;

        public Line(int k, int b) {
            this.k = k;
            this.b = b;
        }

        public Point1 intersection(Line other) {
            if (this.k == other.k) return null;
            if (this.k== other.k && this.b== other.b) return null;
            int x = (other.b- this.b)/(this.k- other.k);
            int y = k*x+b;
            return new Point1(x,y);
                }

    }

    class Point1 {
        private final int x;
        private final int y;

        public Point1(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%d;%d)", x, y);
        }
}
