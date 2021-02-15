import java.util.Scanner;

public class Ejer1 {
		public static void main(String[] args) {
			Scanner lector = new Scanner(System.in);
			
			double [] numeros = new double[5];
			numeros [0] = 2.0d;
			
			for (int i = 0; i<numeros.length; i++) {
				System.out.print("Deme un numero: ");
				numeros[i] = lector.nextDouble();
				}
			System.out.println("Doubles arrays almacenados: ");
			for (int j = 0; j<numeros.length; j++) {
			System.out.println(numeros[j] + " ");
			}
		}
}