package progect_2;
import progect.ViewableResult;
import progect.View;
/** ConcreteCreator
* (шаблон проектирования
* Factory Method)<br>
* Объявляет метод,
* "фабрикующий" объекты
* @author Егор
* @see ViewableResult
* @see ViewableTable#getView()
*/
public class ViewableTable extends ViewableResult {
/** Создаёт отображаемый объект {@linkplain ViewTable} */
@Override
public View getView() {
return new ViewTable();
}
}