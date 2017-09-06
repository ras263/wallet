package exception;

/**
 * Root exception.
 *
 * Created by Lakhno Anton
 * at 23:09 06.09.17.
 *
 * @author Lakhno Anton
 * @version 1.0.0
 * @since 1.0.0
 */
public class WalletException extends Exception {

	public WalletException() {
	}

	public WalletException(String message) {
		super(message);
	}

	public WalletException(String message, Throwable cause) {
		super(message, cause);
	}

	public WalletException(Throwable cause) {
		super(cause);
	}

	public WalletException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
