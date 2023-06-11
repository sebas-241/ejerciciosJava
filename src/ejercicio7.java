import java.util.Scanner;
public class ejercicio7 {
	// 18) Pide por teclado dos número y genera 10 números aleatorios entre esos números. Usa el método Math.random 
	// para generar un número entero aleatorio (recuerda el casting de double a int).


	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el inicio del rango: ");
		int inicio = sc.nextInt();
		System.out.println("Ingrese el final del rango: ");
		int finalR = sc.nextInt();	
		rangoDeDosNumeros(inicio, finalR);

	}
	
	static void rangoDeDosNumeros(int i, int f) {
		System.out.println("Aqui estan tus numeros aleatorios: ");
		for(int j = 0; j< 10; j++) {
			double numero_alzar = Math.random()*(i-f)+f;
			System.out.println(Math.round(numero_alzar));
		}	
	}
	
	

}
