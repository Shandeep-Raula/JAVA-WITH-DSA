public class New {
    public static void main(String[] args) {
        int n = 3; // You can change the value of n to adjust the size of the pattern

        // Print the top half of the pattern
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print the left half of the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print the right half of the numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println(); // Move to the next line
        }

        // Print the bottom half of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print the left half of the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print the right half of the numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println(); // Move to the next line
        }
    }
}