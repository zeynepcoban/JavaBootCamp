package polymorphismDemo;

public class EmailLogger extends BaseLogger {
	public void logg(String message) {//override
		System.out.println("Logged to E-Mail: "+message);
	}

}
