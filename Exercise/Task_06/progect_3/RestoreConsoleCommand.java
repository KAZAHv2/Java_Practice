package progect_3;
import progect.View;
/** Консольная команда
* Restore;
* шаблон Command
* @author Егор
*/
public class RestoreConsoleCommand implements ConsoleCommand {
/** Объект, реализующий интерфейс {@linkplain View};
* обслуживает коллекцию объектов {@linkplain progect.Item2d}
*/
private View view;
/** Инициализирует поле {@linkplain RestoreConsoleCommand#view}
* @param view объект, реализующий интерфейс {@linkplain View}
*/
public RestoreConsoleCommand(View view) {
this.view = view;
}
@Override
public char getKey() {
return 'r';
}
@Override
public String toString() {
return "'r'estore";
}
@Override
public void execute() {
System.out.println("Restore last saved.");
try {
view.viewRestore();
} catch (Exception e) {
System.err.println("Serialization error: " + e);
}
view.viewShow();
}
}