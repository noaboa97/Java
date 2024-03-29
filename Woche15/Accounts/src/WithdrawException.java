public class WithdrawException extends Exception{

    public WithdrawException() {
    }

    public WithdrawException(String message) {
        super(message);
    }

    public WithdrawException(String message, Throwable cause) {
        super(message, cause);
    }

    public WithdrawException(Throwable cause) {
        super(cause);
    }

    public WithdrawException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
