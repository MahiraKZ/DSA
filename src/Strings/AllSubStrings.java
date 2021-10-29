package Strings;

public class AllSubStrings {
    public static void main(String[] args) {
        String str = "xyz";
        printAllSubStrings(str);
    }

    private static void printAllSubStrings(String str) {
        for(int start = 0; start < str.length(); start++) {
            for(int end = start+1; end <= str.length(); end++) {
                System.out.println(str.substring(start, end));
            }
        }
    }
}

//i/p : "xyz"
//o/p : "x,xy,xyz,y,yz,z"