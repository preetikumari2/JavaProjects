import java.util.*;

/* Take input of a salary. If salary is greater than 10000 add onus of 2000, otherwise add 
bonus of 1000.*/

public class ConditionProg{
	public static void main(String[] args){
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		// if statement condition
		
	/*	if (salary > 10000){
			salary += 2000;
		} else {
			salary += 1000;
		}
	*/	
		
		// multiple if-else statement
		if (salary > 20000) {
			salary += 3000;
		}else if ( salary > 10000){
			salary += 2000;
		} else {
			salary += 1000;
		}
		System.out.println(salary);	
	}
}