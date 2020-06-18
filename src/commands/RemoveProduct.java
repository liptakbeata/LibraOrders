package commands;

import data.Product;
import data.User;

	/* Termék eltávolítása a kosárból parancs
	 * remove [termék id] [user id, akinek a kosarából töröljük]
	 * Pl:
	 * remove 1 1
	 */
public class RemoveProduct extends Command {

	public void action(String[] cmd) {
		try {
			String pId = cmd[1];
			String userId = cmd[2];
			RemoveProductAction(pId, userId);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	}
	public void RemoveProductAction(String pId, String userId) {
		if(main.Main.findUser(userId)==true && main.Main.findProduct(pId)==true)
	    {
			User ourUser = main.Main.returnUser(userId);
			Product ourProduct = main.Main.returnProduct(pId);
			if(ourUser !=null && ourProduct!=null)
		    {
				ourUser.getCart().removeFromCart(ourProduct);
		    	System.out.println("Termék törölve a kosárból.");

		    }
	    }
	    else {
	    	System.out.println("Nem sikerült a terméket eltávolítani a kosárból.");
	    }
	}

}
