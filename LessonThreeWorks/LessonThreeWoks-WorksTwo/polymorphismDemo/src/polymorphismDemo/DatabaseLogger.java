package polymorphismDemo;

public class DatabaseLogger extends BaseLogger {
	public void logg(String message) {
		System.out.println("Logged to Database: "+message);
	}

}
