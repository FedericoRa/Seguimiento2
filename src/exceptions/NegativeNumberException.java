package exceptions;

public class NegativeNumberException extends Exception{
	
	public NegativeNumberException(String name, double w) {
		super("No se puede agregar un peso negativo");
	}
	

}