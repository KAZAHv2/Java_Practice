import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import progect.View;
import progect.ViewableResult;
/** Вычисление и отображение результатов.
* Содержит реализацию статического метода main().
* @author Егор
* @see Main#main
*/
public class Main {
/** Объект класса {@linkplain Calc}.<br>Решает задачу инд. задания. */
    
         /* private final Calc calc = new Calc();*/
    
/** Объект, реализующий интерфейс {@linkplain View};
* обслуживает коллекцию объектов {@linkplain ex01.Item2d}
*/
private final View view;
/** Инициализирует поле {@linkplain Main#view view}.
     * @param view */
public Main(View view) {
this.view = view;
}
/** Отображает меню. */
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
case 'e':
System.out.println("Exit.");
break;
case 'v':
System.out.println("View current.");
view.viewShow();
break;
case 'g':
System.out.println("Random generation.");
view.viewInit();
view.viewShow();
break;
case 's':
System.out.println("Save current.");
try {
view.viewSave();
} catch (IOException e) {
System.out.println("Serialization error: " + e);
}

view.viewShow();
break;
case 'r':
System.out.println("Restore last saved.");
try {
view.viewRestore();
} catch (Exception e) {
System.out.println("Serialization error: " + e);
}

view.viewShow();
break;
default:
System.out.println("Wrong command.");
}
} while(s.charAt(0) != 'e');
}
/** Выполняется при запуске программы;
* вызывает метод {@linkplain Main#menu() menu()}
* @param args - параметры запуска программы.
*/
public static void main(String[] args) {
Main main = new Main(new ViewableResult().getView());
main.menu();
}
}