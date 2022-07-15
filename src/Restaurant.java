
public class Restaurant {

	private String restaurantName;
	private String restaurantDish;
	private String cost;
	
	public Restaurant() {
		
	}
	
	public Restaurant(String restaurantName, String restaurantDish, String cost) {
		super();
		this.restaurantName = restaurantName;
		this.restaurantDish = restaurantDish;
		this.cost = cost;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantDish() {
		return restaurantDish;
	}

	public void setRestaurantDish(String restaurantDish) {
		this.restaurantDish = restaurantDish;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantName=" + restaurantName + ", restaurantDish=" + restaurantDish + ", cost=" + cost
				+ "]";
	}
	
	
}
