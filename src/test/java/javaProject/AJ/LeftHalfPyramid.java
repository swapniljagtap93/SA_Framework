package AJ;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Inner loop prints 'N - i' spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();


        }
    }
}

//*
//* *
//* * *
//* * * *
//* * * * *



