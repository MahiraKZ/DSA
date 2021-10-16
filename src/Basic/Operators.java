package Basic;

public class Operators {
    public static void main(String[] args) {
        //Conditional Statements
        int num = 10;
        if(num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        //Unary Operators
        //i) Ternary Operators
        boolean isEven = (num % 2 == 0) ? true : false;

        //ii)Postfix and Prefix Operators
        int a =  10;
        int b = 12;
        System.out.println(a++ + ++a); //(10 + 12) = 22

        System.out.println(b++ + b++); //(10 + 11 ) = 21

        //iii) Not Operator
        int num1 = 10;
        int num2 = 1;
        System.out.println(!(num1<num2));

        //Shift Operators
        num1 =  10;
        num2 = 2;

        System.out.println(10 << 3); //(10*( 2 ^ 3)) =  80
        System.out.println(10 >> 2); //(10/( 2 ^ 2)) = 10/4 = 2

        //Bitwise Operators
        num1 = 5; //0101
        num2 = 7; //0111
        System.out.println(num1 & num2); //0101 = 5
        System.out.println(num1 | num2); //0111 = 7
        System.out.println(num1 ^ num2); //0010 = 2

    }
}
