import java.util.Scanner;

public class NestedSwitch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter studentId: ");
		int studentId = sc.nextInt();
		
		switch (studentId) {
			case 1:
				System.out.println("Preethi");
				break;
			case 2:
				System.out.println("Priya");
				break;
			case 3:
				System.out.println("Seema");
				break;
			case 4:
				System.out.println("Indu");
				break;
			case 5:
				System.out.print("Enter departement: ");
				String department = sc.next();
				
				switch (department) {
					case "CSE":
						System.out.println("Computer Science department");
						break;
					case "ECE":
						System.out.println("Electronics department");
						break;
					case "CE":
						System.out.println("Civil department");
						break;
					case "ME":
						System.out.println("Mechanical department");
						break;
					default:
						System.out.println("No department entered");
				}
				break;
			default:
				System.out.println("Enter correct studentId");
		}
		sc.close();
	}
}