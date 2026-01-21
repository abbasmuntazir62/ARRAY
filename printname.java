import java.util.Scanner;

public class Printname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume the leftover newline
        // Prevents skipping user input when using nextLine after nextInt
        // :contentReference[oaicite:0]{index=0}

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Print the summary just once
        System.out.println("\nNumber of names entered: " + size);

        // Print each name on its own line
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}
