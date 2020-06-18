package data;

import java.util.ArrayList;

public class Product {
	private String productId;
	private String productName;
	private int productPrice;
	
	public Product (String productId, String productName, int productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public String getId() {
	    return productId;
	}
	public String getName() {
	    return productName;
	}
	public int getPrice() {
	    return productPrice;
	}
}
