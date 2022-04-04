package progect_3;
import progect.Item2d;
/** Команда
* Change item;
* шаблон Command
* @author Егор
*/
public class ChangeItemCommand implements Command {
/** Обрабатываемый объект; шаблон Command */
private Item2d item;
/** Параметр команды; шаблон Command */
private double offset;
/** Устанавливаент поле {@linkplain ChangeItemCommand#item}
* @param item значение для {@linkplain ChangeItemCommand#item}
* @return новое значение {@linkplain ChangeItemCommand#item}
*/
public Item2d setItem(Item2d item) {
return this.item = item;
}
/** Возвращает поле {@linkplain ChangeItemCommand#item}
* @return значение {@linkplain ChangeItemCommand#item}
*/
public Item2d getItem() {
return item;
}
/** Устанавливаент поле {@linkplain ChangeItemCommand#offset}
* @param offset значение для {@linkplain ChangeItemCommand#offset}
* @return новое значение {@linkplain ChangeItemCommand#offset}
*/
public double setOffset(int offset) {
return this.offset = offset;
}
/** Возвращает поле {@linkplain ChangeItemCommand#offset}
* @return значение {@linkplain ChangeItemCommand#offset}
*/
public int getOffset() {
return (int) offset;
}
@Override
public void execute() {
item.setX((int) (item.getX() + offset));
}
}
