import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		
		System.out.print("Introduce un numero: ");
		num=sc.nextInt();
		sc.close();
		
		//comprovaremos si un numero es divisible entre dos
		if(num%2==0) {
			System.out.println("El numero "+num+" es divisible entre 2");
		}else {
			System.out.println("El numero "+num+" no es divisible entre 2");
		}

	}

}
