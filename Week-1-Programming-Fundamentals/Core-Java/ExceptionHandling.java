public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Program Finished");
        }
    }
}