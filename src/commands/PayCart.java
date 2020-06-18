package commands;

import data.*;

	/* Kosár fizetése parancs
	 * pay [user id-ja, akinek a kosarát kifizetjük]
	 * Pl:
	 * paycart 1
	 */

public class PayCart extends Command {

	public void action(String[] cmd) {
		try {
			String userId = cmd[1];
			PayCartAction(userId);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void PayCartAction(String userId) {
		if(main.Main.findUser(userId)==true)
	    {
			User ourUser = main.Main.returnUser(userId);
			Cart ourCart = ourUser.getCart();
			if(ourUser !=null && ourCart!=null)
		    {
				ourCart.setPayed(true);
				System.out.println(String.format("%s kosara kifizetve.", ourUser.getName()));

		    }
			else {
				System.out.println("Nem sikerült a kosarat kifizetni!");
			}
	    }
	    else {
	    	System.out.println("Nem található user a megadott ID-val!");
	    }
	}

}
