package commands;

import data.Product;
import data.User;

	/* Term�k elt�vol�t�sa a kos�rb�l parancs
	 * remove [term�k id] [user id, akinek a kosar�b�l t�r�lj�k]
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
		    	System.out.println("Term�k t�r�lve a kos�rb�l.");

		    }
	    }
	    else {
	    	System.out.println("Nem siker�lt a term�ket elt�vol�tani a kos�rb�l.");
	    }
	}

}
