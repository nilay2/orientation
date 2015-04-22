/*
 * Additions
 * class names have changed
 * variable names case part changed
 * 
 * 
 */


import java.awt.event.ItemEvent;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class BoxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input = new Scanner(System.in);
		
		int itemNum;
		int indexNum = 0;

		ArrayList<Box> boxList = new ArrayList<Box>();
		
		
		System.out.println("How many elements do you want to add? ");
		itemNum = user_input.nextInt();

		System.out.println("");

		for (int i = 0; i < itemNum; i++) {
			Box listObject = new Box();

			System.out.print("Enter List Name: ");
			listObject.setName(user_input.next()) ;

			System.out.print("Enter List Definition: ");
			listObject.setDefinition(user_input.next());

			System.out.print("Enter List Date: ");
			listObject.setDate(user_input.next()); 

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
		
		
		Scanner menu_input = new Scanner(System.in);
		int x = menu_input.nextInt();
		
		
		switch (x) {
		 case 1:
		

		System.out.println("How many elements do you want to add? ");
		itemNum = user_input.nextInt();

		System.out.println("");

		for (int i = 0; i < itemNum; i++) {
			Box listObject = new Box();

			System.out.print("Enter List Name: ");
			listObject.setName(user_input.next()) ;

			System.out.print("Enter List Definition: ");
			listObject.setDefinition(user_input.next());

			System.out.print("Enter List Date: ");
			listObject.setDate(user_input.next()); 

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
    	  System.out.println("Enter Index ");
    	  
    	  System.out.println("Name--------Definition---------Date-----");
    	  
         while(true){
		  
		      indexNum= user_input.nextInt();
		    
		   
		  if(indexNum > 0 && indexNum <=boxList.size())
		  { 
			 /* ArrayList indexArray= new ArrayList();
			  indexArray.add(indexNum-1);
			  System.out.println(indexArray.get(indexNum-1));*/
			  
			  
			  System.out.println("----------------------------------------");
		        System.out.println(boxList.get(indexNum-1));
		  }
		  
		  else
           break;
}
	
       

		default: System.out.println("You are out of range, check enetered item number");
			break;
		}
			
		}}
			
	}
	

		
	
		
	


