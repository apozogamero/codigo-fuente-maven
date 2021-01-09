package fibonaccimain;
import java.util.Scanner;
import fibonacci.Fibonacci;

public class FibonacciMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int longitud = 0;
		Fibonacci f = new Fibonacci();
		
		while (longitud < 1) {
			System.out.println("¿Cuál es la longitud de la secuencia que quieres?");
			longitud = sc.nextInt();
			if (longitud < 1)
				System.out.println("Esta longitud no es válida.");
		}
		
		f.getSucesion(longitud);
	}
}
