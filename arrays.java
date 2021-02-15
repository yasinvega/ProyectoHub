import java.util.Scanner;

public class arrays {
		public static void main(String[] args) {
			Scanner lector = new Scanner(System.in);
			
			double [] numeros = new double[5];
			numeros [0] = 2.0d;
			
			for (int i = 0; i<numeros.length; i++) {
				System.out.print("Deme un numero: ");
				numeros[i] = lector.nextDouble();
				}
				
			double media = 0;
			
				//mostrar los datos guardados
			System.out.println("Doubles arrays almacenados: ");
			for (int j = 0; j<numeros.length; j++) {
			media = media + numeros [j];
			System.out.println(numeros[j] + " ");
			
			}
			media = media/numeros.length;
			System.out.println("La media es :" + media);
			//pedir 10 nombres y guardarlos en el arrays
			//utilizar el lector.readLine()
			
			//int[] tablero = new int[8] [8];
		}
}