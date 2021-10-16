package Loops;

public class NumberPattern {
    public static void main(String[] args) {
        int num = 4;

        int start = 1;
        for(int i = 1; i<=num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(start++ + " ");
            }
            System.out.println();
        }
    }
}
//1
//2 3
//4 5 6
//7 8 9 10