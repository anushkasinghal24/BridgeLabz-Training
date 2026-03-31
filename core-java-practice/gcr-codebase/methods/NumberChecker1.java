//package methods;

public class NumberChecker1 {
	public static int countDigits(int n) {
		return String.valueOf(n).length();
	}
	
	//Store digits in an array
	public static int[] gettingDigits(int n) {
		int len = countDigits(n);
		int[] d = new int[len];
		for(int i = len - 1 ; i>= 0; i--) {
			d[i] = n%10;
			n/= 10;
			
		}
		return d;
	}
	//Duck number check (has non - zero digit)
	public static boolean isDuck(int[] d) {
		for(int x : d ) if(x != 0) return true;
		return false;
	}
	
	//To check that the number is Armstrong 
	public static boolean isArmstrong(int n , int[] d) {
		int sum = 0, p = d.length;
		for(int x: d) sum += Math.pow(x , p);
		return sum == n;
		
	}
	//Largest and Second Largest 
	public static void largestTwo(int[] d) {
		int max = Integer.MIN_VALUE, smax = Integer.MAX_VALUE;
		for(int x : d) {
			if(x > max ) {
				smax = max; max = x;
				
			}else if(x > smax && x != max) smax = x;
			
		}System.out.println("Largest: " + max + ", Second Largest: " + smax);
		
	}
	//Smallest and second Smallest
	public static void smallestTwo(int[] d) {
		int min = Integer.MAX_VALUE , smin = Integer.MAX_VALUE;
		for(int x : d) {
			if(x < min) {smin = min; min = x;}
			else if(x < smin && x!= min) smin = x;
			
		
	}
		System.out.println("Smallest: " + min + ", Second Smallest: " + smin);
	}
	public static void main(String[] args) {
		int n = 153;
		int[] digits = gettingDigits(n);
		
		System.out.println("Digits count: " + countDigits(n));
		System.out.println("Duck Number: " + isDuck(digits));
		System.out.println("Armstrong Number: "  + isArmstrong(n, digits));
		largestTwo(digits);
		smallestTwo(digits);

	}

}
