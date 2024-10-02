Star pattern
public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; // You can change this to print more or less rows

        // Print the upper half of the star pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print the lower half of the star pattern
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
.
