package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
	/*	EmailLogger logger=new EmailLogger();
		logger.logg("Log Mesajı");
	*/
		
		
	/*BaseLogger[] loggers=new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
		for(BaseLogger logger:loggers) {
			logger.logg("Log Mesajı");
		}*/
		
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.add();

	}
}
