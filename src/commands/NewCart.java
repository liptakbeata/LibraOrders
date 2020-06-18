package commands;

import data.*;

	/* Új kosár parancs
	 * newcart [user id-ja] [leendõ kosár id-ja]
	 * Pl:
	 * newcart 1 13
	 */

public class NewCart extends Command {
	public void action(String[] cmd) {
		try {
			String userId = cmd[1];
			String cartId = cmd[2];
			NewCartAction(userId, cartId);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void NewCartAction(String userId, String cartId) {
		if(main.Main.findUser(userId)==true)
	    {
			User ourUser = main.Main.returnUser(userId);
			if(ourUser !=null)
		    {
				Cart newCart = new Cart(cartId, ourUser);
				ourUser.setCart(newCart);
				System.out.println("Új kosár hozzáadása sikeres.");
		    }
			else {
				System.out.println("Új kosár hozzáadása sikertelen.");
			}
	    }
	    else {
	    	System.out.println("Nem létezik ilyen felhasználó.");
	    }
	
}
}
