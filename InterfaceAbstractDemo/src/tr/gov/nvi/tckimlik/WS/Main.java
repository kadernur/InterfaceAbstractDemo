package tr.gov.nvi.tckimlik.WS;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) 

	{

		Customer enginCustomer = new Customer();
		enginCustomer.setId(1);
		enginCustomer.setIdentityNumber("1126011260");
		enginCustomer.setFirstName("Kader");
		enginCustomer.setLastName("Tekin");
		enginCustomer.setBirthDate(new GregorianCalendar(1999, 06 , 24).getTime());
			
			
CustomerCheckService customerCheckService = new StarbucksCustomerCheckManager(new MernisServiceAdapter());
		
		CustomerService customerService = new StarbucksCustomerManager(customerCheckService);
		customerService.save(enginCustomer);
		
		
	
		
		

	
}
}


