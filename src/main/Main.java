package main;

import commands.*;
import data.*;
import tests.TestCase1;
import tests.TestCase2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static ArrayList<User> users = new ArrayList<>();
	public static ArrayList<Product> products = new ArrayList<>();

	public static void main(String[] args) {
		Command register = new Register();
		Command newCart = new NewCart();
		Command payCart = new PayCart();
		Command newProduct = new NewProduct();
		Command addProduct = new AddProduct();
		Command removeProduct = new RemoveProduct();
		
		HashMap<String,Command>	hash = new HashMap<String,Command>();
		hash.put("register", register);
		hash.put("newcart", newCart);
		hash.put("pay", payCart);
		hash.put("new", newProduct);
		hash.put("add", addProduct);
		hash.put("remove", removeProduct);
		Scanner sc = new Scanner(System.in);

		TestCase1 tc1 = new TestCase1();
		tc1.TestCase1Method();
		TestCase2 tc2 = new TestCase2();
		startMessage();
		
		while (true) {
			String row = sc.nextLine();
			String[] rowData = row.split(" ");
			if (rowData[0].equals("exit")) {
				System.out.println("A program leáll.");
				sc.close();
				break;
			}
			else{
				try {
				if(hash.containsKey(rowData[0])) {
				    Command o = hash.get(rowData[0]);
				    o.action(rowData);
				}
				else {
					System.out.println("Ismeretlen / helytelen formátumú parancs.");
				}
				}
				catch (Exception e) {
					System.out.println("Rossz formátumban megadott parancs");
				}
			}
		}
	}
	public static boolean findProduct(String pId){
	    if(products.stream().filter(p -> p.getId().equals(pId)).findFirst().isPresent()) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}
	public static boolean findUser(String uId){
	    if(users.stream().filter(u -> u.getId().equals(uId)).findFirst().isPresent()) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}
	public static User returnUser(String uId){
		return users.stream()
				  .filter(us -> uId.equals(us.getId()))
				  .findAny()
				  .orElse(null);	
		}
	public static Product returnProduct(String pId){
		return products.stream()
				  .filter(ps -> pId.equals(ps.getId()))
				  .findAny()
				  .orElse(null);	
		}
	public static void startMessage() {
		System.out.println("\nÜdvözöllek a LibraOrders könyvnyilvántartó rendszerben. Várom az utasításaidat :) ");
	}


}
