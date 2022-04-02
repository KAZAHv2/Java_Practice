
public class Binary {

	static public int count(int number) {
		String BinaryS = Integer.toBinaryString(number);
		int binary = Integer.parseInt (Integer.toBinaryString(number));
		int counter =0;
		System.out.println("Binary = "+binary);
		int buff = binary%10;
		binary = binary/10;
		for(int i=0;i<BinaryS.length()-2;i++) {
			if(buff != binary%10) {
				counter++;
			}
			buff = binary%10;
			binary = binary/10;
		}
		return counter;
	}
}
