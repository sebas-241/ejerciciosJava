import javax.swing.JOptionPane;
public class ejercicio3 {
	//14) Realiza una aplicación que nos calcule una ecuación de segundo grado. 
	//Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante 
	//(operación en la raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de Math. 
	//Te recomiendo que uses mensajes de traza.

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Ingrese el primer valor");
		String valor2 = JOptionPane.showInputDialog("Ingrese el segundo valor");
		String valor3 = JOptionPane.showInputDialog("Ingrese el tercer valor");
		
		cuadratica(Integer.parseInt(valor1), Integer.parseInt(valor2), Integer.parseInt(valor3));
	}
	
	static void cuadratica(int a, int b, int c) {
		double determinante = Math.pow(b, 2) - (4*a*c);  // pow para exponentes
		if(determinante < 0 ) {
			System.out.println("El determinante es negativo: " + determinante + ", por lo que no tiene alguna solucion.");
		}
		else {
			double cuadraticaPositiva = (-b + Math.sqrt(determinante))/2*a;			// sqrt para raiz cuadradas
			double cuadraticaNegativa = (-b - Math.sqrt(determinante))/2*a;
			System.out.println("Primera solucion: "+ Math.round(cuadraticaPositiva));
			System.out.println("Segunda solucion: "+ Math.round(cuadraticaNegativa));
		}
	}
	
	

}
