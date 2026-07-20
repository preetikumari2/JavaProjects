import java.util.Scanner;

public class Switch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a fruit: ");
		String fruit = sc.next();
		switch(fruit){
			case "Mango":
				System.out.println("King of fruits");
				break;
			case "Grapes": 
				System.out.println("Green juicy fruit");
				break;
			case "Apple":
				System.out.println(" a day, Keeps the doctor away");
				break;
			case "Orange":
				System.out.println("full of vitamin C");
				break;
			case "banana":
				System.out.println("good for gut health");
				break;
			default:
				System.out.println("Please enter a valid fruit");
		}
	}
}