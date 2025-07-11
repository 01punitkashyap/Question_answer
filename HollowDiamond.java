public class HollowDiamond {
    public static void main(String[] args) {
        int n = 5;

        
        for (int i = 1; i <= 2 * n - 1; i++) {
            int spaces = Math.abs(n - i);                 
            int insideSpaces = 2 * (n - spaces) - 3;      
            
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            
            System.out.print("*");

            
            if (insideSpaces > 0) {
                for (int j = 1; j <= insideSpaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
