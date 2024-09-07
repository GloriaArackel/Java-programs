import java.util.Scanner;
public class Vowel {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to find vowel");
		String str=sc.nextLine();
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++){
		
			if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u')||(str.charAt(i)=='A')||(str.charAt(i)=='E')||(str.charAt(i)=='I')||(str.charAt(i)=='O')||(str.charAt(i)=='U'))
				count++;
		}
		if(count==0) {
			System.out.println("Vowel not found");
			
		}
		else {
			System.out.println("Vowel found "+count+" times");
		}

	}

}
