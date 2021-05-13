package StudentsPP;
import java.util.Scanner;

public class pass {
	public static void main(String [] args) {
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the physics marks:");
		a = sc.nextInt();
		System.out.println("Enter the maths marks:");
		b = sc.nextInt();
		System.out.println("Enter the chemistry marks:");
		c = sc.nextInt();
		if(a>60 && b>60 && c>60)
			System.out.println("passed the class");
		else if((a>60 && b>60 && c<60) || (a>60 && b<60 && c>60) || (a<60 && b>60 && c>60))
			System.out.println("promoted to next class");
		else
			System.out.println("sorry! you are failed");
			
	}

}
