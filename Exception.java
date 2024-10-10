import java.util.Scanner;
public class Exception {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
		System.out.println("Choose an operation");
		System.out.println("1:Arithemetic operation");
		System.out.println("2:Array Access");
		System.out.println("3:EXIT");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			try {
			System.out.println("Enter numerator");
			int numerator=sc.nextInt();
			System.out.println("Enter denominator");
			int denominator=sc.nextInt();
		    int result=numerator/denominator; 
		    System.out.println("Result="+result);
		}
		catch(ArithmeticException e) {
			System.out.println("Caught an exception:"+e.getMessage());
		}
			break;
		case 2:
			int[] numbers= {1,2,3};
			try {
				System.out.println("Enter array index to access:");
				int index=sc.nextInt();
				System.out.println("Element at index"+index+":"+numbers[index]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Caught an exception"+e.getMessage());
			}
			break;
		case 3:
			System.out.println("EXITING");
			default:
				System.out.println("Invalid choice.Please select 1 or 2");
				break;
		}
	}
		while(choice!=3);
	sc.close();	
}
}