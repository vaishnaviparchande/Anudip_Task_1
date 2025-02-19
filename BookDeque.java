// 2. Program using ArrayDeque to add and remove book names
import java.util.ArrayDeque;

public class BookDeque {
    public static void main(String[] args) {
        // Creating an ArrayDeque to store book names
        ArrayDeque<String> books = new ArrayDeque<>();

        // Adding book names from both ends
        books.addFirst("Java Programming"); // Adding at the front
        books.addLast("Data Structures");   // Adding at the end
        books.addFirst("Operating Systems"); // Adding at the front

        // Printing the book list
        System.out.println("Books in Deque: " + books);

        // Removing book names from both ends
        books.removeFirst(); // Removing from the front
        books.removeLast();  // Removing from the end

        // Printing the updated book list
        System.out.println("Updated Books in Deque: " + books);
    }
}

//Output:

/*

 Books in Deque: [Operating Systems, Java Programming, Data Structures]
 Updated Books in Deque: [Java Programming]

*/


