
public class PrimerosPrimos {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 50; i++) {
			int contador = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					contador++;
				}
			}
			if (contador == 2) {
				total += i;
			}
		}
		System.out.print("Suma los números primos existentes en los primeros 50 números naturales : " + total);
	}
}
