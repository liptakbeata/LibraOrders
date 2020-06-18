package tests;

import commands.*;

public class TestCase1 {

	public TestCase1() {}
	
	public void TestCase1Method() {
		System.out.println("\nTestCase 1:");
		Register register = new Register();
		NewCart newCart = new NewCart();
		PayCart payCart = new PayCart();
		NewProduct newProduct = new NewProduct();
		AddProduct addProduct = new AddProduct();
		RemoveProduct removeProduct = new RemoveProduct();

		register.RegisterAction("1", "Anna");
		newCart.NewCartAction("1", "1");
		newProduct.NewProductAction("D15", "Szabó Magda: Für Elise", 250);
		newProduct.NewProductAction("A20", "ceruza", 50);
		addProduct.AddProductAction("A20", "1");
		addProduct.AddProductAction("D15", "1");
		removeProduct.RemoveProductAction("D15", "1");
		payCart.PayCartAction("1");
	}

}
