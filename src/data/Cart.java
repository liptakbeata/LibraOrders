package data;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {
	private String cartId;
	private User cartOwner;
	private boolean payed;
	private ArrayList<Product> cartProducts = new ArrayList<Product>();
	
	public Cart (String cartId, User owner) {
		this.cartId = cartId;
		this.cartOwner = owner;
		this.payed = false;
	}
	public String getId() {
	    return cartId;
	}
	public User getOwner() {
	    return cartOwner;
	}
	public boolean getPayed() {
	    return payed;
	}
	public void setPayed(boolean payed) {
	    this.payed = payed;
	}
	public void addToCart(Product p) {
		this.cartProducts.add(p);
	}
	public void removeFromCart(Product p) {
		this.cartProducts.remove(p);
	}
}
