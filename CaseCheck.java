import java.util.*;

// Check if the character is upper case or lower case

public class CaseCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().trim().charAt(0);
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lowercase");
		} else {
			System.out.println("Uppercase"); 
		}
	}
}