package Basic;

public class MissingNumber {
    public static void main(String[] args) {
        //XOR operation: Find the missing number
        int[] numbers = {3,0,1};

        int xor = 0;
        for(int i = 0; i < numbers.length; i++) { //i =0,1,2
            xor = xor ^ i ^ numbers[i];
        }
        System.out.print(xor ^ numbers.length);
    }
}
//Problem 1:
//0 ^ 1 ^ 2 ^ 3 ^ 3 ^ 0 ^ 1