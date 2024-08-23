Star pattern 

public class RightInvertedAngleStarPattern {
    public static void main(String[] args) {
        int rows = 5; // You can change this to print more or less rows

        // Print the right-inverted angle star pattern
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
