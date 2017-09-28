/*Victoria Ng
 * September 6, 2017
 * Our self written math library
 * It contains a series of methods to do basic math functions.
 */
public class Calculate {
//part 1
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

//part 2
	//isDivisibleBy: determines whether one integer is evenly divisible by another
	//parameters: two integers, returns a Boolean
	//throws exception if inputs are 0
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

	//absValue
	//returns the value of the number passed, accepts a double and returns a double
	public static double absValue (double a) {
		if ( a>0) {
          	return a;
		} else {
    			return a*-1;
    	}
}

	//max
	//returns the greater of the values passed
	//accepts 2 doubles and returns a double
	public static double max (double num1, double num2) {
		if (num1>num2) {
			return num1;
		} else {
		return num2;
	}
}

	//max (overload)
	//accepts 3 doubles, returns a double
	public static double max (double number1, double number2, double number3) {
		if (number1 > number2 && number1 > number3) {
			return number1;
		} else if (number2 > number1 && number2 > number3) {
			return number2;
		} else {
			return number3;
	}
}

	//min
	//returns the smaller of the 2 values passed
	//accepts 2 integers, returns an integer
	public static int min (int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
}

	//round2
	//rounds a double to 2 decimal places, returns a double
	public static double round2 (double value) {
		value = (value*100) + 0.5;
		value = (int) value;
		value = (double) value;
		value = value/100;
		return value;
	}

//part 3
	//exponent
	// accepts a double and an integer and returns a double
	// raises a value to a positive integer power
	// throws exception if the input for power is negative
	public static double exponent (double base, int power) { 
		if (power < 0) {
			throw new IllegalArgumentException("negative exponent: " + power);
		}
		double answer = 1;
		for (int i = 1; i <= power; i++) {
			answer *= base;
		}
		return answer;
	}
	
	//factorial
	// accepts an integer and returns an integer
	// returns the factorial of the value passed
	// throws exception if input is negative
	public static int factorial (int a) { 
		if (a < 0) {
			throw new IllegalArgumentException("negative a: " + a);
		}
		int answer = 1;
	    for ( int i = 2; i <= a; i++ ) {  
	        answer *= i;
	    }  
	    return answer;
	}  
	
	//isPrime
	// accepts an integer and returns a boolean, determines whether or not an integer is prime
	public static boolean isPrime (int a) { 
	    boolean check;
	    if (a > 1) {
	    	for (int i = a - 1; i > 1; i--) {
	    		check = Calculate.isDivisibleBy(a, i);
	    		if (check == true) {
	    			return false;
	    		}
	    	}
	    } else {
	    	return false;
	    }
	    return true;
		}

	//gcf
	// accepts two positive integers and returns an integer, finds the greatest common factor of two integers
	public static int gcf (int num1, int num2) { 
		while (num2 != 0) {
			int c = num1;
			num1 = num2;
			num2 = c % num2;
		}
		return (int)Calculate.absValue(num1);
	}
	
	//sqrt
	// accepts and returns a double
	// returns an approximation of the square root of the value passed, accurate to two decimal places
	// throws exception if input is negative
	public static double sqrt (double a) { 
		if (a < 0) {
			throw new IllegalArgumentException ("negative a:" + a);
		}
		return Math.sqrt(a);
	}
}
	