package progect_4;
import progect.View;
import progect.ViewableResult;
import progect_3.ChangeConsoleCommand;
import progect_3.GenerateConsoleCommand;
import progect_3.Menu;
import progect_3.ViewConsoleCommand;
/** Вычисление и отображение
* результатов; содержит реализацию
* статического метода main()
* @author Егор
* @see Main#main
*/
public class Main {
/** Объект, реализующий интерфейс {@linkplain View};
* обслуживает коллекцию объектов {@linkplain progect.Item2d};
* инициализируется с помощью Factory Method
*/
private View view = new ViewableResult().getView();
/** Объект класса {@linkplain Menu};
* макрокоманда (шаблон Command)
*/
private Menu menu = new Menu();
/** Обработка команд пользователя */
public void run() {
menu.add(new ViewConsoleCommand(view));
menu.add(new GenerateConsoleCommand(view));
menu.add(new ChangeConsoleCommand(view));
menu.add(new ExecuteConsoleCommand(view));
menu.execute();
}
/** Выполняется при запуске программы
* @param args параметры запуска программы
*/
public static void main(String[] args) {
Main main = new Main();
main.run();
}
}