import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dia;
		
		System.out.print("Introduce un día de la semana: ");
		dia=sc.next();
		sc.close();
		
		switch (dia.toLowerCase()) {
		case "lunes":
			System.out.println("Lunes es un dia laboral.");
			break;
		case "martes":
			System.out.println("Martes es un dia laboral.");
			break;
		case "miercoles":
			System.out.println("Miercoles es un dia laboral.");
			break;
		case "jueves":
			System.out.println("Jueves es un dia laboral.");
			break;
		case "viernes":
			System.out.println("Viernes es un dia laboral.");
			break;
		case "sabado":
			System.out.println("Sabado no es un dia laboral.");
			break;
		case "domingo":
			System.out.println("Domingo no es un dia laboral.");
			break;
		default: 
			System.out.println(dia+" no es un dia de la semana.");
			break;
		}

	}

}
