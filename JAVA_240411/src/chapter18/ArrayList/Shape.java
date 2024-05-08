package chapter18.ArrayList;

public class Shape {

	public void draw() {
		System.out.println("draw Shape");
	}
}
class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("draw Circle");
	}
	public void circle() {
		System.out.println("원모양입니다.");
	}
}
class Rectangle extends Shape{

	@Override
	public void draw() {
		System.out.println("draw Rectangle");
	}
	public void rectangle() {
		System.out.println("사각형 모양입니다.");
	}
}
class Triangle extends Shape{

	@Override
	public void draw() {
		System.out.println("draw Triangle");
	}
	public void triangle() {
		System.out.println("삼각형 모양입니다.");
	}
	
}
