import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int nVentas;
		Double precio;
		Double precioT=0.0;
		final double IVA=1.21;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el numero de ventas que vas a introducir: ");
		nVentas=sc.nextInt();
		
		for(int i=1;i<=nVentas;i++) {
			System.out.print("Introduce la venta numero "+i+": ");
			precio=sc.nextDouble();
			System.out.println("El precio bruto es: "+precio+", el precio neto es: "+(precio*IVA));
			precioT+=precio*IVA;
		}
		
		sc.close();
		System.out.println("La suma de todas las ventas es: "+precioT);
	}

}
