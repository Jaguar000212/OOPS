class NoNegativeException extends Exception {
    NoNegativeException(String message) {
        super(message);
    }

    NoNegativeException(String message, Throwable cause) {
        super(message, cause);
    }

    NoNegativeException(Throwable cause) {
        super(cause);
    }
}

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }

    InsufficientFundsException(String message, Throwable cause) {
        super(message, cause);
    }

    InsufficientFundsException(Throwable cause) {
        super(cause);
    }
}
