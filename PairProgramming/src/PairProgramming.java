/*Victoria Ng
 * Pair Programming Activity
 * November 1 2017
 * Period 2
 */
import java.util.*;
public class PairProgramming {
		public static void main (String[] args){
			Scanner userInput = new Scanner (System.in);
			int evenMax = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			int evenTotal = 0;
			System.out.println("How many loops do you want?");
			int loops = userInput.nextInt();
			for (int number = 1; number <= loops; number++){
				System.out.println("Enter in next number");
				int nextNumber = userInput.nextInt();
				if (nextNumber % 2 == 0){
					evenTotal += nextNumber;
					if(nextNumber > evenMax){
						evenMax = nextNumber;
					}
				}
				if (nextNumber > max){
					max = nextNumber;
					
				}
				
				
				
				if (nextNumber < min){
				min = nextNumber;
				}
				
				
			}
			System.out.println("Largest number is: " + max);
			System.out.println("Smallest number is: " + min);
			System.out.println("Largest Even number is: " + evenMax);
			System.out.println("Even Total is: " + evenTotal);
			
		}	

}
