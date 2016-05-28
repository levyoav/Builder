package builders;

import products.AccountType;
import products.Commissions;

//Concrete builder for regular account.
public class RegularAccountBuilder extends AccountBuilder {

	@Override
	public void setType() {
		account.setType(AccountType.REGULAR);

	}

	@Override
	public void setCommission() {
		account.setCommision(Commissions.REGULAR_COMMISSION);

	}

}
