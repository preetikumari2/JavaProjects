// count how many time the number is occured (ex: 624562852762, ans = 4) or count the number of n
import java.util.*;

public class CountNums{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		long number = sc.nextLong();
		
		System.out.print("Enter the digit to count: ");
		int digit = sc.nextInt();
		
		int count = 0;
		while(number > 0){
			int rem = (int) (number % 10);
			if(rem == digit){
				count ++; 
			}
			number = number / 10;
		}
		System.out.println("digit: " + digit + " occurred " + count + " times.");
	}
}