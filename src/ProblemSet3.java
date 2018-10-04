/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */

public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
	
	public static void main(String[] args) {
		ProblemSet3 ps3 = new ProblemSet3();
		ps3.dateFashion(5, 10); //YES
		ps3.dateFashion(5, 5); //MAYBE
		ps3.dateFashion(2, 8); //NO
		ps3.fizzString("fig"); //FIZZ
		ps3.fizzString("dib"); //BUZZ
		ps3.fizzString("fib"); //FIZZBUZZ
		ps3.fizzString("abc"); //abc
		ps3.squirrelPlay(70, false); //YES
		ps3.squirrelPlay(95, false); //NO
		ps3.squirrelPlay(95, true); //YES
		ps3.fizzStringAgain(2); //2!
		ps3.fizzStringAgain(9); //FIZZ!
		ps3.fizzStringAgain(10); //BUZZ!
		ps3.fizzStringAgain(15); //FIZZBUZZ!
		ps3.makeBricks(3, 1, 8); // YES.
		ps3.makeBricks(3, 1, 9); // NO.
		ps3.makeBricks(3, 2, 10); // YES.
		ps3.loneSum(1, 2, 3); // 6.
		ps3.loneSum(3, 2, 2); // 2.
		ps3.loneSum(3, 3, 3); // 0.
		ps3.luckySum(1, 2, 3);// 6.
		ps3.luckySum(1, 2, 13); // 3.
		ps3.luckySum(1, 13, 3); // 1.
		ps3.factorialWithFor(3); // 6.
		ps3.factorialWithFor(4); // 24.
		ps3.factorialWithFor(5); //120.
		ps3.factorialWithWhile(3); // 6.
		ps3.factorialWithWhile(4); // 24.
		ps3.factorialWithWhile(5); //120.
		ps3.isPrime(1); //NOT PRIME.
		ps3.isPrime(2); //PRIME.
		ps3.isPrime(17); //PRIME.
		ps3.isPrime(144); //NOT PRIME.
	}
		
	public void dateFashion(int you, int date) {
		if(you <= 2 || date <= 2) {
			System.out.println("NO");
		}
		else if(you >= 8 || date>= 8) {
			System.out.println("YES");
		}
		else {
			System.out.println("MAYBE");
		}
	}
	
	public void fizzString(String str) {
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length()-1);
		if(firstChar == 'f' && lastChar != 'b') {
			System.out.println("FIZZ");
		}
		else if(firstChar != 'f' && lastChar == 'b') {
			System.out.println("BUZZ");
		}
		else if(firstChar == 'f' && lastChar == 'b') {
			System.out.println("FIZZBUZZ");
		}
		else {
			System.out.println(str);
		}
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		if(isSummer == false) {
			if(temp >= 60 && temp <=90) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		if(isSummer == true) {
			if(temp >= 60 && temp <=100) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
	
	public void fizzStringAgain(int n) {
		String print = Integer.toString(n);
		if(n%3 == 0 && n%5 == 0) {
			System.out.println("FIZZBUZZ!");
		}
		else if(n%3 != 0 && n%5 == 0) {
			System.out.println("BUZZ!");
		}
		else if(n%3 == 0 && n%5 != 0) {
			System.out.println("FIZZ!");
		}
		else {
			System.out.println(print+"!");
		}
	}
	
	public void makeBricks(int small, int big, int goal) {
		if(goal/5 <= big) {
			int remSmall = goal % (big*5);
			if(remSmall <= small) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		else {
			System.out.println("NO");
		}
	}
	
	public void loneSum(int a, int b, int c) {
		if(a == b && c == b && a == c) {
			System.out.println("0");
		}
		else if(a == b && a != c) {
			System.out.println(c);
		}
		else if(a == c && a != b) {
			System.out.println(b);
		}
		else if(b == c && a != b) {
			System.out.println(a);
		}
		else {
			System.out.println(a+b+c);
		}
	}
	
	public void luckySum(int a, int b, int c) {
		if(a ==13) {
			System.out.println("0");
		}
		else if(b ==13) {
			System.out.println(a);
		}
		else if(c ==13) {
			System.out.println(a+b);
		}
		else {
			System.out.println(a+b+c);
		}
	}
	
	public void factorialWithFor(int n) {
		int sum = 1;
		for(int i = n; i>0; i--) {
			sum *= i;
		}
		System.out.println(sum);
	}
	
	public void factorialWithWhile(int n) {
		int sum = 1;
		while(n>0) {
			sum *= n;
			n--;
		}
		System.out.println(sum);
	}
	
	public void isPrime(int n) {
		int prime = 0;
		int div = 2;
		while (div<n && prime == 0){
			if(n/div != 1 && n%div == 0) {
				prime = 1;
			}
			div++;
		}
		if(n == 0 || n == 1) {
			System.out.println("NOT PRIME");
		}
		else if(prime == 1) {
			System.out.println("NOT PRIME");
		}
		else {
			System.out.println("PRIME");
		}
	}
}