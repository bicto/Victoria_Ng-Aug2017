/*Victoria Ng
 * September 6, 2017
 * Our self written math library
 * It contains a series of methods to do basic math functions.
 */
public class Calculate {

	//square the input
	public static int square (int operand) {
		int squared = operand*operand;
		return squared;
	}
	//cube the input
	public static int cube (int operand) {
		int cubed = operand*operand*operand;
		return cubed;
	
	}
	//average the input w/ three doubles
	public static double average (double operand1, double operand2, double operand3 ) {
		double averaged = (operand1+operand2+operand3)/3;
		return averaged;
	}
		//average the input w/ two doubles
		public static double average (double operand1, double operand2) {
			double averaged = (operand1+operand2)/2;
			return averaged;
	}
	//converts radians to degrees
	public static double toDegrees (double operand) {
		double converted = operand*(180/3.14159);
		return converted;
	}
	//converts degrees to radians
	public static double toRadians (double operand) {
		double converted = operand*(3.14159/180);
		return converted;
	}
	//returns discriminant with values of coefficients of a quadratic equation
	public static double discriminant (int a, int b, int c) {
		double discriminants = b^2 - 4*a*c;
		return discriminants;
	}
	
	public static String toImproperFrac (int number, int numerator, int denominator) {
    	int toImproperFrac = (number*denominator + numerator);
    	return toImproperFrac + "/" + denominator;
}

//toMixedNum
public static String toMixedNum (int numerator, int denominator) {
    	int x= (numerator/denominator);
    	int y = (numerator%denominator);
    	String toMixedNum = x + " " + (y + "/" + denominator);
    	return toMixedNum;
}

//foil
public static String foil (int a, int b, int c, int d, String x) {
    	int term1 = (a*c);
    	int term2 = (a*d) + (b* c);
    	int term3 = (b*d);
    	String foil = term1 + x + "^2+" + term2 + x + "+" + term3;
    	return foil;
}
/*
//determines whether one integer is evenly divisible by another
//parameters: two integers, returns a Boolean
*/
public static Boolean isDivisibleBy (int num1, int num2) {
    	if (num2 == 0 || num1 == 0) {
                	throw new IllegalArgumentException ("divisor : 0");
    	}
    	if (num1 % num2 == 0 || num2 % num1 == 0) {
                	return true;
    	} else {
                	return false;
    	}
}

/*
//returns the value of the number passed, accepts a double and returns a double
*/
public static double absValue (double a) {
    	if ( a>0) {
          	return a;
    	} else {
    		return a*-1;
    	}
}

/*
//returns the greater of the values passed
//accepts 2 doubles and returns a double
*/
public static double max (double num1, double num2) {
    	if (num1>num2) {
    		return num1;
    } else {
		return num2;
	}
}

/*
//accepts 3 doubles, returns a double
*/
public static double max (double number1, double number2, double number3) {
	if (number1 > number2 && number1 > number3) {
		return number1;
	} else if (number2 > number1 && number2 > number3) {
	return number2;
	} else {
	return number3;
	}
}

/* 
//returns the smaller of the 2 values passed
//accepts 2 integers, returns an integer
*/
public static int min (int num1, int num2) {
	if (num1 < num2) {
	return num1;
} else {
	return num2;
}
}

/*
//rounds a double to 2 decimal places, returns a double
*/
	public static double round2 (double value) {
		value = (value*100) + 0.5;
		value = (int) value;
		value = (double) value;
		value = value/100;
		return value;
	}
}
