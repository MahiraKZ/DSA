package Strings;

public class IsAnagram {
    public static void main(String[] args) {
        String str1 = "aabbb", str2 = "ababb";

        //Using String
        boolean isAnagram = isAnagram(str1, str2);
        if(isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }

        //Using StringBuilder
        boolean isAnagramUsingStringBuilder = isAnagramUsingStringBuffer(str1, str2);
        if(isAnagramUsingStringBuilder) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }

    private static boolean isAnagramUsingStringBuffer(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }

        char[] charArr = str1.toCharArray();
        StringBuilder str2Builder = new StringBuilder(str2);

        for(char c : charArr) {
            int index = str2Builder.indexOf(c + "");
            if(index != -1) {
                str2Builder.deleteCharAt(index);
            } else {
                return false;
            }
        }

        return str2Builder.length() == 0 ? true : false;
    }

    private static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }

        char[] charArr = str1.toCharArray();

        for(char c : charArr) {
            int index = str2.indexOf(c);
            if(index != -1) {
                str2 = str2.substring(0, index) + str2.substring(index+1);
            } else {
                return false;
            }
        }

        return str2.isEmpty();
    }
}
