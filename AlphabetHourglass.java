public class AlphabetHourglass {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the upper half

        // Upper half
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) System.out.print(" ");

            // Print left half alphabets
            for (char ch = 'A'; ch < 'A' + n - i; ch++) System.out.print(ch);

            // Print right half alphabets
            for (char ch = (char) ('A' + n - i - 2); ch >= 'A'; ch--) System.out.print(ch);

            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) System.out.print(" ");

            // Print left half alphabets
            for (char ch = 'A'; ch < 'A' + n - i; ch++) System.out.print(ch);

            // Print right half alphabets
            for (char ch = (char) ('A' + n - i - 2); ch >= 'A'; ch--) System.out.print(ch);

            System.out.println();
        }
    }
}
