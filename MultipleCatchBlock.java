//Program demonstrating multiple catch statements and finally block.

//Logic:
public class MultipleCatchBlock {

    public static void main(String[] args) {
        try {
            int arr[] = new int[10];
            arr[20] = 111;  // This line throws ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");  // This will execute
        } catch (Exception e) {
            System.out.println("Global Exception");
        } finally {
            System.out.println("Finally block");  // Always executed
        }
    }
}

//Output:

/*
ArrayIndexOutOfBoundsException
Finally block
*/