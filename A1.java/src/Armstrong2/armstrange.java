package Armstrong2;
import java.util.Scanner;

public class armstrange {
	public static void main(String [] args) {
		int num2,num1,sum = 0,temp,a,i;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Enter the starting number");
		num2  = sc.nextInt();
		System.out.println("Enter the secound number");
		for(i = num1; i <= num2; i++) {
			temp = i;
			while(i >0) {
			a = temp % 10;
			temp = temp / 10;
			sum = sum + a*a*a;
			}
		}
		if(sum == i)
			System.out.println(""+i+" is a Armstrong number");
	}

}
