import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double IVA= 0.21;
		double precio;
		
		System.out.print("Introduce un precio: ");
		precio=sc.nextDouble();
		sc.close();
		
		precio+=precio*IVA;
		
		System.out.println("El precio final del producto con el IVA es: "+precio);
		
	}

}
