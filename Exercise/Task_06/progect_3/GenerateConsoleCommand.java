package progect_3;
import progect.View;
/** Консольная команда
* Generate;
* шаблон Command
* @author Егор
*/
public class GenerateConsoleCommand implements ConsoleCommand {
/** Объект, реализующий интерфейс {@linkplain View};
* обслуживает коллекцию объектов {@linkplain progect.Item2d}
*/
private View view;
/** Инициализирует поле {@linkplain GenerateConsoleCommand#view}
* @param view объект, реализующий интерфейс {@linkplain View}
*/
public GenerateConsoleCommand(View view) {
this.view = view;
}
@Override
public char getKey() {
return 'g';
}
@Override
public String toString() {
return "'g'enerate";
}
@Override
public void execute() {
System.out.println("Random generation.");
view.viewInit();
view.viewShow();
}
}