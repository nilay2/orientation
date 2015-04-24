import java.text.SimpleDateFormat;
import java.util.Date;

public class Box {

	private String name = null;
	private String definition = null;
	public String date ;

	public Box() {
	
	}
	
	public void setName(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}
	
	public void setDefinition(String definition){
		this.definition = definition;
	}

	public String getDefinition() {
		return definition;
	}
	
	public String setDate(String date){
		return
		this.date = date;
	}
	public String getDate() {
		return date;
	}

	public String toString() {
		return   getName() + "\t , \t" + getDefinition()
				+ "\t , \t" + getDate();
    }
	
    public String getFormattedDate(Date date) {
	        SimpleDateFormat df = new SimpleDateFormat("yyyy MM dd HH mm ss");
	        return df.format(date);
	        
	    }

	
		
	
   
}
