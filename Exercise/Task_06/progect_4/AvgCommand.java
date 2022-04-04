package progect_4;
import java.util.concurrent.TimeUnit;
import progect.Item2d;
import progect.ViewResult;
import progect_3.Command;
/** Задача, используемая
* обработчиком потока;
* шаблон Worker Thread
* @author Егор
* @see Command
* @see CommandQueue
*/
public class AvgCommand implements Command /*, Runnable */ {
/** Хранит результат обработки коллекции */
private int result = 0;
/** Флаг готовности результата */
private int progress = 0;
/** Обслуживает коллекцию объектов {@linkplain progect.Item2d} */
private ViewResult viewResult;
/** Возвращает поле {@linkplain MaxCommand#viewResult}
* @return значение {@linkplain MaxCommand#viewResult}
*/
public ViewResult getViewResult() {
return viewResult;
}
/** Устанавливает поле {@linkplain MaxCommand#viewResult}
* @param viewResult значение для {@linkplain MaxCommand#viewResult}
* @return новое значение {@linkplain MaxCommand#viewResult}
*/
public ViewResult setViewResult(ViewResult viewResult) {
return this.viewResult = viewResult;
}
/** Инициализирует поле {@linkplain MaxCommand#viewResult}
* @param viewResult объект класса {@linkplain ViewResult}
*/
public AvgCommand(ViewResult viewResult) {
this.viewResult = viewResult;
}
/** Возвращает результат
* @return поле {@linkplain MaxCommand#result}
*/
public int getResult() {
return result;
}
/** Проверяет готовность результата
* @return false - если результат найден, иначе - true
* @see MaxCommand#result
*/
public boolean running() {
return progress < 1000;
}
/** Используется обработчиком потока {@linkplain CommandQueue};
* шаблон Worker Thread
*/
@Override
public void execute() {
progress = 0;
System.out.println("Average executed...");
result = 0;
int idx = 1, size = viewResult.getItems().size();
for (Item2d item : viewResult.getItems()) {
result += item.getY();
progress = idx * 100 / size;
if (idx++ % (size / 2) == 0) {
System.out.println("Average " + progress + "%");
}
try {

TimeUnit.MILLISECONDS.sleep(2000 / size);
} catch (InterruptedException e) {
System.err.println(e);
}
}
result /= size;
System.out.println("Average done. Result = " + String.format("%d",result));
progress = 100;
}
/**
@Override
public void run() {
execute();
}
/**/
}