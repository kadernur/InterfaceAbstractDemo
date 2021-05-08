
package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;
import java.time.ZoneId;

public class MernisServiceAdapter implements RealPersonService {

	@Override
	public Result CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getIdentityNumber()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), 
					customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
					);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result) {
			return new Result(true);
			
		}else {
			return new  Result(false, "kimlik doðrulama baþarýsýz.");
		}
	}


}
