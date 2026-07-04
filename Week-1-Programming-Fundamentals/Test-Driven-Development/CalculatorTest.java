public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10,20));
        System.out.println(calculator.subtract(20,5));
        System.out.println(calculator.multiply(5,6));
        System.out.println(calculator.divide(20,4));

        System.out.println("All sample tests executed successfully.");
    }
}