import java.util.Scanner;
public class ejercicios2 {
	// 13) Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
	// Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero de ventas: ");
		int ventas = sc.nextInt();
		double [] ventasList = new double[ventas];
		System.out.println("La suma total de sus ventas es de: $" + ventas(ventas, ventasList));
		
		System.out.println(mayus("pagos jovenes a la u tercera convocatoria, segundo semestre"));
	}
	

	static double ventas( int ventas, double[] ventasList) {
		double sumaFinal = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<ventas; i++) {
			System.out.println("Ingrese la venta numero " + (i+1) +  ": ");
			double valor = sc.nextDouble();
			ventasList[i] = valor;
		}
		
		for(int i = 0; i<ventasList.length; i++){
			sumaFinal += ventasList[i];
		}
		
		return sumaFinal;
	}
	
	
	
	
	static String mayus(String palabras) {
		String nueva = palabras.toUpperCase();
		return nueva;
	}
}
