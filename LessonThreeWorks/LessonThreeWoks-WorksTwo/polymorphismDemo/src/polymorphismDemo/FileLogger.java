package polymorphismDemo;

public class FileLogger extends BaseLogger {
	public void logg(String message) {
		System.out.println("Logged to File: "+message);
	}

}
