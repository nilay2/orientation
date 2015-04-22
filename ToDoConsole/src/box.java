public class box {

	private String name = null;
	private String definition = null;
	private String date = null;

	public box() {
	
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
		return "name : " + getName() + " , definition : " + getDefinition()
				+ " date : " + getDate();
	}

}
