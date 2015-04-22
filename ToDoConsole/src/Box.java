public class Box {

	private String name = null;
	private String definition = null;
	private String date = null;

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
	
	public void setDate(String date){
		this.date = date;
	}
	public String getDate() {
		return date;
	}

	public String toString() {
		return   getName() + "\t , \t" + getDefinition()
				+ "\t , \t" + getDate();
	}

}
