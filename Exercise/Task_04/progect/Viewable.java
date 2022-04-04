package progect;
/** Creator
* (шаблон проектирования
* Factory Method)<br>
* Объявляет метод,
* "фабрикующий" объекты
* @author Егор
* @see Viewable#getView()
*/
public interface Viewable {
/** Создаёт объект, реализующий {@linkplain View} */
public View getView();
}