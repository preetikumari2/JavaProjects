import java.util.Scanner;

public class StarPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int topRows = (n + 1) / 2;

        // ---------------- TOP PYRAMID ----------------
        for (int i = 1; i <= topRows; i++) {

            for (int j = 1; j <= topRows - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }

        // ---------------- BODY ----------------
        int gap = n - 2;

        for (int i = 1; i <= gap; i++) {

            for (int j = 1; j <= topRows - 1; j++)
                System.out.print(" ");

            System.out.print("@");

            for (int j = 1; j <= gap; j++)
                System.out.print(" ");

            System.out.print("@");

            System.out.println();
        }

        // -------- FIRST BOTTOM ROW --------
        for (int j = 1; j <= n; j++)
            System.out.print("*");

        System.out.print("@");

        for (int j = 1; j <= gap; j++)
            System.out.print(" ");

        System.out.print("@");

        for (int j = 1; j <= n; j++)
            System.out.print("*");

        System.out.println();

        // -------- REMAINING ROWS --------
        int stars = n - 2;

        while (stars > 0) {

            int leading = (n - stars) / 2;

            for (int j = 1; j <= leading; j++)
                System.out.print(" ");

            for (int j = 1; j <= stars; j++)
                System.out.print("*");

            // Middle gap
            for (int j = 1; j <= (gap + 2 + (2 * leading)); j++)
                System.out.print(" ");

            for (int j = 1; j <= stars; j++)
                System.out.print("*");

            System.out.println();

            stars -= 2;
        }
    }
}