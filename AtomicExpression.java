
/**
 * This Class is a class Representing a Atomic Expression
 * 
 * @author Ben Avrahami
 */
public class AtomicExpression extends Expression {
	private double _number;
	/**
	 * Constructor
	 * @param num The number to be contained in the Atomic Expression
	 */
	public AtomicExpression(double num) {
		super();//call to the super constructor
		_number = num;
	}
	/**
	 * This Method calculates the result of the Atomic Expression (returns the number contained in the Atomic Expression)
	 */
	@Override
	public double calculate() {

		return _number;
	}

	/**
	 * String Representation
	 */
	public String toString() {
		return (_number + "");
	}
}
