
/**
 * This Class is an Abstract class Representing an Expression
 * 
 * @author Ben Avrahami
 */
public abstract class Expression {

	public abstract double calculate();//will be implemented by the succeeding classes 
	/**
	 * This Method Checks if 2 Expression objects hold the same value and are equal. 
	 */
	@Override
	public boolean equals(Object o) {
		if(o instanceof Expression && this.calculate()==((Expression)o).calculate())
			return true;
		else 
			return false;

	}
	/*
    A method for rounding the number to two digits after the decimal point
	 */
	public static double round(double number)
	{
		number = (Math.round(number*100));
		return number/100;


	}


	public abstract String toString();

}
