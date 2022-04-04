package progect;

/** ConcreteCreator
* (шаблон проектирования
* Factory Method)<br>
* Объявляет метод,
* "фабрикующий" объекты
* @author Егор
* @see Viewable
* @see ViewableResult#getView()
*/
public class ViewableResult implements Viewable {
/** Создаёт отображаемый объект {@linkplain ViewResult}
     * @return  */
@Override
public View getView() {
return new ViewResult();
}
}