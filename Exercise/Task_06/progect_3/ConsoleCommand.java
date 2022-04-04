package progect_3;
/** Интерфейс
* консольной команды;
* шаблон Command
* @author Егор
*/
public interface ConsoleCommand extends Command {
/** Горячая клавиша команды;
* шаблон Command
* @return символ горячей клавиши
*/
public char getKey();
}