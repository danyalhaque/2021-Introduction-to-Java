package labFinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class DNDDrive {
	private List<DNDList> dndlist = new ArrayList<>();
	
	public static void main(String[] args) throws FileNotFoundException {
		DNDDrive driver = new DNDDrive();
		File file = new File("datafile");
		driver.loadFile(file);
		
		
		
	}
	public void loadFile(File file) throws FileNotFoundException {
		Scanner userinput = new Scanner(file);
		while(userinput.hasNext()) {
			DNDList character = new DNDList();
			character.setName(userinput.next());
			character.setAlignment(userinput.next());
			character.setAction(userinput.next());
			character.setRace(userinput.next());
			character.setStatus(userinput.next());
			character.setLevel(userinput.nextInt());
			dndlist.add(character);
		}
		userinput.close();
		dndlist.sort(new CompareByStatus());
		dndlist.sort(new CompareByLevel());

		System.out.println("Name    Alignment Action      Race      Status      Level");
		System.out.println("----    --------- ------      ----      ------      -----");
		for(DNDList character : dndlist) {
			System.out.printf("%-7s %-9s %-11s %-9s %-11s %d%n", character.getName(), character.getAlignment(), character.getAction(), character.getRace(), character.getStatus(), character.getLevel());
		}
	}
	class CompareByLevel implements Comparator<DNDList>{

		public int compare(DNDList o1, DNDList o2) {
			if (o1.getLevel() > (o2.getLevel())){
				return 1;
			}
			else {
				return - 1;
			}
		}
		
	}
	class CompareByStatus implements Comparator<DNDList>{

		public int compare(DNDList o1, DNDList o2) {

			return o1.getStatus().compareTo(o2.getStatus());
		}
		
	}

}
