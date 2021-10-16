package Loops;

public class RightPascalTriangle {
    public static void main(String[] args) {
        int numOfLines = 5;
        for(int i = 1; i <= numOfLines; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = numOfLines - 1; i >=1 ; i--) {
            for(int j = 1; j <= i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//*
//**
//***
//****
//*****
//****
//***
//**
//*