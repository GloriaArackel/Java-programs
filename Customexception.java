import java.util.Scanner;
class AgeException extends Throwable{
	public AgeException(String message) {
		super(message);
	}
}
public class Customexception{
	public static void ValidateAge(int age)throws AgeException{
		if(age<18) {
			throw new AgeException("Age must be atleast 18 years old");
		}
		System.out.println("Age is valid"+age);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		try {
			ValidateAge(age);
		}
		catch(AgeException e) {
			System.out.println("Error"+e.getMessage());
		}
		finally {
			System.out.println("I am finally block,end of the program");
			sc.close();
		}
	}
}

