package commands;

import data.*;

	/* �j kos�r parancs
	 * newcart [user id-ja] [leend� kos�r id-ja]
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
				System.out.println("�j kos�r hozz�ad�sa sikeres.");
		    }
			else {
				System.out.println("�j kos�r hozz�ad�sa sikertelen.");
			}
	    }
	    else {
	    	System.out.println("Nem l�tezik ilyen felhaszn�l�.");
	    }
	
}
}
