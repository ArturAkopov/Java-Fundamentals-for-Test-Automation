package basicsOfOopJava;
/*
Изучите код ниже.
Исправьте конструктор класса Cat, так, чтобы вывод был
Котовас говорит мяу
Sample Input:
Sample Output:
Котовас говорит мяу

public class AnimalCat {
  public static void main(String args[]) {
    Cat albatros = new Cat("Котовас");
    albatros.speak();
  }
}
class Animal {

    private String name;
    private String voice;

    public Animal(String name, String voice){
        this.name = name;
        this.voice = voice;
    }

    public void speak() {
        System.out.println(this.name + " говорит " + this.voice);
    }
}
class Cat extends Animal {
    public void Cat(String name){
        // Напишите свой код здесь
    }
}
 */


public class AnimalCat {
    public static void main(String args[]) {
        Cat albatros = new Cat("Котовас");
        albatros.speak();
    }
}
class Animal {

    private String name;
    private String voice;

    public Animal(String name, String voice){
        this.name = name;
        this.voice = voice;
    }

    public void speak() {
        System.out.println(this.name + " говорит " + this.voice);
    }
}
class Cat extends Animal {

    public Cat(String name){
        super(name, "мяу");
    }
}
