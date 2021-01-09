package fibonacci;

public class Fibonacci {
	
	public int getPosFibonacci(int pos) {
		if (pos == 0)
			return 0;
		else {
			if (pos == 1)
				return 1;
			else {
				if (pos > 1)
					return getPosFibonacci(pos-2) + getPosFibonacci(pos-1);
				else {
					System.out.println("Posición no válida");
					return -1;
				}
			}
		}
	}
	
	public void getSucesion(int longitud) {
		if (longitud < 1)
			System.out.println("Longitud no válida");
		else {
			for (int i=0; i < longitud; i++) {
				System.out.print(getPosFibonacci(i) + ", ");
			}
		}
	}
}
