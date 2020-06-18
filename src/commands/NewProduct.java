package commands;

import data.Product;
import data.User;

public class NewProduct extends Command {

	/* �j term�k parancs
	 * new [term�k id-ja] [term�k neve] [term�k �ra]
	 * Pl:
	 * new 1 Doboz 500
	 */
	public void action(String[] cmd) {
		try {
			String pId = cmd[1];
			String pName = cmd[2];
			int pPrice = Integer.parseInt(cmd[3]);
			NewProductAction(pId, pName, pPrice);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	}
	public void NewProductAction(String pId, String pName, int pPrice) {
		if(main.Main.findProduct(pId)==false)
	    {
	    	Product newProduct = new Product(pId, pName, pPrice);
	    	main.Main.products.add(newProduct);
	    	System.out.println("Term�k l�trehoz�sa sikeres!");
	    }
	    else {
	    	System.out.println("L�tezik m�r term�k ilyen id-val!");
	    }
	}
}
