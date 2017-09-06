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
	//average the input
	public static double average (double operand1, double operand2, double operand3 ) {
		double averaged = (operand1+operand2+operand3)/3;
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
}