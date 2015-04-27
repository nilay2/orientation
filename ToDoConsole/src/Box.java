import java.text.SimpleDateFormat;
import java.util.Date;

public class Box{

	private String name = null;
	private String definition = null;
	private Date date;
	static final String DATE_FORMAT = "dd-MM-yyyy";

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public String toString() {
		return "Name : " + getName() + "\t\t" + "Definiton : "
				+ getDefinition() + "\t\t" + "Date : " + getFormattedDate();
	}

	public String getFormattedDate() {
		return new SimpleDateFormat(DATE_FORMAT).format(date);
	}

	public String getInfo() {
		return getName() + "\t\t" + getDefinition() + "\t\t\t"
				+ getFormattedDate();
	}
}
