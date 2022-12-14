package polymorphismDemo;

public class CustomerManager{
	
private BaseLogger baseLogger;

public  CustomerManager (BaseLogger logger){
	this.baseLogger=logger;
	
}
	public void add() {
		System.out.println("Müşteri Eklendi");
		/*DatabaseLogger logger=new DatabaseLogger();
		logger.Logg("Log Mesajı");*/
		this.baseLogger.logg("Log Mesajı");
	
	}

}
