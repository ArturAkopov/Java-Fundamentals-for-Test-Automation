package Generics;
/*
Используйте обобщения, чтобы изменить класс House таким образом, чтобы собаки не могли входить в кошачий домик, а кошки не могли входить в домик для собак.
        Вам нужно изменить поле residents и метод enter класса House.
        Обратите внимание: если вы все сделали правильно, то две определенные строки в классе Main помешают успешной компиляции,
        поэтому вам необходимо удалить их. Смотрите подробности в Main.
        Sample Input:

        Sample Output:

        Dog Rax Puppy Randy |Cat Barbos Kitten Murzik |


        import java.util.ArrayList;
        import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("Rax");
        Puppy randy = new Puppy("Randy");
        Cat barbos = new Cat("Barbos");
        Kitten murzik = new Kitten("Murzik");

        House dogHouse = new House();
        dogHouse.enter(rex);
        dogHouse.enter(randy);
        dogHouse.enter(murzik);
        System.out.println(dogHouse);

        House catHouse = new House();
        catHouse.enter(barbos);
        catHouse.enter(murzik);
        catHouse.enter(rex);
        System.out.println(catHouse);
    }
}

class House {

    private final List residents = new ArrayList();

    public void enter(Object resident) {
        residents.add(resident);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Object resident : residents) {
            builder.append(resident.toString()).append(" ");
        }
        return builder.toString() + "|";
    }
}

class Cat {

    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }
}

class Kitten extends Cat {

    public Kitten(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Kitten " + name;
    }
}

class Dog {

    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog " + name;
    }
}

class Puppy extends Dog {

    public Puppy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Puppy " + name;
    }
}
*/

import java.util.ArrayList;
import java.util.List;

public class House {

    public static void main(String[] args) {
        Dog rex = new Dog("Rax");
        Puppy randy = new Puppy("Randy");
        Cat barbos = new Cat("Barbos");
        Kitten murzik = new Kitten("Murzik");

        House1<Dog> dogHouse = new House1();
        dogHouse.enter(rex);
        dogHouse.enter(randy);

        House1<Cat> catHouse = new House1();
        catHouse.enter(barbos);
        catHouse.enter(murzik);
        System.out.println(dogHouse.toString()+catHouse.toString());
    }
}

class House1 <T> {

    private final List<T> residents = new ArrayList<>();

    public void enter(T resident) {
        residents.add(resident);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Object resident : residents) {
            builder.append(resident.toString()).append(" ");
        }
        return builder.toString() + "|";
    }
}

class Cat {

    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }
}

class Kitten extends Cat {

    public Kitten(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Kitten " + name;
    }
}

class Dog {

    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog " + name;
    }
}

class Puppy extends Dog {

    public Puppy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Puppy " + name;
    }
}
