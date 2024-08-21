Star pattern

public class RightAngleStarPattern {
    public static void main(String[] args) {
        int rows = 5; // You can change this to print more or less rows

        // Print the right-angle star pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
