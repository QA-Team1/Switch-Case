import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------calculator--------------");
		System.out.println("please enter two number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("press 1 for addition ");
		System.out.println("press 2 for substraction");
		System.out.println("press 3 for division");
		System.out.println("press 4 for multiplication");
		int xyz = sc.nextInt();
		
		switch (xyz) {
		case 1 :
			System.out.println(a+b);
			break;
		case 2 :
			System.out.println(a-b);
			break;
		case 3 :
			System.out.println(a/b);
			break;
		case 4 :
			System.out.println(a*b);
			break;
		default :
			System.out.println("please insert valid operation type"); 
			break;
				
		}
		
	}

}
