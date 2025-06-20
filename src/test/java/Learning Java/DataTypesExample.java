package Learning

public class DataTypesExample {
    public static void main(String[] args) {
        // Primitive data types
        int intVar = 10;
        char charVar = 'A';
        boolean booleanVar = true;

        // Non-primitive data types
        String stringVar = "Hello, World!";
        int[] intArray = {1, 2, 3, 4, 5};

        // Print primitive data types
        System.out.println("intVar: " + intVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);

        // Print non-primitive data types
        System.out.println("stringVar: " + stringVar);

        System.out.print("intArray: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}