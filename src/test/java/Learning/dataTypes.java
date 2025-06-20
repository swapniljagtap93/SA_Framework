package Learning;

public class dataTypes {
    public static void main(String[] args) {
        // Integer types
        byte byteVar = 127; // 8-bit signed integer
        short shortVar = 32767; // 16-bit signed integer
        int intVar = 2147483647; // 32-bit signed integer
        long longVar = 9223372036854775807L; // 64-bit signed integer

        // Floating-point types
        float floatVar = 3.14F; // 32-bit floating-point number
        double doubleVar = 3.141592653589793; // 64-bit floating-point number

        // Character type
        char charVar = 'A'; // 16-bit Unicode character

        // Boolean type
        boolean booleanVar = true; // true or false

        // String type (not a primitive type, but commonly used)
        String stringVar = "Hello, World!"; // String of characters

        // Print all variables
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);
        System.out.println("stringVar: " + stringVar);
    }
}