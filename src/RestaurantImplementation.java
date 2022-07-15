import java.util.ArrayList;
import java.util.List;

public class RestaurantImplementation {

	public static List<Restaurant> restaurantList;
	
	public RestaurantImplementation() {
		restaurantList = new ArrayList<Restaurant>();
		restaurantList.add(new Restaurant("Awesome pizza place","pepperoni pizza","$20"));
		restaurantList.add(new Restaurant("wild burger joint","burger","$15"));
	}
	
	public void addRestaurant(String restaurantName,String restaurantDish, String cost) {
		Restaurant restaurant = new Restaurant();
		restaurant.setRestaurantName(restaurantName);
		restaurant.setRestaurantDish(restaurantDish);
		restaurant.setCost(cost);
		restaurantList.add(restaurant);
	}
	
	
	public List<Restaurant> searchRestaurant(String restaurantDish) {
		List<Restaurant> searchRestaurantList = new ArrayList<Restaurant>(); 
		for(Restaurant restaurant : restaurantList) {
			if(restaurant.getRestaurantDish().contains(restaurantDish)) {
				searchRestaurantList.add(restaurant);
			}
		}		
		return searchRestaurantList;
		
	}
	
}
