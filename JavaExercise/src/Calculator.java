public class Calculator {

    int a;

    public int add(int num1, int num2) {
        return num1 + num2; // Performing actual addition
    }

    public static void main(String[] args) { // Moved main method inside Calculator class
        int num1 = 34;
        int num2 = 35;
        
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2); // Pass arguments to the method

        System.out.println("Sum: " + result);
    }
}
