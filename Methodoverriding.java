import java.util.Scanner;
class employee{
	double salary,DA,HRA,salary1;
	employee(double salary,double DA,double HRA){
		this.salary=salary;
		this.DA=DA;
		this.HRA=HRA;
	}
	void display() {
		System.out.println("Employee");
		
	}
	void calcSalary() {
		salary1=salary+salary*(DA/100)+salary*(HRA/100);
		System.out.println("Gross salary="+salary1);
	}
}
class Engineer extends employee{
	Engineer(double salary,double DA,double HRA){
		super(salary,DA,HRA);
	}
	void display() {
		super.display();
		super.calcSalary();
		System.out.println("Engineer");
	}
	void calcSalary() {
		System.out.println("Gross salary of the engineer"+salary1*2);
		}
}
public class Methodoverriding{
	public static void main(String args[]) {
		double salary,DA,HRA;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the basic salary of the emloyee");
		salary=sc.nextDouble();
		System.out.println("enetr DA% of employee");
		DA=sc.nextDouble();
		System.out.println("enter HRA% of employee");
		HRA=sc.nextDouble();
		Engineer e=new Engineer(salary,DA,HRA);
		e.display();
		e.calcSalary();
		sc.close();
	}
}