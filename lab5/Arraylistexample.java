package lab5;

import java.util.ArrayList;
import java.util.List;

public class Arraylistexample {
	
	public static void main(String[] args) {

		List<String> myList = new ArrayList<>();
		myList.add("Apple");
		myList.add("Orange");
		myList.add("Pear");
		
		//for (String item: myList) {
		for (int index = 0; index < myList.size(); index++) {
			System.out.println(myList.indexOf(index));
		}
		}
	}
