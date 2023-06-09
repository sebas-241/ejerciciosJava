import java.util.Scanner;
public class ejercicios6 {
	// 17) Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. 
	// Usa un switch para ello.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el dia de la semana que desee y confirme si es laboral o no: ");
		String dia = sc.nextLine();
		System.out.println(diasLaborales(dia));
		
	}
	
	static String diasLaborales(String diaElegido) {
		String diaE = diaElegido.toLowerCase().replace(" ", "");
		String palabra = diaE.substring(0, 1).toUpperCase();
		String palabra2 = diaE.substring(1, diaE.length());
		String laboral = switch (diaE){
			case "sabado" -> palabra + palabra2 + " no es un dia laboral";
			case "domingo" -> palabra + palabra2 + " no es un dia laboral";
			case "lunes" -> palabra + palabra2 +" es un dia laboral";
			case "martes" -> palabra + palabra2 +" es un dia laboral";
			case "miercoles" -> palabra + palabra2 +" es un dia laboral";
			case "jueves" -> palabra + palabra2 +" es un dia laboral";
			case "viernes" -> palabra + palabra2 +" es un dia laboral";
			default -> "Valor invalido";
		};
		
		return laboral;
		
	}
	
	
	
	

}
