package orginization;

public class Main {

	public static void main(String[] args) 
	{
		Manager m1 = new Manager("sai", 2000,5000,1500);
		Manager m2 = new Manager("Krishna", 2000,5000,500);
		System.out.println("salary of emp  "+m1.name+" is :"+m1.getIncentive());
		System.out.println("salary of emp  "+m2.name+" is :"+m2.getIncentive());
		System.out.println();
		Labour l1 = new Labour("sai",10);
		Labour l2 = new Labour("Krishna", 8);
		System.out.println("overtime of labour  "+l1.name+" is :"+l1.getOverTime());
		System.out.println("overtime of labour  "+l2.name+" is :"+l2.getOverTime());
	}

}

