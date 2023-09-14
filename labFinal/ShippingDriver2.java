package labFinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import labFinal.DNDDrive.CompareByStatus;

public class ShippingDriver2 {
	private static List<ShippingLab> records = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		File file = new File("shippingdata.txt");
		ShippingDriver2 driver = new ShippingDriver2();
		driver.loadFile(file);
		File record = new File("sortedrecords");
		PrintWriter pw = new PrintWriter(record);
		boolean start = true;
		while(start){
		switch (driver.menu()) {
		case 1:
			switch (driver.menuWriteorPrint()) {
			case 1:
				driver.printByReferenceNumber();
			}
			driver.printByReferenceNumber();
			for (ShippingLab shipment : records) {
			pw.printf("%s%n%s %s %s%n%d %d %d%n", shipment.getReferenceNumber(),
					shipment.getStreetNumber(), shipment.getStreetName(), shipment.getStreetType(),
					shipment.getWeight(), shipment.getSize(), shipment.getZone());}
			pw.close();
			break;
		case 2:
			driver.printByDestination();
			for (ShippingLab shipment : records) {
			pw.printf("%s%n%s %s %s%n%d %d %d%n", shipment.getReferenceNumber(),
					shipment.getStreetNumber(), shipment.getStreetName(), shipment.getStreetType(),
					shipment.getWeight(), shipment.getSize(), shipment.getZone());}
			pw.close();
			break;
		case 3:
			System.out.print("Enter reference number:");
			String userinput = input.next();
			driver.printByReferenceSearch(userinput);
			break;

		
		default:
			pw.close();
			System.out.println("Program Ended.");
			start = false;
		}
		}

	}
	public int menu() {
		System.out.println("1) Sort by Reference Number");
		System.out.println("2) Sort by Destination");
		System.out.println("3) Search by Reference Number");
		System.out.println("4) Exit");
		System.out.print("     Selection: ");
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		
		return option;
		
	}
	public int menuWriteorPrint() {
		System.out.println("1) Print to console");
		System.out.println("2) Write to file");
		System.out.println("3) Both");
		System.out.print("     Selection: ");
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		
		return option;
		
	}

	
	public void loadFile(File file) throws FileNotFoundException {
		Scanner userinput = new Scanner(file);
		while (userinput.hasNext()) {
			ShippingLab shipment = new ShippingLab();
			shipment.setReferenceNumber(userinput.next());
			shipment.setStreetNumber(userinput.next());
			shipment.setStreetName(userinput.next());
			shipment.setStreetType(userinput.next());
			shipment.setWeight(userinput.nextInt());
			shipment.setSize(userinput.nextInt());
			shipment.setZone(userinput.nextInt());
			shipment.setCost(0);
			records.add(shipment);

		}
		userinput.close();

	}

	public void printByReferenceNumber() {
		records.sort(new CompareByReferenceNumber());
		System.out.println("Reference    Destination         Weight      Size                Delivery");
		System.out.println("Number       Address             Class       Class               Zone        Cost");
		System.out.println("========     ===============     ======      ======              ======      =======");
		for (ShippingLab shipment : records) {
			System.out.printf("%-12s %s %-6s %-9s %-11s %-19s %-11s %.2f%n", shipment.getReferenceNumber(),
					shipment.getStreetNumber(), shipment.getStreetName(), shipment.getStreetType(),
					shipment.calculateWeightClass(shipment.getWeight()),
					shipment.calculateSizeClass(shipment.getSize()), shipment.calculateZone(shipment.getZone()),
					shipment.getCost());
		}

	}

	public void printByDestination() {
		records.sort(new CompareByDestination());
		System.out.println("Reference    Destination         Weight      Size                Delivery");
		System.out.println("Number       Address             Class       Class               Zone        Cost");
		System.out.println("========     ===============     ======      ======              ======      =======");
		for (ShippingLab shipment : records) {
			System.out.printf("%-12s %s %-6s %-9s %-11s %-19s %-11s %.2f%n", shipment.getReferenceNumber(),
					shipment.getStreetNumber(), shipment.getStreetName(), shipment.getStreetType(),
					shipment.calculateWeightClass(shipment.getWeight()),
					shipment.calculateSizeClass(shipment.getSize()), shipment.calculateZone(shipment.getZone()),
					shipment.getCost());
		}

	}
	public void printByReferenceSearch(String input) {
		
		for (ShippingLab shipment : records) {
			if (shipment.getReferenceNumber().equals(input)) {
				System.out.println("Reference    Destination         Weight      Size                Delivery");
				System.out.println("Number       Address             Class       Class               Zone        Cost");
				System.out.println("========     ===============     ======      ======              ======      =======");
				System.out.printf("%-12s %s %-6s %-9s %-11s %-19s %-11s %.2f%n", shipment.getReferenceNumber(),
						shipment.getStreetNumber(), shipment.getStreetName(), shipment.getStreetType(),
						shipment.calculateWeightClass(shipment.getWeight()),
						shipment.calculateSizeClass(shipment.getSize()), shipment.calculateZone(shipment.getZone()),
						shipment.getCost());
			}
			else {
				System.err.println("Invalid reference number");
				break;
			}
		}
	}

	static class CompareByReferenceNumber implements Comparator<ShippingLab> {

		public int compare(ShippingLab o1, ShippingLab o2) {

			return o1.getReferenceNumber().compareTo(o2.getReferenceNumber());
		}

	}

	static class CompareByDestination implements Comparator<ShippingLab> {

		public int compare(ShippingLab o1, ShippingLab o2) {

			return o1.getStreetName().compareTo(o2.getStreetName());
		}

	}
}