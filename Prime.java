import java.util.*;

public class Prime
{
	public static void main(String[] args){
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i*i <= num; i++){
			if (num % i == 0){
				isPrime = false;
				break;
			}
		}
		if(isPrime){
			System.out.println(num + " is a prime number");
		} else {
			System.out.print(num + " is not a prime number");
		}
	}
}