package tr.gov.nvi.tckimlik.WS;
public class StarbucksCustomerManager extends CustomerManager {
	
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService)
	{
		this.customerCheckService=customerCheckService;
		
	}
	
	@Override
	public void save(Customer customer)
	{
		Result result =  CheckServiceUtil.runCheckServices(new Result[] {
				customerCheckService.CheckIfRealPerson(customer), 
				customerCheckService.CheckIfYoungerAgeThan(customer, 15)
				});
		
		if(!result.isSuccess()) {
			System.out.println(result.getMessage());
			return;
		}
		
		super.save(customer);
		
	}

}

