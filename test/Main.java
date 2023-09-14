package test;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Circle myCircle = new Circle();
		Circle yourCircle = new Circle(2.6);
		
		System.out.println(myCircle.getArea()); 
		System.out.println(yourCircle.getArea()); 
		Date date = new Date();
		System.out.println(date.toString());
	}

}
