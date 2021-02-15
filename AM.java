import java.util.Scanner;
public class AM {
  public static void main(String[] args) {
    char c = '*';
	
	// String c = "*";   // ahora con comillas DOBLES!! porque es un String no un char
	
	// creamos un objeto Scanner para leer por teclado
	Scanner lector = new Scanner(System.in);
	
	System.out.print("Introduza un valor entre 1 y 9: ");
    int filas = lector.nextInt();
	
	System.out.println();
	for(int i = 1; i <= filas; i++) {
		
		for(int k = 1; k <= filas -i; k++  ) {
			System.out.print(" ");  // espacios
		}
		
		for (int n = 1; n <= i; n++) {
			
		    System.out.print(n);
						// asteriscos
		}
		
		System.out.println();  // salto de línea
	}
	


  
  }
}