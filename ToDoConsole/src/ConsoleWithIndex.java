
	import java.util.ArrayList;
	import java.util.Scanner;

	public class ConsoleWithIndex {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String name = null;
			String definition = null;
			String date = null;
			String[] Liste= new String[3];
			int itemNum= 0;
			int indexNum=0;
			
			Scanner user_input = new Scanner (System.in);
			
			ArrayList<String> nameList = new ArrayList();
			ArrayList definitionList = new ArrayList();
			ArrayList dateList = new ArrayList();
			
		
			Liste[0]= name;
			Liste[1]= definition;
			Liste[2]= date;
			
			System.out.println("Kaç eleman eklemek istersiniz? " );
			itemNum= user_input.nextInt();
			
			for (int i = 0; i < itemNum; i++) {
				
				System.out.print ("enter List Name: ");
				name= user_input.next();
				nameList.add(name);
				
				System.out.print ("enter List Definition: ");
				definition = user_input.next();
				definitionList.add(definition);
				
				System.out.print ("enter List Date: ");
				date = user_input.next();
				dateList.add(date);
				
				System.out.println("Liste Adı:" + name +"  Liste Tanımı: " + definition + "  Liste tarihi: " +date);
				System.out.println("Tablo İsmi    : " + nameList);
				System.out.println("Tablo Aciklama: " + definitionList);
				System.out.println("Tablo Tarihi  : " + dateList);
			}
			
			System.out.println("Kaçıncı indexi görmek istersiniz? " );
			indexNum= user_input.nextInt();
			
			
			
			
			System.out.println(nameList.get(indexNum-1));
			System.out.println(definitionList.get(indexNum-1));
			System.out.println(dateList.get(indexNum-1));
			
			
			
			
		}

	}





