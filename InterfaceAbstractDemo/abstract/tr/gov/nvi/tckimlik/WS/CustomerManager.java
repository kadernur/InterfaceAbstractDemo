package tr.gov.nvi.tckimlik.WS;

public  abstract class CustomerManager implements CustomerService {

	
	
	@Override
	public void save(Customer customer) {
		
		System.out.println(customer.getFirstName()+"baþarýlý þekilde kaydedildi. ");
		
		
	}

}
