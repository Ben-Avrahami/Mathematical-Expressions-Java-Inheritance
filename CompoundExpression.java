
/**
 * This Class is a class Representing a Compound Expression
 * 
 * @author Ben Avrahami
 */
public  abstract class CompoundExpression extends Expression { 

	protected Expression _firstExp, _secondExp;//given the protected Access Modifier so other methods from different classes can access them without get functions

	/** 
	 * Constructor
	 * @param first First expression	
	 * @param second Second expression
	 */
	public CompoundExpression(Expression first, Expression second) {
		super();//call to the super constructor
		_firstExp=first; 
		_secondExp=second;
	}
}
