
import java.util.Scanner;
class calc{	
	void area(double basetriangle,double heighttriangle) {
		double trianglearea=(basetriangle*heighttriangle)/2;
		System.out.println("The area of triangle is "+trianglearea);
		}
	void area(int widthrectangle, int heightrectangle) {
		int rectanglearea=(widthrectangle*heightrectangle);
		System.out.println("The area of rectangle is "+rectanglearea);
	}
	void area(double circleradius) {
		double circlearea=(3.14*circleradius*circleradius);
		System.out.println("The area of circle is "+circlearea);
	}
}
public class Methodoverloading {
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   calc p= new calc();
	   System.out.println("Enter the base of triangle");
	   double basetriangle= sc.nextDouble();
	   System.out.println("Enter the height of triangle");
	   double heighttriangle= sc.nextDouble();
	   p.area(basetriangle,heighttriangle);
	   System.out.println("Enter the length of rectangle");
	   int lengthrectangle= sc.nextInt();
	   System.out.println("Enter the breadth of rectangle");
	   int breadthrectangle=sc.nextInt();
	   p.area(lengthrectangle,breadthrectangle);
	   System.out.println("Enter the radius of circle");
	   double circleradius= sc.nextDouble();
	   p.area(circleradius);
	   }
}