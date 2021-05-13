package incometaxProject;
import java.util.Scanner;

public class incomeTax {
	public static void main(String [] args) {
		double a,b;
		System.out.println("Enter the Annual income");
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		if(a < 180000) {
			b = a/10;
			System.out.println("you'r payable tax amount is "+b);
		}
		else if(a < 300000 && a >180001 ) {
			b = a/10;
			System.out.println("you'r payable tax amount is"+b);
		}
		else if(a < 500000 && a > 300001) {
			b = a/20;
			System.out.println("you'r payable tax amount is"+b);
		}
		else if(a < 1000000 && a > 500001) {
			b= a/30;
			System.out.println("you'r payable tax amount is"+b);
		}
		else
			System.out.println("central Govt wants to know your location to ride your house!!!");
	}

}
