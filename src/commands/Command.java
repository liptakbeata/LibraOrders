package commands;

public abstract class Command {

	public Command() {
		
	}
	public String getName() {
		return "";
	}
	public void action(String[] cmd) {}
}
