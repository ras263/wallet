package exception;

/**
 * Exception caused by error with money processing.
 *
 * Created by Lakhno Anton
 * at 23:23 06.09.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0
 * @since 1.0.0
 */
public class MoneyOperationException extends WalletException {

	public MoneyOperationException(String message, Throwable cause) {
		super(message, cause);
	}

}
