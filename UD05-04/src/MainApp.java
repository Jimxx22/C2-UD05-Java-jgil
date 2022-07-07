import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double r, area;
		
		System.out.println("Vamos a calcular el área de un circulo.");
		System.out.print("Introduce el radio: ");
		r=Double.parseDouble(sc.next());
		sc.close();
		
		area= Math.PI*Math.pow(r, 2);
		System.out.println("El area del circulo es: "+area);

	}

}
