package labs;

public class FibonnaciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0) = 0 + 1 = 1
		// fib(3) = fib(2) + fib(1) = 1 + 1 = 2
		// fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		// fib(5) = fib(4) + fib(3) = 3 + 2 = 5
		
		System.out.println(fib(5));
		
		
		// Homework
		// fac(0) = 1f = 1 * 1
		// fac(1) = 2f = 2 * 1
		// fac(2) = 3f = 3 * 2 * 1
		// fac(3) = 4f = 4 * 3 * 2 * 1
		// fac(4) = 5f = 5 * 4 * 3 * 2 * 1
		
		// System.out.println(fac(0));	
		}

	// Recursion 
	public static int fib(int n) {
		if (n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		return ( ((fib(n-1) + fib(n-2))) );
		}
	
	}

