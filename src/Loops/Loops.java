package Loops;

public class Loops {
    public static void main(String[] args) {

        //print number from 1 to 10
        //for loop
        for(int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        //while loop
        int i = 1;
        while(i <= 10) {
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        //do-while loop
        i = 1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i <= 10);

        //for-each loop
        int[] numbers = new int[]{1,2,3,4,5,6};
        for(int j : numbers) {
            System.out.print(j + " ");
        }
    }
}
