package basicsOfOopJava;
/*
Внимательно изучите предложенный код.
Измените его так, чтобы результатом работы метода main был вывод:
Ричард играет на гитаре.
Джон играет на фортепиано.
Давид играет на всем, до чего может дотянуться.
Sample Input:
Sample Output:
Ричард играет на гитаре.
Джон играет на фортепиано.
Давид играет на всем, до чего может дотянуться.

import java.util.List;

public class Main {
  public static void main(String args[]) {

    Guitarist ritchie = new Guitarist("Ричард");
    Keyboardist john = new Keyboardist("Джон");
    Musician david = new Musician("Давид");

    Musician[] musicians = {ritchie, john, david};

    for (Musician m : musicians){
        m.play();
    }
  }
}

class Musician {
    protected String name;
    public void play(){
        System.out.println(this.name + " играет на всем, до чего может дотянуться.");
    }

    public Musician(String name){
        this.name = name;
    }
}
class Guitarist {

    public Guitarist(String name) {
        super(name);
    }

    // Напишите свой код здесь
}
class Keyboardist {
    public Keyboardist(String name) {
        super(name);
    }

    // Напишите свой код здесь
}
 */

public class MusicianGuitaristKeyboardist {

        public static void main(String args[]) {

            Guitarist ritchie = new Guitarist("Ричард");
            Keyboardist john = new Keyboardist("Джон");
            Musician david = new Musician("Давид");

            Musician[] musicians = {ritchie, john, david};

            for (Musician m : musicians){
                m.play();
            }
        }
    }

    class Musician {
        protected String name;
        public void play(){
            System.out.println(this.name + " играет на всем, до чего может дотянуться.");
        }

        public Musician(String name){
            this.name = name;
        }
    }
    class Guitarist extends Musician{

        public Guitarist(String name) {
            super(name);
        }

       @Override
       public void play(){
            System.out.println(this.name + " играет на гитаре.");
        }
    }
    class Keyboardist extends Musician {
        public Keyboardist(String name) {
            super(name);
        }

        @Override
        public void play(){
            System.out.println(this.name + " играет на фортепиано.");
        }
    }

