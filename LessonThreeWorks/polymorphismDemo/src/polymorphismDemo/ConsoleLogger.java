package polymorphismDemo;

public class ConsoleLogger extends BaseLogger {
	public void logg(String message) {//override
		System.out.println("Logged to Console: "+message);
	}

}
