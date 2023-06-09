import java.util.Scanner;
public class ejercicios1 {
	public static void main(String[] args) {
		//Scanner sc = new Scanner (System.in);
		//double numero = sc.nextDouble();
		//System.out.println(IVA(numero));
		numeros_hasta_cien_For_2_3();
	}
	
	// 1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, 
	// multiplicación, división y módulo (resto de la división)
	static void operaciones(double x, double y) {
		double suma, resta, multiplicacion, division, modulo;
		suma = x + y;
		resta = x - y;
		multiplicacion = x * y;
		division = x / y;
		modulo = x % y;
		double[] respuestas = {suma, resta, multiplicacion, division, modulo}; 
		for(int i = 0; i<respuestas.length; i++) {
			System.out.println(respuestas[i]);
		}
	}
	
	// 2) Declara 2 variables numéricas (con el valor que desees), 
	//he indica cual es mayor de los dos. Si son iguales indicarlo también.
	static String mayor(double x, double y) {
		if(x>y) {
			return x + " es mayor a " + y;
		}
		else if(y>x) {
			return y + " es mayor a " + x;
		}
		else {
			return "Los numeros son iguales";
		}
	}
	
	
	// 3 y 4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane)
	static String bienvenida(String nombre) {
		return "Bienvenido " + nombre;
	}
	
	// 5) Calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
	static double area_de_un_circulo(double radio) {
		double area = Math.PI * Math.pow(radio, 2);
		return area;
	}

	// 6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
	static boolean divisibleEnDos(int numero_base) {
		return numero_base%2 == 0;
				
	}

	// 7) Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
	static char Ascii(int numero) {
		char letra = (char) numero;
		return letra;
	}

	// 8) Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y muestre su código en la tabla ASCII.
	static int AsciiConverter(char letra) {
		int numero = (int) letra;  // Entre mayusculas y minusculas hay una diferencia de 32 
		return numero;
	}

	// 9) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
	static double IVA(double precio) {
		double precio_final = (precio* 0.21) + precio;
		return Math.round(precio_final);
	}
	
	// 10) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
	static void numeros_hasta_cien_While() {
		int x = 1;
		while(x <= 100) {
			System.out.println(x);
			x++;
		}
	}
	
	// 11) Haz el mismo ejercicio anterior con un bucle for.
	static void numeros_hasta_cien_For() {
		for(int i = 1; i<=100; i++) {
			System.out.println(i);
		}
	}
	
	// 12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
	static void numeros_hasta_cien_For_2_3() {
		for(int i = 1; i<=100; i++) {
			if(i%2 == 0 || i%3 == 0) {
				System.out.println(i);
			}
		}
	}
	
	
}	
	

