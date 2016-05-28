package builders;

import products.AccountType;
import products.Commissions;

//Concrete builder for gold account.
public class GoldAccountBuilder extends AccountBuilder {

	@Override
	public void setType() {
		account.setType(AccountType.GOLD);

	}

	@Override
	public void setCommission() {
		account.setCommision(Commissions.GOLD_COMMISSION);

	}

}
