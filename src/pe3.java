/* PROBLEM 3:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

import java.lang.Math;

public class pe3 {
	
	static final double N = 600851475143D;
	
	public static void main(String[] args) {
		System.out.println(ferfac(N));
	}
	
	/* Implementation of Fermat's factorization method, with some modifications:
	 * http://en.wikipedia.org/wiki/Fermat%27s_factorization_method
	 * 
	 * Once the algorithm finds two factors for 'num', it checks to see if the bigger
	 * factor is prime. If not, then it checks the smaller factor. If neither are prime, then
	 * the function calls itself again for each argument. The results of these recursive calls are 
	 * checked to see which of the two original factors yields the biggest prime factor, and it
	 * returns that prime factor.
	 */
	public static double ferfac(double num) {
		double x = Math.ceil(Math.sqrt(num));
		double y_sq = Math.pow(x, 2) - num;
		
		while (Math.sqrt(y_sq) != (int) Math.sqrt(y_sq)) {
			x++;
			y_sq = Math.pow(x, 2) - num;
		}
		
		double bigfac = x + Math.sqrt(y_sq);
		double littlefac = x - Math.sqrt(y_sq);
		
		if (isprime(bigfac)) {
			return bigfac;
		} else if (isprime(littlefac)) {
			return littlefac;
		} else {
			if (ferfac(bigfac) > ferfac(littlefac)) {
				return ferfac(bigfac);
			} else {
				return ferfac(littlefac);
			}
		}
	}
	
	public static boolean isprime(double num) {
		if (num < 2 || num % 2 == 0) {
			return false;
		}
		if (num == 2) {
			return true;
		}
		for (int i = 3; i < Math.sqrt(num); i = i+2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
