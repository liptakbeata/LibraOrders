package data;

public class User {
	private String userId;
	private String name;
	private Cart userCart;
	
	public User (String userId, String name) {
		this.userId = userId;
		this.name = name;
	}
	public String getId() {
	    return userId;
	}
	public String getName() {
	    return name;
	}
	public Cart getCart() {
	    return userCart;
	}
	public void setCart(Cart userCart) {
	    this.userCart = userCart;
	}

}
