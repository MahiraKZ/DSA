package Strings;

import java.util.Locale;

public class StringBasic {
    public static void main(String[] args) {

        //Create a String
        //Type 1:
        String name = "xyz";
        String address = new String("5/6 New Street");


        //To change to a char array
        char[] charArr = name.toCharArray();

        //to find length
        int length = name.length();

        //To find index of a character
        int index = name.indexOf('x'); //return -1 if not found

        //To find lastIndex of a character
        int lastIndex = name.lastIndexOf('z'); //return -1 if not found

        //To change to Uppercase
        String nameUpperCase = name.toUpperCase();

        //To change to LowerCase
        String nameLowerCase = name.toLowerCase();

        //To check if two strings are equal
        System.out.println(name.equals(address)); //returns true/false

        //To check if two strings are equal ignoring case
        System.out.println(name.equalsIgnoreCase(address)); //returns true/false

        //To check if a string contains a sequence of string
        System.out.println(address.contains("New")); //returns true/false

        //Difference in equals() and ==
        String str1 = "xyz";
        String str2 = "xyz";

        String str3 = new String("xyz");
        String str4 = new String("xyz");

        //to compare memory address
        System.out.println(str1 == str2); //true
        System.out.println(str3 == str4); //false
        System.out.println(str1 == str3); //false

        //to compare actual string value
        System.out.println(str1.equals(str3)); //true

        //To get the char at particular index
        char ch = name.charAt(0); //x

        //To get Substring of a string
        String courseName = "Data Structures";
        System.out.println(courseName.substring(0,4));//"Data"
        System.out.println(courseName.substring(5));//"Structures"

        //To split
        String splitCourseName = "Data Structures And Algorithms";
        String[] splitArr = splitCourseName.split(" ");

        //To trim a string
        String trimString = "    xyz   ";
        trimString.trim();

    }

}
