package Loops;

public class PyramidPattern {
    public static void main(String[] args) {
        int numOfLines = 5;

        for(int i = 1; i <= numOfLines; i++) {
            for(int j = numOfLines - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//    *
//   * *
//  * * *
// * * * *
//* * * * *
