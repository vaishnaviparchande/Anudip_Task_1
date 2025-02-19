public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        // Declaring an array of size 5
        int arr[] = {1, 2, 3, 4, 5};

        try {
            // Trying to access an element at index 10 which doesn't exist
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling ArrayIndexOutOfBoundsException
            System.out.println("Array Index Out of Bounds Exception caught: " + e);
        }

        System.out.println("Program continues after exception handling...");
    }
}

//Output:

/*
Array Index Out of Bounds Exception caught: java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
Program continues after exception handling...
*/
