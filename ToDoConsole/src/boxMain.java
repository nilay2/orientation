import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class boxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input = new Scanner(System.in);
		Scanner pauser= new Scanner(System.in);
		int itemNum;
		int indexNum = 0;

		ArrayList<box> boxList = new ArrayList<box>();

		System.out.println("Kaç eleman eklemek istersiniz? ");
		itemNum = user_input.nextInt();

		System.out.println("");

		for (int i = 0; i < itemNum; i++) {
			box ListObject = new box();

			System.out.print("enter List Name: ");
			ListObject.setName(user_input.next()) ;

			System.out.print("enter List Definition: ");
			ListObject.setDefinition(user_input.next());

			System.out.print("enter List Date: ");
			ListObject.setDate(user_input.next()); 

			boxList.add(ListObject);
			

		
			/*
			 * System.out.println("Tablo İsmi    : " + ListObject.name);
			 * System.out.println("Tablo Aciklama: " + ListObject.definition);
			 * System.out.println("Tablo Tarihi  : " + ListObject.date);
			 */

		}

		for (box box : boxList) {
			System.out.println(box);

		}
		
		{
			while(true)
			{
		System.out.println("index girin: ");
		indexNum= user_input.nextInt();
		if(indexNum > 0 && indexNum <= itemNum)
		 {
			
			System.out.println(boxList.get(indexNum -1));
		 }
		else
			System.out.println("You are out of range, check enetered item number");
			
		}}}
		
	
		
		

	}


