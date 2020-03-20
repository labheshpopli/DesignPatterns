package factoryPattern;

public class ShapeTest {
	
	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape1 = factory.getShapeType("circle");
		System.out.println(shape1.draw());
	
	}
}
