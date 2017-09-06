package jmx;

/**
 * JMX interface for {@link service.CurrencyService}.
 *
 * Created by Lakhno Anton
 * at 22:57 06.09.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0
 * @since 1.0.0
 */
public interface CurrencyServiceControlMXBean {

	void updateExchangeRates() throws Exception;

}
