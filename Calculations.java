
public class Calculations {

	public static void main(String[] args) {
		int x = 2;
		int y = 1;
		
		//sum of x and y 
		int sum = x+y;
		System.out.println("The sum is= "+ sum);
		
		//member_B add the feature of subtracting x from y and print the result
		int difference = y-x; #subtracting x from y - so y - x
		System.out.println("The difference is = " + difference);
		//member_C add the feature of dividing x by y and print the result
		int division = x/y;
		System.out.println("The result of division is = "+ division);
		
		//member_D add the feature of multiplying x by y and print the result
		int mul = x*y;
		System.out.println("The multiplication result is= "+ mul);
		
		
		//Exercise 5: Spot the issues to be reported
		System.out.println("The sum is = " + addition(4,5)); // should print the sum of the values provided
	
		welcome(); // should print the welcome message to the console
	}
	
	public static int addition(int w, int z) {
		int sum = w + z;
		return sum; 
	}
	
	public static void welcome() {
		System.out.println("Hello World");
	}

}
