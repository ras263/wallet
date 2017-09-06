package entity.service.currency;

import entity.Currency;
import entity.Money;

/**
 * Domain service for operating with currencies.
 *
 * Created by Lakhno Anton
 * at 22:34 06.09.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0
 * @since 1.0.0
 */
public class CurrencyDomainService {

	//todo Anton Implement this method.
	/**
	 * Transform amount of money to relevant amount with another currency.
	 * @param from Source money value object.
	 * @param targetCurrency Target currency.
	 * @return new {@link Money} object with new amount and currency.
	 */
	public Money recountToCurrency(Money from, Currency targetCurrency) {
		return null;
	}

}
