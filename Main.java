
public class Main {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		double c1Area = c1.getArea();
		System.out.println(c1Area);
		
		Circle c2 = new Circle(10);
		double c2Area = c2.getArea();
		System.out.println(c2Area);
		
		Circle c3 = new Circle(c2);
		double c3Area = c3.getAreaOfTwo();
		System.out.println(c3Area);
	}

}
