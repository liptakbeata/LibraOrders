package commands;

import data.*;

	/* Term�k hozz�ad�sa a kos�rhoz parancs
	 * add [term�k id] [user id, akinek a kosar�hoz hozz�adjuk]
	 * Pl:
	 * add 1 1
	 */
public class AddProduct extends Command {

	public void action(String[] cmd) {
		try {
			String pId = cmd[1];
			String userId = cmd[2];
			AddProductAction(pId, userId);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	}
	public void AddProductAction(String pId, String userId) {
		if(main.Main.findUser(userId)==true && main.Main.findProduct(pId)==true)
	    {
			User ourUser = main.Main.returnUser(userId);
			Product ourProduct = main.Main.returnProduct(pId);
			if(ourUser !=null && ourProduct!=null)
		    {
				ourUser.getCart().addToCart(ourProduct);
		    	System.out.println(String.format("A(z) %s nev� term�k hozz�adva %s kosar�hoz.", ourProduct.getName(), ourUser.getName()));

		    }
	    }
	    else {
	    	System.out.println("Nem siker�lt a term�ket hozz�adni a kos�rhoz.");
	    }
	}

}
