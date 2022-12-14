package Interfaces;

public class Main {

	public static void main(String[] args) {
		/*ICustomerDal customerDal=new ICustomerDal() { INTERFACELER NEWLENEMEZ
			
			@Override
			public void add() {
			}
		};*/
		ICustomerDal customerDal=new OracleCustomerDal();//Interface onu implemente eden classın referansını tutabilir.
		
		//Extends Ve Implementes farkı: Bir class birden fazla ınterface'yi implemente edebilir. Ama 1 classı extends ettirebilr.
		
		//------------------------------------------------------------------------------
		
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
		//customerManager.customerDal=new OracleCustomerDal();
		customerManager.add();
		

	}

}
