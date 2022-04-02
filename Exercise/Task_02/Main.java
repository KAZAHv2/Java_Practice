import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
	    System.out.print("Write number: ");
	    int number = console.nextInt();
	    
	   
	    
	    console.close();
	    
	    
	    System.out.println("number of  alternations  = "+Binary.count(number));
	}
}
