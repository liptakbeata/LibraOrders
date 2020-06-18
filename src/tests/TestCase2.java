package tests;

import commands.AddProduct;
import commands.NewCart;
import commands.NewProduct;
import commands.PayCart;
import commands.Register;
import commands.RemoveProduct;

public class TestCase2 {

	public TestCase2() {
		System.out.println("\nTestCase 2:");
		Register register = new Register();
		NewCart newCart = new NewCart();
		PayCart payCart = new PayCart();
		NewProduct newProduct = new NewProduct();
		AddProduct addProduct = new AddProduct();
		RemoveProduct removeProduct = new RemoveProduct();

		register.RegisterAction("5", "Dániel");
		register.RegisterAction("7", "Csaba");

		newCart.NewCartAction("5", "1");
		newCart.NewCartAction("7", "15");

		newProduct.NewProductAction("L15", "Lev Tolsztoj: Anna Karenina", 250);
		newProduct.NewProductAction("K10", "kartonpapír", 40);
		addProduct.AddProductAction("K10", "5");
		addProduct.AddProductAction("K10", "7");
		addProduct.AddProductAction("L15", "7");
		removeProduct.RemoveProductAction("L15", "7");
		payCart.PayCartAction("5");
		payCart.PayCartAction("7");

		}

}
