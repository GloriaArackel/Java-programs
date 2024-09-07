import java.util.Scanner;

public class Frequency {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to check frequency of a given character");
		String str=sc.nextLine();
		System.out.println("Enter a character to find frequency");
		char ch=sc.nextLine().charAt(0);
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++) {
			if(str.charAt(i)==ch) 
				count++;
		}
			if(count==0) {
				System.out.println("Character not found");
				
				
			}
			else {
				System.out.println("Character found "+count+" times");
			}
		
	}

}
