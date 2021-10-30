package Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int[] A = new int[]{-1,0,1,5,10,20,20,40,80};
        int[] B = new int[]{-1,0,6,7,20,20,80,120};
        int[] C = new int[]{-1,0,3,4,15,20,20,30,70,80,120};

        int i = 0, j = 0, k= 0;
        int temp = 0;                    //To keep track of matched values

        while(i < A.length && j < B.length && k < C.length) {
             if(A[i] == B[j] && B[j] == C[k] && temp!=A[i]) {
                System.out.println(A[i]);
                temp = A[i];            // Check if previous value is same or not
                i++;j++;k++;
            }
            else if(A[i] < B[j]) {
                i++;
            } else if(B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }

    }
}
//[3,5,10,20,40,80]
//[6,7,20,80,120]
//[1,4,15,..]
//Time Complexity - O(n1 + n2 + n3)
//Space Complexity - O(1)
