package oops;

abstract class Shape{
	private String color;
	abstract double area();
	public abstract String toString();
	public String getColor() {
		return this.color;
	}
	Shape(String color){
		this.color = color;
	}
}
class Circle extends Shape{
	float radius;
	Circle(String color, float radius){
		super(color);
		this.radius = radius;
	}
	double area() {
		return (Math.pow(radius, 2) * Math.PI);
	}
	public String toString() {
		return "Circle color is " + this.getColor() + " and Circle area is " + this.area();
	}
}
class Rectangle extends Shape{
	int l, b;
	Rectangle(String color, int l, int b){
		super(color);
		this.l = l;
		this.b = b;
	}
	double area() {
		return l*b;
	}
	public String toString() {
		return "Rectangle color is " + this.getColor() + " and Rectangle area is " + this.area();
	}
}
class Square extends Shape{
	int side;
	Square(String color, int side){
		super(color);
		this.side = side;
	}
	double area() {
		return side * side;
	}
	public String toString() {
		return "Square color is " + this.getColor() + " and Square area is " + this.area();
	}
}
public class AntherAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle("Red", 2);
		Shape rect = new Rectangle("Green", 3, 4);
		Shape square = new Square("Blue", 6);
		System.out.println(circle.toString());
		System.out.println(rect.toString());
		System.out.println(square.toString());

	}

}
