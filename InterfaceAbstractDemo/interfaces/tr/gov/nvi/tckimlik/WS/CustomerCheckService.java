package tr.gov.nvi.tckimlik.WS;
public interface CustomerCheckService
{
	
	
	Result  CheckIfRealPerson(Customer customer);
	Result  CheckIfYoungerAgeThan(Customer customer, int age);
	
	
}
