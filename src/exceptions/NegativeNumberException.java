package exceptions;

public class NegativeNumberException extends Exception{
	
	public NegativeNumberException() {
		super("A negative weight cannot be added");
	}
	

}