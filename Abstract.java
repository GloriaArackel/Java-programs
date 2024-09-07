abstract class Shape{
	abstract void numberOfSides();
	}
class Rectangle extends Shape{
	int side;
	Rectangle(int side){
		this.side=side;
		}
	public void numberOfSides() {
		System.out.println("no.of sides of rectangle"+side);
	}
	}
class Triangle extends Shape{
	int side;
	Triangle(int side){
		this.side=side;
	}
	public void numberOfSides() {
		System.out.println("no.of sides of triangle"+side);
}
}
class Hexagon extends Shape{
	int side;
	Hexagon(int side){
		this.side=side;
	}
	public void numberOfSides() {
		System.out.println("no.of sides of Hexagon"+side);
	}
	}
public class Abstract{
	public static void main(String args[]) {
		Rectangle r=new Rectangle(4);
		Triangle t=new Triangle(3);
		Hexagon h=new Hexagon(6);
		r.numberOfSides();
		t.numberOfSides();
		h.numberOfSides();
	}

}

