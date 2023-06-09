import java.util.Scanner;
public class ejercicios5 {
	// 16) Escribe una aplicación con un String que contenga una contraseña cualquiera. 
	// Después se te pedirá que introduzcas la contraseña, con 3 intentos. 
	// Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo «Enhorabuena». 
	// Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
	
	public static void main(String[] args) {
		comprobadorClave();
	}
	
	static void comprobadorClave() {
		String claveReal = "HolaMundo";
		boolean cierto = false;
		for(int i = 3; i>0 && !cierto; i--) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese su clave: ");
			String pclave = sc.nextLine();
			
			if(pclave.equals(claveReal)) {
				System.out.println("Bienvenido");
				cierto = true;
			}
			
		}
	}
	

}
