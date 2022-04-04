import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import progect_2.ViewableTable;
import progect.View;
/** Вычисление и отображение результатов<br>
* Содержит реализацию статического метода main()
* @author Егор
* @see Main#main
*/
public class Main extends progect.Main {
/** Инициализирует поле {@linkplain progect.Main#view view} */
public Main(View view) {
super(view);
}
private void menu() {
String s = null;
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
do {
do {
System.out.println("Enter command...");
System.out.print("'e'xit, 'v'iew, 'g'enerate, 's'ave, 'r'estore: ");
try {
s = in.readLine();
} catch(IOException e) {
System.out.println("Error: " + e);
System.exit(0);
}
} while (s.length() != 1);
switch (s.charAt(0)) {
case 'e' -> System.out.println("Exit.");
case 'v' -> {
    System.out.println("View current.");
    view.viewShow();
        }
case 'g' -> {
    System.out.println("Random generation.");
    view.viewInit();
    view.viewShow();
        }
case 's' -> {
    System.out.println("Save current.");
    try {
        view.viewSave();
    } catch (IOException e) {
        System.out.println("Serialization error: " + e);
    }
    
    view.viewShow();
        }
case 'r' -> {
    System.out.println("Restore last saved.");
    try {
        view.viewRestore();
    } catch (Exception e) {
        System.out.println("Serialization error: " + e);
    }
    
    view.viewShow();
        }
default -> System.out.println("Wrong command.");
}
} while(s.charAt(0) != 'e');
}
/** Выполняется при запуске программы;
* вызывает метод {@linkplain progect.Main#menu menu()}
* @param args - параметры запуска программы
*/
public static void main(String[] args) {
Main main = new Main(new ViewableTable().getView());
main.menu();
}
}