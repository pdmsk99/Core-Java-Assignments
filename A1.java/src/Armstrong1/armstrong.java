import java.util.Scanner;

public class armstrong {
	public static void main( String [] args) {
		int a,b,num,temp,sum = 0;
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		num = sc.nextInt();
		temp=num;
		while(temp>0){
			a = temp % 10;
			temp = temp / 10;
			sum = sum + a*a*a;
		}
		if(num == sum)
			System.out.println(num+" is a Armstrong number");
		else
			System.out.println(num+ " is not a Armstrong number");

	}
}
