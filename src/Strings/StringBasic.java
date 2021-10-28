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

    }
}
