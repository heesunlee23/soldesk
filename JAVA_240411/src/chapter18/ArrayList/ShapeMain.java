package chapter18.ArrayList;

import java.util.ArrayList;

public class ShapeMain {
	
	ArrayList<Shape> sList = new ArrayList<Shape>();

	public static void main(String[] args) {
		ShapeMain sTest = new ShapeMain();
		System.out.println("---업캐스팅---");
		sTest.addShape();
		sTest.testCasting();
	}
	public void addShape() {
		sList.add(new Circle());
		sList.add(new Triangle());
		sList.add(new Rectangle());
		
		for(Shape s : sList) {
			s.draw();
		}
	}
	public void testCasting() {

		for(int i=0;i<sList.size();i++) {
			Shape s = sList.get(i);
			if(s instanceof Circle) {
				Circle c = (Circle)s;//다운캐스팅
				c.circle();
			}else if (s instanceof Rectangle) {
				Rectangle r = (Rectangle) s;//다운캐스팅
				r.rectangle();
			}else if (s instanceof Triangle) {
				Triangle t = (Triangle) s;//다운캐스팅
				t.triangle();
			}
		}
	}

}
