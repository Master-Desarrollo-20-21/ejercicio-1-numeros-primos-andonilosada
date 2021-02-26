
public class Primo {

	public static void main(String[] args) {

		int i = 0;
		int totalSuma = 0;
		int totalNumerosPrimos = 0;

		while (totalNumerosPrimos < 50) {
			i++;
			int contador = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					contador++;
				}
			}
			if (contador == 2) {
				totalNumerosPrimos++;
				totalSuma += i;
				System.out.print(i + " ");
			}
		}
		 System.out.print("\n" + "Total 50 primeros primos: " + totalSuma);
	}
}
