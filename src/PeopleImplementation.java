import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PeopleImplementation {

	public static List<People> originalList;
	public static List<People> uniqueList;
	public static List<People> duplicateList;
	
	public PeopleImplementation() {
		originalList = new ArrayList<People>();
		uniqueList = new ArrayList<People>();
		duplicateList = new ArrayList<People>();
		
		originalList.add(new People("Shreesh", LocalDate.parse("1995-03-30"), "India"));
		originalList.add(new People("Shreesh", LocalDate.parse("1996-03-30"), "India"));
		originalList.add(new People("Mat", LocalDate.parse("1985-03-30"), "England"));
		originalList.add(new People("Hugh", LocalDate.parse("1965-03-30"), "Australia"));
		originalList.add(new People("Max", LocalDate.parse("1991-03-30"), "Australia"));
		originalList.add(new People("Max", LocalDate.parse("1975-03-30"), "England"));
	}
	
	public void alteredList() {
		
		boolean isFound = false;
		for(int i = 0 ; i < originalList.size();i++) {
			if(i == 0) {
				uniqueList.add(originalList.get(i));
			} else {
				for(int j = i-1;j >=0; j--) {
					isFound = false;
					if(originalList.get(i).getName().equals(originalList.get(j).getName())) {
						isFound = true;
						break;
					}
				}
				if(isFound) {
					duplicateList.add(originalList.get(i));
				} else {
					uniqueList.add(originalList.get(i));
				}
			}
		}
	}

	public double findAverageAge() {
		int totalAge = 0;
		double averageAge = 0;
		for(People p: uniqueList) {
			totalAge += calculateAge(p.getDate());
		}
		averageAge = (double) totalAge/uniqueList.size();
		
		return averageAge;
	}
	
	//this method calculates the age  
	public int calculateAge(LocalDate dob)   
	{	
		LocalDate curDate = LocalDate.now(); 
		if ((dob != null) && (curDate != null)) {  
			return Period.between(dob, curDate).getYears();  
		} else {  
			return 0;  
		}
	}
	
	public List<People> peopleWithLessAgeLimit(int ageLimit) {
		List<People> result = new ArrayList<People>();
		
		for(People p: uniqueList) {
			if(ageLimit > calculateAge(p.getDate())) {
				result.add(p);
			}
		}
		return result;
	}
	
	public Set<String> uniqueCountry() {
		Set<String> uniqueCountryList = new HashSet<String>();
		for(People p: uniqueList) {
			uniqueCountryList.add(p.getNationality());
		}
		return uniqueCountryList;
	}
}
