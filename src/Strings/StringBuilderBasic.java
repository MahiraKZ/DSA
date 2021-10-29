package Strings;

public class StringBuilderBasic {
    public static void main(String[] args){
        //Difference in String, StringBuilder and StringBuffer
        String str = "xyz";
        concatString(str);
        System.out.println(str);

        StringBuilder strBuilder = new StringBuilder("xyz");
        concatStringBuilder(strBuilder);
        System.out.println(strBuilder);

        StringBuffer strBuffer = new StringBuffer("xyz");
        concatStringBuffer(strBuffer);
        System.out.println(strBuffer);

        //Common methods of StringBuilder
        //To append
        strBuilder.append("xyz");

        //To Insert at particular index
        strBuilder.insert(3, "xyz");

        //To reverse
        StringBuilder reversedString = strBuilder.reverse();

        //to delete characters
        strBuilder.delete(1,3);

        //to delete character at particular character
        strBuilder.deleteCharAt(2);

        System.out.println(strBuilder);
        //to String
        String convertedString = strBuilder.toString();
    }

    public static void concatString(String str) {
        str = str + "abc";
        System.out.println(str);
    }

    public static void concatStringBuilder(StringBuilder strBuilder) {
        strBuilder = strBuilder.append("abc");
        System.out.println(strBuilder);
    }

    public static void concatStringBuffer(StringBuffer strBuffer) {
        strBuffer = strBuffer.append("abc");
        System.out.println(strBuffer);
    }
}
