import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int nVentas;
		int sumaVentas=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el numero de ventas que vas a introducir: ");
		nVentas=sc.nextInt();
		
		for(int i=1;i<=nVentas;i++) {
			System.out.print("Introduce la venta numero "+i+": ");
			sumaVentas+=sc.nextInt();
		}
		
		sc.close();
		System.out.println("La suma de todas la ventas es: "+sumaVentas);
	}

}
