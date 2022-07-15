import java.time.LocalDate;
import java.util.Date;

public class People {

	private String name;
	private LocalDate date;
	private String nationality;
	
	public People() {
		
	}

	public People(String name, LocalDate date, String nationality) {
		super();
		this.name = name;
		this.date = date;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", date=" + date + ", nationality=" + nationality + "]";
	}
	
	
}
