/* PROBLEM 4:
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 Å~ 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
*/

import java.util.ArrayList;
import java.util.Collections;

public class pe4 {

	public static void main(String[] args) {
		ArrayList<Integer> pals = new ArrayList<Integer>();
		
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				
				int num = i * j;
				/* If the number is divisible by 10 (i.e. ends with a 0) then it
				 * can't be palidromic, and there is no need to check it.
				 */
				if (num % 10 != 0) {
					String forward = Integer.toString(num);
					String backward = new StringBuffer(forward).reverse().toString();
					if (forward.equals(backward)) {
						pals.add(Integer.parseInt(forward));
					}
				}
				
			}
		}
		
		System.out.println(Collections.max(pals));

	}

}
