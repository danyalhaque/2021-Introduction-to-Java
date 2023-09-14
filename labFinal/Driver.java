package labFinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Driver {
	private List<Person> persons = new ArrayList<>();
	
	public static void main(String[] args) throws FileNotFoundException {
		Driver driver = new Driver();
		File file = new File("data");
		driver.loadFile(file);
		
		boolean start = true;
		while(start){
		switch (driver.menu()) {
		case 1:
//			driver.printSortedByBMI();
			break;
		case 2:
			driver.printSortedByLastName();
			break;
		default:
			System.out.println("Program Ended.");
			start = false;
		}
		}
//		driver.printSortedByBMI();
		driver.printSortedByLastName();
		
//		List<Person> p = new LinkedList<>();
		
//		find(persons);
//		find(p);

	}
	public int menu() {
		System.out.println("1) Sort by BMI");
		System.out.println("2) Sort by Last Name");
		System.out.println("3) exit");
		System.out.print("     Selection: ");
		Scanner input = new Scanner(System.in);
				int option = input.nextInt();
		
		return 0;
		
	}
	
	public static void find(List<Person> List) {
		
	}
	
	public void loadFile(File file) throws FileNotFoundException {
		Scanner fileScan = new Scanner(file);
		while (fileScan.hasNext()) {
			Person p = new Person();
			p.setFirstName(fileScan.next());;
			p.setLastName(fileScan.next());;
			p.setStreetNumber(fileScan.next());;
			p.setStreetName(fileScan.next());;
			p.setStreetType(fileScan.next());;
			p.setCity(fileScan.next());;
			p.setState(fileScan.next());;
			p.setZipcode(fileScan.next());;
			p.setHeightFt(fileScan.nextInt());;
			p.setHeightIn(fileScan.nextInt());;
			p.setWeight(fileScan.nextInt());;
			persons.add(p);
			
		}
		fileScan.close();
	}
//	public static void printSortedByBMI() {
//		persons.sort(new CompareByBMI);
//		System.out.printf("Last, First         ZIP Code BMI (lb/in^2)%n");
//		System.out.printf("------------------- -------- -------------%n");
//		for(Person p : persons) {
//			System.out.printf("%-19s, %-8s %-.1f%n ", p.getLastName(), p.getFirstName(), p.getZipcode(), p.getBmi)());
//							}
	public static void printSortedByLastName() {
//		persons.sort(new CompareByLastName());
			System.out.printf("------------------- -------- -------------%n");
//			System.out.printf("%-19s, %-8s %-.1f%n ", p.getLastName(), p.getFirstName(), p.getZipcode(), p.getBmi)());
			}


	public List<Person> getPersons() {
		return persons;
	}
	
}
	
//	class CompareByBMI implements Comparator<Person>{
//
//		@Override
//		public int compare(Person o1, Person o2) {
//			if (o1.getBmi() < o2.getBmi()) {
//				return -1;
//			}
//			else if (o1.getBmi() > o2.getBMI()) {
//				return 1;
//			}
//			return 0;
//		}
//
//		}
class CompareByLastName implements Comparator<Person>{

	public int compare(Person o1, Person o2) {

		return o1.getLastName().compareTo(o2.getLastName());
	}
	

	}

//Person person = new Person(
//"Constance", "Sheridan",
//"71", "East", "CT.",
//"Portland,", "ME", "04103",5, 10, 150);
//System.out.println(person);
//
////you can disable setting by removing the setter from the Java Class(Person.java
//person.setLastName("lol");
//System.out.println(person.getLastName());