import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		String signo;
		
		System.out.print("Introduce el primer operando: ");
		n1=sc.nextInt();
		System.out.println("Introduce el segundo operando: ");
		n2=sc.nextInt();
		System.out.println("Introduce el signo aritmetico: (+,-,*,/,^,%)");
		signo=sc.next();
		sc.close();
		
		switch (signo) {
		case "+":
			System.out.println(n1+"+"+n2+"="+(n1+n2));
			break;
		case "-":
			System.out.println(n1+"-"+n2+"="+(n1-n2));
			break;
		case "*":
			System.out.println(n1+"*"+n2+"="+(n1*n2));
			break;
		case "/":
			System.out.println(n1+"/"+n2+"="+((double)n1/(double)n2));
			break;
		case "^":
			System.out.println(n1+"^"+n2+"="+(n1^n2));
			break;
		case "%":
			System.out.println(n1+"%"+n2+"="+(n1%n2));
			break;
		default:
			System.out.println("El signo aritmetico"+ signo +"no esta disponible");
			break;
		}
	}

}
