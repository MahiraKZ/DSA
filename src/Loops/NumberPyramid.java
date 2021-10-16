package Loops;

public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 5;

        int count = 0;
        int num = 0;
        int j = 0;
        for(int i=1; i<=rows; ++i){
            for(int spaceCount=1; spaceCount<=rows-i; spaceCount++){
                System.out.print(" ");
                count++;
            }
            while(j!=2*i-1) {
                if(count<=rows-1) {
                    System.out.print(i + j);
                    count++;
                } else {
                    num++;
                    System.out.print(i+j-2*num);
                }
                j++;
            }
            num=count=j=0;
            System.out.println();
        }
    }
}
//    1
//   232
//  34543
// 4567654
//567898765