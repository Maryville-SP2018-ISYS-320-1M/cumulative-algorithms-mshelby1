/*
	ISYS 320
	Name(s): Matthew Shelby
	Date: 4/8/2018
*/

/*
3. What problems did you identify in the sumTo method below?
There is no return at the end

*/

public class P3_FixTheSumTo {

	public static void main(String[] args) {
		int totalSum = sumTo( 5 );
		System.out.println("The total sum is: " + totalSum );

	}
	
	public static int sumTo(int n) { 
		for (int i = 1; i <= 5; i++) {
	        int sum = 0; 
	        sum += i;
	    }
		return n;
	
	}

}
