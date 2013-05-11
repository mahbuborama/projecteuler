/* PROBLEM 1:
 * If we list all the natural numbers below 10 that are multiples of 3 or
 * 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class pe1 {
	
	public static void main(String[] args) {
		int the_sum = 0;
		
		/* Loop through all numbers below 1000 and use the modulus operator to see if
		 * 'i' is a multiple of 3 or 5, i.e. if it has a remainder of 0 when divided 
		 * by 3 or 5. If 'i' is a multiple of 3 or 5, add it to our total sum.
		 */
		for (int i=0; i<1000; i++) {
			if ((i % 3 == 0) | (i % 5 == 0))
				the_sum = the_sum + i;
		}
		
		System.out.println(the_sum);
	}

}
