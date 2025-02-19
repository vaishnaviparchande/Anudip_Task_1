//Program demonstrating Exception handling using try-catch for ArithmeticException.

//Logic:
public class ArithmeticExceptionExample {

    // A method to perform division, with the possibility of ArithmeticException
    public static void divide(int a, int b) throws ArithmeticException {
        int ans;
        ans = a / b;  // This line will throw ArithmeticException if b is 0
        System.out.println(ans);
    }

    public static void main(String[] args) {
        try {
            divide(20, 0); // Calling divide() with b=0 causes ArithmeticException
        } catch (ArithmeticException ae) {
            System.out.println("Number divided by zero");  // Handling ArithmeticException
        }
    }
}

//Output:

/*
Number divided by zero
*/
