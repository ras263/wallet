package entity;

import exception.MoneyOperationException;
import exception.UncompatibleCurrenciesException;

/**
 * Money value object.
 *
 * Created by Lakhno Anton
 * at 22:41 06.09.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0
 * @since 1.0.0
 */
public class Money {

	private Double amount;
	private Currency currency;

	public Money(Double amount, Currency currency) {
		this.amount = amount;
		this.currency = currency;
	}

	/**
	 * Adding operation with money.
	 * @param addend Addend.
	 * @return new {@link Money} object.
	 * @throws MoneyOperationException Signalises about error while processing money objects.
	 */
	public Money add(Money addend) throws MoneyOperationException {
		try {
			compareCurrenciesAndThrowException(this.currency, addend.currency);
		} catch (UncompatibleCurrenciesException e) {
			throw new MoneyOperationException("Can't add money.", e);
		}
		return new Money((this.amount + addend.amount), this.currency);
	}

	/**
	 * Compare currencies within compared money objects.
	 * @param first First currency.
	 * @param second Second currency.
	 * @return Sign are this currencies equals.
	 */
	private boolean compareCurrencies(Currency first, Currency second) {
		return first.equals(second);
	}

	/**
	 * Compare currencies within compared money objects and throw exception if they aren't equals.
	 * @param first First currency.
	 * @param second Second currency.
	 * @throws UncompatibleCurrenciesException thrown if currencies aren't equals.
	 */
	private void compareCurrenciesAndThrowException(Currency first, Currency second)
			throws UncompatibleCurrenciesException {
		if (!compareCurrencies(first, second)) {
			throw new UncompatibleCurrenciesException(
					String.format("Comparable money objects has various currencies: '%s' and '%s'.",
							first.getShortName(), second.getShortName()));
		}
	}

	@Override
	public String toString() {
		return "Money{" +
				"amount=" + amount +
				", currency=" + currency +
				'}';
	}

}
