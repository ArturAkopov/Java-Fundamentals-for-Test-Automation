package WorkingWithStrings;

/*
Напишите программу, которая получает на вход путь в нотации Unix или Windows. Выведите в консоль нотацию, в которой введен путь. Если путь соответствует обеим нотациям, выведите Both. Если путь не соответствует ни одной - выведите Error

Путь в Unix может начинаться ~ или /. Каждый подкаталог должен заканчиваться символом / кроме последнего. . и .. относятся к текущему каталогу и родительскому каталогy. Имя файла не обязательно имеет расширение.

Примеры пути Unix:

~/secret/dont_look.txt
.
~
~/
..
/
../anoTHER_folder
../anoTHER_folder/
../folder name
dir/subdir/wrongsubdir/../rightdir
/root/logs/end.log
file.txt
Путь в Windows может начинаться с C:, но это не обязательно. Каждый подкаталог должен заканчиваться символом \ кроме последнего. . и .. относится к текущему каталогу и родительскому каталогу. Имя файла не обязательно имеет расширение.

Примеры путей Windows:

C:\User\secret\dont_look.txt
.
C:\User
C:\User\
..
C:\
..\anoTHER_folder
..\anoTHER_folder\
..\folder name
dir\subdir\wrongsubdir\..\rightdir
C:\root\logs\end.log
Возможные, но не единственно возможные ошибки в путях:

более одного ~
~ находится не вначале
~ смешан с \ (~ в пути Windows)
более одного C:
C: находится не вначале
C: смешан с / (C: в пути Unix)
\ смешан с /
Примеры неправильных путей:

/folder1/folder2\folder3
C:\User/root
/dev/~/
C:/a/b/c/d
~\folder
~/~
~~
C:\Folder\Subfolder\C:\
 */

import java.util.Scanner;

public class WindowsUnix {
    public static void main(String[] args) {
        String base = new Scanner(System.in).nextLine();
        boolean unixBool =  base.matches("(((~?)|(\\.{1,2}))(/?))(([\\w\\s]*(\\.{2})?/?)*)([\\w\\s]+\\.\\w+)?"); // unix
        boolean windowsBool = base.matches("((([A-Za-z]:\\\\)?)|(\\.{1,2}))(([\\w\\s]*(\\.{2})?\\\\?)*)(([\\w\\s]+\\.\\w+)?)"); // windows
        if (unixBool&windowsBool){
            System.out.println("Both");
        } else if (unixBool) {
            System.out.println("Unix");
        } else if (windowsBool) {
            System.out.println("Windows");
        } else {
            System.out.println("Error");
        }
    }
}
