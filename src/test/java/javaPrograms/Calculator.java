public static void main(String[] args) {
    calculator calculator = new calculator();
    int result = calculator.add(5, 3);
    System.out.println("The sum is: " + result);
}
public static class calculator {
        // write a method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }
}
