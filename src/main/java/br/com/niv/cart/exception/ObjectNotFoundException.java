package br.com.niv.cart.exception;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 5032607183277373916L;

	public ObjectNotFoundException() {
		super();
	}

	public ObjectNotFoundException(String message) {
		super(message);
	}

	public ObjectNotFoundException(Throwable cause) {
		super(cause);
	}

}
