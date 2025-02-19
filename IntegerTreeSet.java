// 3. Program using TreeSet to insert and print Integer values
import java.util.TreeSet;

public class IntegerTreeSet {
    public static void main(String[] args) {
        // Creating a TreeSet to store Integer values
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding Integer values to the TreeSet
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);

        // Printing Integer values (TreeSet stores in ascending order)
        System.out.println("TreeSet values: " + numbers);
    }
}

//Output:

// TreeSet values: [10, 20, 30, 40]
