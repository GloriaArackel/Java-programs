
class Overloading {
	import java.util.Scanner;
	class Mover{
		void area(double a,double b)
		{
			System.out.println("area of triangle="+0.5*a*b);
		}
		void area(double a)
		{
			System.out.println("area of circle is"+3.14*a*a);
		}
		void area (int a,int b)
		{
			System.out.println("area of rctangle"+a*b);
		}
	}
	public class Overloading{
		public static void main(String []args) {
			Scanner sc=new Scanner(System.in);
			Mover m= new Mover();
			System.out.println("enter radius");
			double r= sc.nextDouble();
			m.area(r);
			System.out.println("enter length");
			int q=sc.nextInt();
			System.out.println("enter breadth");
			int p=sc.nextInt();
			m.area(q,p);
			System.out.println("enter base");
			double t= sc.nextDouble();
			System.out.println("enter hieght");
			double s= sc.nextDouble();
			m.area(t,s);
			
		}
		
	}

}
