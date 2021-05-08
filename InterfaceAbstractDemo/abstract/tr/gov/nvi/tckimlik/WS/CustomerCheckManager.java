package tr.gov.nvi.tckimlik.WS;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public Result CheckIfRealPerson(Customer customer) {
		
		return  new  Result(true);
		
	}

	@Override
	public final  Result CheckIfYoungerAgeThan(Customer customer, int age) {
		LocalDate todayDateTime = LocalDate.now();
		LocalDate birthDate = customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int yearDifference = Period.between(birthDate, todayDateTime).getYears();
		if(yearDifference < age) {
			return new Result(false, age + " yaþýndan küçük olamaz.");
		}
		return new Result(true);
	}

}
