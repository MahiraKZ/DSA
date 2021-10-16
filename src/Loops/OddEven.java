package Loops;

public class OddEven {
    public static void main(String[] args) {

        //Approach 1
        int num = 54873;
        int rev = reverse(num); //37845
        int sumOdd = 0;
        int sumEven = 0;

        boolean isOdd = true;

        while(rev != 0) {
            int digit = rev % 10;
            if(isOdd) {
                sumOdd += digit;
            } else {
                sumEven += digit;
            }
            isOdd = !isOdd;
            rev /= 10;
        }

        System.out.println("Odd Sum:" + sumOdd);
        System.out.println("Even Sum:"+ sumEven);

        //Approach 2:
//        int num = 54873;
//
//        String numStr = String.valueOf(num);
//        int sumOdd = 0;
//        int sumEven = 0;
//        for(int i = 0; i < numStr.length(); i++) {
//            if(i % 2 == 0) {
//                sumOdd += numStr.charAt(i) - '0';
//            } else {
//                sumEven += numStr.charAt(i) - '0';
//            }
//        }
//        System.out.println("Odd Sum:" + sumOdd);
//        System.out.println("Even Sum:"+ sumEven);
    }

    static int reverse(int num) {
        int reverse = 0;

        while(num != 0) {
            int digit = num % 10;
            reverse =( reverse * 10 ) + digit;
            num /= 10;
        }
        return reverse;
    }

}
//Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.