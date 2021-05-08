package tr.gov.nvi.tckimlik.WS;
public class CheckServiceUtil {
	
	public static Result runCheckServices(Result[] customerCheckServices) {
		for (Result customerCheckService : customerCheckServices) {
			if(!customerCheckService.isSuccess()) {
				return customerCheckService;
			}
		}
		return new Result (true);
	}
}
