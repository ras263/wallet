package service;

import jmx.CurrencyServiceControlMXBean;

/**
 * Infrastructure service for working with currencies.
 *
 * Created by Lakhno Anton
 * at 22:51 06.09.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0
 * @since 1.0.0
 */
public class CurrencyService implements CurrencyServiceControlMXBean {

	/**
	 * Collect info from external API and put it into the memory.
	 */
	@Override
	public void updateExchangeRates() {

	}

}
