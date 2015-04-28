/*
 * Additions
 * class names have changed
 * variable names case part changed
 * 
 * 
 */

import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoxMain {

	private static List<Box> totalBoxes;

	public static void main(String[] args) throws ParseException, IOException{
		Scanner userInput = new Scanner(System.in);
		totalBoxes = new ArrayList<Box>();
		menu(userInput);
	}

	private static void menu(Scanner userInput) throws IOException {
		write2Console("Menu options: ");
		write2Console("1: Add new box");
		write2Console("2: Show all boxes");
		write2Console("3: Show choosen boxes");
		write2Console("4: Write to file");
		write2Console("5: Exit");
		int option = getIntegerInput(userInput, "enter option : ");

		switch (option) {
		case 1:
			ArrayList<Box> boxList = createBoxes(userInput);
			totalBoxes.addAll(boxList);
			break;
		case 2: {
			show(totalBoxes);
			break;
		}
		case 3:
			show(prepareTempList(userInput));
			break;
		case 4:
			
			write2File(totalBoxes);
			
			break;
			
		case 5: 
			userInput.close();
			System.exit(0);
			
		default:
			write2Console("You are out of range, check your menu option!");
			break;
		}
		menu(userInput);
	}

	private static List<Box> prepareTempList(Scanner userInput) {
		String indexes = getStringInput(userInput, "enter indexes : ");
		String[] indexArray = indexes.split(",");
		List<Box> tempList = new ArrayList<Box>();
		for (int i = 0; i < indexArray.length; i++) {
			tempList.add(totalBoxes.get(Integer.parseInt(indexArray[i]) - 1));
		}
		return tempList;
	}

	private static void show(List<Box> list) {
		// bubble_srt();
		collectionSort();
		write2Console("-----------------------------------------------------");
		write2Console("Name\t\tDefinition\t\tDate");
		for (Box box : list) {
			System.out.println(box.getInfo());
		}
		write2Console("-----------------------------------------------------");
	}

	private static void collectionSort() {
		Collections.sort(totalBoxes, new Comparator<Box>() {
			@Override
			public int compare(Box o1, Box o2) {
				return o1.getDate().compareTo(o2.getDate());
			}
		});
	}

	private static ArrayList<Box> createBoxes(Scanner userInput) {
		// create a box list..
		ArrayList<Box> boxList = new ArrayList<Box>();
		int itemCount2Add = getIntegerInput(userInput,
				"How many elements do you want to add?");

		for (int i = 0; i < itemCount2Add; i++) {
			// create box instance..
			Box box = new Box();
			write2Console("-------------------------------");

			box.setName(getStringInput(userInput, "enter name: "));
			box.setDefinition(getStringInput(userInput, "enter definiton: "));
			box.setDate(getDateInputFromUser(userInput, box));
			boxList.add(box);

			write2Console("-------------------------------");
			String msg = "added your box! : {0}";
			write2Console(MessageFormat.format(msg, box.toString()));
			write2Console("-------------------------------");
		}
		return boxList;
	}

	private static void write2Console(String string) {
		System.out.println(string);
	}

	private static Date getDateInputFromUser(Scanner userInput, Box box) {
		Date date = null;
		String question = new StringBuffer().append("enter valid(")
				.append(Box.DATE_FORMAT).append(") date: ").toString();
		String dateInput = getStringInput(userInput, question);
		SimpleDateFormat df = new SimpleDateFormat(Box.DATE_FORMAT);
		try {
			date = df.parse(dateInput);
		} catch (Exception e) {
			getDateInputFromUser(userInput, box);
		}
		return date;
	}

	private static String getStringInput(Scanner userInput, String question) {
		System.out.print(question);
		return userInput.next();
	}

	private static int getIntegerInput(Scanner userInput, String question) {
		System.out.println(question);
		return userInput.nextInt();
	}
	
	private static void write2File(List<Box> list) throws IOException{
		
		    FileWriter fw = new FileWriter("file.txt");
		    for (Box box : list) {
				System.out.println(box.getClass());
			}

		      fw.write(list + "\n");
		      fw.close();
		
	}

}
