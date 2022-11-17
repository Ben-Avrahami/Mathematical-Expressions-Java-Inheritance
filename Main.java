import java.util.ArrayList;
import java.util.Random;


public class Main
{
	public static void main (String [] args)
	{
		// Create an ArrayList object
		ArrayList<Expression> expressions = new ArrayList<>();

		// Creating expressions of different types
		Expression num0 = new AtomicExpression(generateRandomNumber());
		Expression num1 = new AtomicExpression(generateRandomNumber());
		Expression num2 = new AtomicExpression(generateRandomNumber());
		Expression num3 = new AtomicExpression(generateRandomNumber());
		Expression num4 = new AtomicExpression(generateRandomNumber());
		AtomicExpression num5 = new AtomicExpression(generateRandomNumber());
		AtomicExpression num6 = new AtomicExpression(generateRandomNumber());
		AtomicExpression num7 = new AtomicExpression(generateRandomNumber());
		AtomicExpression num8 = new AtomicExpression(generateRandomNumber());
		AtomicExpression num9 = new AtomicExpression(generateRandomNumber());
		Expression num10 = new AdditionExpression(num1,num9);
		Expression num11 = new AdditionExpression(num7,num3);
		Expression num12 = new AdditionExpression(num2,num5);
		Expression num13 = new AdditionExpression(num11,num0);
		Expression num14 = new AdditionExpression(num4,num9);
		CompoundExpression num15 = new AdditionExpression(num2,num11);
		CompoundExpression num16 = new AdditionExpression(num1,num2);
		CompoundExpression num17 = new AdditionExpression(num13,num15);
		CompoundExpression num18 = new AdditionExpression(num8,num16);
		CompoundExpression num19 = new AdditionExpression(num2,num15);
		AdditionExpression num20 = new AdditionExpression(num0,num16);
		AdditionExpression num21 = new AdditionExpression(num0,num12);
		AdditionExpression num22 = new AdditionExpression(num4,num18);
		AdditionExpression num23 = new AdditionExpression(num8,num5);
		AdditionExpression num24 = new AdditionExpression(num10,num14);
		Expression num25 = new SubtractionExpression(num12,num7);
		Expression num26 = new SubtractionExpression(num6,num8);
		Expression num27 = new SubtractionExpression(num16,num19);
		Expression num28 = new SubtractionExpression(num20,num21);
		Expression num29 = new SubtractionExpression(num9,num27);
		CompoundExpression num30 = new SubtractionExpression(num21,num18);
		CompoundExpression num31 = new SubtractionExpression(num11,num11);
		CompoundExpression num32 = new SubtractionExpression(num7,num5);
		CompoundExpression num33 = new SubtractionExpression(num21,num1);
		CompoundExpression num34 = new SubtractionExpression(num4,num32);
		SubtractionExpression num35 = new SubtractionExpression(num22,num27);
		SubtractionExpression num36 = new SubtractionExpression(num5,num19);
		SubtractionExpression num37 = new SubtractionExpression(num1,num18);
		SubtractionExpression num38 = new SubtractionExpression(num36,num6);
		SubtractionExpression num39 = new SubtractionExpression(num5,num16);
		SubtractionExpression num40 = new SubtractionExpression(num32,num8);


		//Adding variables to ArrayList

		expressions.add(num0);
		expressions.add(num1);
		expressions.add(num2);
		expressions.add(num3);
		expressions.add(num4);
		expressions.add(num5);
		expressions.add(num6);
		expressions.add(num7);
		expressions.add(num8);
		expressions.add(num9);
		expressions.add(num10);
		expressions.add(num11);
		expressions.add(num12);
		expressions.add(num13);
		expressions.add(num14);
		expressions.add(num15);
		expressions.add(num16);
		expressions.add(num17);
		expressions.add(num18);
		expressions.add(num19);
		expressions.add(num20);
		expressions.add(num21);
		expressions.add(num22);
		expressions.add(num23);
		expressions.add(num24);
		expressions.add(num25);
		expressions.add(num26);
		expressions.add(num27);
		expressions.add(num28);
		expressions.add(num29);
		expressions.add(num30);
		expressions.add(num31);
		expressions.add(num32);
		expressions.add(num33);
		expressions.add(num34);
		expressions.add(num35);
		expressions.add(num36);
		expressions.add(num37);
		expressions.add(num38);
		expressions.add(num39);
		expressions.add(num40);




		// Print the expressions
		for (int i = 0 ; i < expressions.size() ; i ++)
		{
			System.out.println("Expression" + i + " = " +  expressions.get(i).toString()  + " = " + Expression.round(expressions.get(i).calculate()));
		}

		System.out.println();
		//Checks for and prints expressions with equal values
		for (int i = 0 ; i < expressions.size() ; i ++)
		{
			for (int j = i+1 ; j < expressions.size() ; j ++)
			{
				if (i != j && expressions.get(i).equals(expressions.get(j)))
					System.out.println(
							"Equal Expressions Found! \n" +
									"Expression" + i + " = " + expressions.get(i).toString() + " = "  + Expression.round(expressions.get(i).calculate())  + "\n" +
									"Expression" + j + " = " + expressions.get(j).toString() + " = " + Expression.round(expressions.get(j).calculate()) + "\n" 
							);
			}
		}
	}

	/*
    Generating a random number between 0 and 100
	 */
	static double generateRandomNumber()
	{
		Random rand = new Random();
		return ((rand.nextInt(1001))/100.0);
	}

}
