import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final String PAS="1234";
		String pass1;
		int i=0;
		
		do {
			System.out.print("Introduce la contraseña: ");
			pass1=sc.next();
			i++;
			if(pass1.equals(PAS)) {
				System.out.println("Has acertado la contraseña.");
			}else {
				System.out.println("Contraseña erronea.");
			}
		}while(!pass1.equals(PAS) && i!=3 );
		
		sc.close();
		if (i==3) {
			System.out.println("No has acertado al contraseña.");
		}
	}

}
