/*Victoria Ng
 * Nov 1 2017
 * Array MiniLab
 */
import java.util.Arrays;

public class LotsOfCopies {
		public static void main (String [] args) {
			int num = 7;
			String strMain = "APCS";
			int[] arrMain = {1, 2, 3, 4, 5};
			
			LotsOfCopies.changeMe(num, strMain, arrMain);
			
			System.out.println(num);
			System.out.println(strMain);
			System.out.println(Arrays.toString(arrMain));
			
			int a = 5;
			int b = a;
			a = 10;
			
			System.out.println(b);
			
			String c = "two";
			String d = c;
			c = "98";
			
			System.out.println(d);
			
			int[] e = {5,2,3,4};
			int[] f = e;
			e[1]=10;
			e[3]=3;
			System.out.println(Arrays.toString(f));
		}
		
		public static void changeMe (int x, String str, int[] arr) {
			x = 2;
			str = "4";
			arr[0] = 2;
			arr[1] = 3;
			arr[2] = 4;
			arr[3] = 5;
			arr[4] = 6;
		}
	}

