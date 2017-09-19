/*Victoria Ng
 * September 6, 2017
 * This is the runner for the Calculate Library; it is used to test the methods in Calculate
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(-7));
		System.out.println(Calculate.cube(-7));
		System.out.println(Calculate.average(6.4, 8.0, 9.4));
		System.out.println(Calculate.average(6.4, 8.0));
		System.out.println(Calculate.toDegrees(0.5));
		System.out.println(Calculate.toRadians(60));
		System.out.println(Calculate.discriminant(3,7,5));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(2,3,6,-7,"n"));
		System.out.println(Calculate.isDivisibleBy(4,8));
		System.out.println(Calculate.absValue(-6));
		System.out.println(Calculate.max(4,7));
	}

}
