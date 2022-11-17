
/**
 * This Class is a class Representing a Subtraction Expression
 * 
 * @author Ben Avrahami
 */
public class SubtractionExpression extends CompoundExpression {


	/**
	 * Constructor
	 * @param first First expression	
	 * @param second Second expression
	 */
	public SubtractionExpression(Expression first, Expression second) {
		super(first, second);//call to the super constructor
	}
	/**
	 * This Method calculates the result of the Subtraction Expression
	 */
	@Override
	public double calculate() {
		return _firstExp.calculate() - _secondExp.calculate();

	}
	/**
	 * String Representation
	 */
	public String toString() {
		return (_firstExp.toString() + " - (" + _secondExp.toString() + ")" );
	}
}
