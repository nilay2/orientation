/*
 * Additions
 * class names have changed
 * variable names case part changed
 * 
 * 
 */


import java.awt.event.ItemEvent;
import java.text.BreakIterator;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;

public class BoxMain {
	


	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		Scanner userInput = new Scanner(System.in);
		
		
		
		int itemNum=0;
		int indexNum = 0;

		ArrayList<Box> boxList = new ArrayList<Box>();


		
		System.out.println("How many elements do you want to add?");
		itemNum = userInput.nextInt();

		

		for (int i = 0; i < itemNum; i++) {
			Box listObject = new Box();
			
			System.out.print("Enter List Name: ");
			listObject.setName(userInput.next()) ;

			System.out.print("Enter List Definition: ");
			listObject.setDefinition(userInput.next());

			
			String ind = null;
		  Date d = null; 
		boolean dateSet = false;
		while (!dateSet) {
			try {
				System.out.print("Enter List Date: ");
				ind = userInput.next(); 
				System.out.println(ind);
				DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
				d = df.parse(ind);
				dateSet = true;
			}

			catch (ParseException e) {
				System.out
						.println("Unable to parse, your format need to be mm/dd/yyyy "
								+ ind);
			}
		}
		DateFormat df3 = DateFormat.getDateInstance();


		   String s3 = df3.format(d);

		   listObject.setDate(s3);
		   System.out.println("The entered date is: " + s3);
		   
		   
		   
		   
		   
			boxList.add(listObject);
	}
		System.out.println("----------------------------------------");
	    System.out.println("Name--------Definition---------Date-----");


	for (Box box : boxList) {
		
		System.out.println(box);
		System.out.println("----------------------------------------");
	}
	
		
	while(true){	
		System.out.println("Command Options: ");
		System.out.println("1: Add New Table");
		System.out.println("2: Show All List");
		System.out.println("3: Show choosen Indexes");
		System.out.println("4: Exit");
		
		
		Scanner menuInput = new Scanner(System.in);
		int x = menuInput.nextInt();
		
		
		switch (x) {
		 case 1:
		

		System.out.println("How many elements do you want to add? ");
		itemNum = userInput.nextInt();

		System.out.println("");

		for (int i = 0; i < itemNum; i++) {
			Box listObject = new Box();

			System.out.print("Enter List Name: ");
			listObject.setName(userInput.next()) ;

			System.out.print("Enter List Definition: ");
			listObject.setDefinition(userInput.next());

			System.out.print("Enter List Date: ");
			//System.out.println(listObject.date.getTime());
		
					
					/*Date date = Calendar.getInstance().getTime();
					  SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd.hhmmss");
					  return sdf.format(date);*/
			
			
			
			

			boxList.add(listObject);
		}
		
		break;
		 case 2:
		{
			System.out.println("----------------------------------------");
		    System.out.println("Name--------Definition---------Date-----");
		

		for (Box box : boxList) {
			
			System.out.println(box);
			System.out.println("----------------------------------------");

		}}
			
			break;
			
      case 3:
    	  System.out.println("Enter Box Indexes with comma ");
    	  
    	  
    	  
    	 String indexes = userInput.next();

    	  
    	   String[] indexArray = indexes.split(",");
    	   
    	   System.out.println(indexes);
    	   
    	   System.out.println("Name--------Definition---------Date-----");
    	   
    	   for (int i = 0; i < indexArray.length; i++) {
			String stringx = indexArray[i];
			System.out.println(boxList.get(Integer.parseInt(stringx)-1));
			
		}
    	   break;
      case 4:
    	  System.exit(0);
    	  
		default: System.out.println("You are out of range, check enetered item number");
			break;
		}
			
	}}

	private static Date date() {
		// TODO Auto-generated method stub
		return null;
	}
			
	}
	

		
	
		
	


