
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	

	public static void main(String[] args) {
		
		//Challenge 1
		 challenge1();
		 
		 //Challenge 2
		 challenge2();
		 
		//Challenge 4
		 challenge4();
		 
		//Challenge 5
		 challenge5();
	}
	
	public static void challenge1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		int n1 = 0,n2 = 1,n3 = 0,closestIndex=2;    
	      
		 do{
			 if(number == 1) {
				 closestIndex = 2;
				 break;
			 }
			  n3= n1 + n2;   
			  n1=n2;
			  n2=n3;
			  if(number == n3) {
				  closestIndex++;
				  System.out.println("Number is in fibonacci sequence");
			  } else if(n3 > number) {
				  System.out.println("Number is not in fibonacci sequence");
				  int nextNumberDifference = n3 - number;
				  int previousNumberDifference = number - n1;
				  if(nextNumberDifference < previousNumberDifference)
					  closestIndex++;
			  } else {
				  closestIndex++;
			  }
		 } while(number > n3);
		 if(number == 0)
			 closestIndex = 1;
		 
		 System.out.println("Closest Index : "+ closestIndex);
	}
	
	public static void challenge2() {
				
		int max = 0;
		char highestNumberOfOccurenceCharacter = 0;
		LinkedHashMap<Character, Integer> count = new LinkedHashMap<Character, Integer>(); 
		
		String s = "Character";
		char[] charArray =s.toLowerCase().toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if (count.containsKey(charArray[i])) {
				int countCharacter = count.get(charArray[i]);
				count.put(charArray[i], countCharacter + 1);
			} else {
				count.put(charArray[i], 1);
			}
		}
		for( Entry<Character, Integer> entry : count.entrySet()){
			  Character key = entry.getKey();
			  int c= entry.getValue();
			  if(c > max) {
				  max = c;
			  }
		}
		for( Entry<Character, Integer> entry : count.entrySet()){
			  Character key = entry.getKey();
			  int c= entry.getValue();
			  if(c == max) {
				  highestNumberOfOccurenceCharacter = key;
				  break;
			  }
		}
		System.out.println("Highest Number of occurence charcter : "+ highestNumberOfOccurenceCharacter);
	}
	
	public static void challenge4() {
		Scanner sc = new Scanner(System.in);
		
		RestaurantImplementation restaurantImplementation = new RestaurantImplementation();
		System.out.println("Enter the dish to search: ");
		String searchDish = sc.nextLine();
		List<Restaurant> restaurantList = restaurantImplementation.searchRestaurant(searchDish);
		if(restaurantList.size() > 0) {
			for(Restaurant restaurant: restaurantList) {
				System.out.println(restaurant);
			}
		} else {
			System.out.println("There is no restaurant to search for the dish");
		}
	}
	
	public static void challenge5() {
		
		Scanner sc = new Scanner(System.in);
		
		PeopleImplementation imp = new PeopleImplementation();
		imp.alteredList();
		System.out.println("Uniquelist : "+PeopleImplementation.uniqueList); // UniqueList
		System.out.println("Duplicatelist : "+PeopleImplementation.duplicateList); // Duplicate List
		
		System.out.println();
		double averageAge = imp.findAverageAge(); //Finding Average age
		System.out.println("Average age : "+averageAge);
		
		System.out.println();
		System.out.println("Enter the Age Limit to find the people who are below it: ");
		int ageLimit = sc.nextInt();
		List<People> peopleWithLessAgeLimit = imp.peopleWithLessAgeLimit(ageLimit); // Finding people less than age limit
		
		if(peopleWithLessAgeLimit.size() > 0) {
			System.out.println("People with less than "+ageLimit+" age");
			System.out.println();
			for(People p : peopleWithLessAgeLimit) {
				System.out.println(p);
			}
		} else {
			System.out.println("There is no people with less than "+ageLimit+" age");
		}
		
		System.out.println();
		Set<String> uniqueCountryList = imp.uniqueCountry(); // Finding unique country list
		System.out.println("Unique List");
		System.out.println();
		for (String value : uniqueCountryList) 
            System.out.println(value);
		
	}
	
}
