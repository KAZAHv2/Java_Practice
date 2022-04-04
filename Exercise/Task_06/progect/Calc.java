package progect;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * Содержит реализацию методов для вычисления и отображения результатов.
 * @author Егор
 */
public class Calc {
/** Имя файла, используемое при сериализации. */
private static final String FNAME = "Item2d.bin";
/** Сохраняет результат вычислений. Объект класса {@linkplain Item2d} */
private Item2d result;
/** Инициализирует {@linkplain Calc#result} */
public Calc() {
result = new Item2d();
}
/** Установить значение {@linkplain Calc#result}
* @param result - новое значение ссылки на объект {@linkplain Item2d}
*/
public void setResult(Item2d result) {
this.result = result;
}
/** Получить значение {@linkplain Calc#result}
* @return текущее значение ссылки на объект {@linkplain Item2d}
*/
public Item2d getResult() {
return result;
}
/** Вычисляет значение чередований.
* @param x - десятичное число.
* @return результат вычисления.
*/
private int calc(int x) {
String BinaryS = Integer.toBinaryString((int) x);
int binary = Integer.parseInt (Integer.toBinaryString((int) x));
int y =0;
System.out.println("Binary = "+binary);
int buff = binary%10;
binary = binary/10;
for(int i=0;i<BinaryS.length()-2;i++) {
if(buff != binary%10) {
y++;
}
buff = binary%10;
binary = binary/10;
		}
return y;
}
/** Вычисляет значение чередований и сохраняет
* результат в объекте {@linkplain Calc#result}
* @param x - десятичное число.
     * @return 
*/
public int init(int x ) {
result.setX(x);
return result.setY(calc(x));
}
/** Выводит результат вычислений. */
public void show() {
System.out.println(result);
}
/** Сохраняет {@linkplain Calc#result} в файле {@linkplain Calc#FNAME}
* @throws IOException
*/
public void save() throws IOException {
ObjectOutputStream os = new ObjectOutputStream(new
FileOutputStream(FNAME));
os.writeObject(result);
os.flush();
os.close();
}
/** Восстанавливает {@linkplain Calc#result} из файла {@linkplain Calc#FNAME}
* @throws Exception
*/
public void restore() throws Exception {
ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
result = (Item2d)is.readObject();
is.close();
}
}