import javax.swing.JOptionPane;
public class ejercicios4 {
	// 15) Lee un número por teclado y comprueba que este numero es mayor o igual que cero, 
	// si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
	
	public static void main(String[] args) {
		String numero;					// Se declaran las variables a utilizar y evaluar en el while final
		int numeroR;
		do {
			numero = JOptionPane.showInputDialog("Ingrese un numero mayor a 0");		// instrucciones hasta que se cumpla
			numeroR = Integer.parseInt(numero);
		}while(numeroR < 0);					// si se cumple, se rompe el bucle
		
		System.out.println(numero);		// Imprimimos el valor
		

	}
	

	
	
}
