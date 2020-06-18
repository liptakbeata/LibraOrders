package commands;

import java.io.IOException;
import main.Main;
import commands.*;
import data.*;

public class Register extends Command {
	
	/* Regisztr�ci� parancs
	 * register [user id-ja] [user neve]
	 * Pl:
	 * register 1 Anna
	 */
	
	public void action(String[] cmd) {
		try {
			String userId = cmd[1];
			String userName = cmd[2];
			RegisterAction(userId, userName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void RegisterAction(String userId, String userName) {
		if(main.Main.findUser(userId)==false)
	    {
	    	User newUser = new User(userId, userName);
	    	main.Main.users.add(newUser);
	    	System.out.println(String.format("Regisztr�ci� sikeres (%s)", newUser.getName()));
	    }
	    else {
	    	System.out.println("L�tezik m�r user ilyen id-val.");
	    }
	}
}

