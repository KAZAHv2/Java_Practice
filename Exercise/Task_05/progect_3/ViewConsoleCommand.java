package progect_3;
import progect.View;
/** Консольная команда
* View;
* шаблон Command
* @author Егор
*/
public class ViewConsoleCommand implements ConsoleCommand {
/** Объект, реализующий интерфейс {@linkplain View};
* обслуживает коллекцию объектов {@linkplain progect.Item2d}
*/
private View view;
/** Инициализирует поле {@linkplain SaveConsoleCommand#view}
* @param view объект, реализующий интерфейс {@linkplain View}
*/
public ViewConsoleCommand(View view) {
this.view = view;
}
@Override
public char getKey() {
return 'v';
}
@Override
public String toString() {
return "'v'iew";
}
@Override
public void execute() {
System.out.println("View current.");
view.viewShow();
}
}