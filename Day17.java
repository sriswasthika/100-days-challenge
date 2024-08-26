Alphabet pattern

public class AlphabetPattern {
    public static void main(String[] args) {
        int rows = 5; // You can change this to print more or less rows

        // Print the alphabet pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                char ch = (char) ('A' + j);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
