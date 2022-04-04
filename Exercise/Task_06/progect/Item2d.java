package progect;
import java.io.Serializable;
/** Хранит исходные данные и результат вычислений.
* @author Егор
* 
*/
public class Item2d implements Serializable {
/** Вычисляемое значение. */
// transient
private int x;
/** Результат вычисления. */
private int y;

/** Автоматически сгенерированная константа */
private static final long serialVersionUID = 1L;
/** Инициализирует поля {@linkplain Item2d#x}, {@linkplain Item2d#y} */
public Item2d() {

}
/** Устанавливает значения полей: десятичного числа
* и результата вычисления .
* @param x - значение для инициализации поля {@linkplain Item2d#x}
* @param y - значение для инициализации поля {@linkplain Item2d#y}
*/
public Item2d(int x, int y) {
this.x = x;
this.y = y;
}
/** Установка значения поля {@linkplain Item2d#x}
* @param x - значение для {@linkplain Item2d#x}
* @return Значение {@linkplain Item2d#x}
*/
public double setX(int x) {
return this.x = x;
}
/** Получение значения поля {@linkplain Item2d#x}
* @return Значение {@linkplain Item2d#x}
*/
public int getX() {
return x;
}
/** Установка значения поля {@linkplain Item2d#y}
* @param y - значение для {@linkplain Item2d#y}
* @return Значение {@linkplain Item2d#y}
*/
public int setY(int y) {
return this.y = y;
}
/** Получение значения поля {@linkplain Item2d#y}
* @return значение {@linkplain Item2d#y}
*/
public int getY() {
return y;
}
/** Установка значений {@linkplain Item2d#x} и {@linkplain Item2d#y}
* @param x - значение для {@linkplain Item2d#x}
* @param y - значение для {@linkplain Item2d#y}
* @return this
*/
public Item2d setXY(int x, int y) {
this.x = x;
this.y = y;
return this;
}
/** Представляет результат вычислений в виде строки.<br>{@inheritDoc} */
@Override
public String toString() {
return "Cгенерируемое десятичное число = " + x + "\n Количество чередований 0 и 1 в двоичном представлении\n" +
"заданного десятичного числа. = " + y;
}
}
