import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        // Creating a HashSet of Strings
        HashSet<String> uniqueWords = new HashSet<>(); // Cannot pass primitive data types. 
        // You can use user defined classes 

        // Adding elements to the HashSet
        uniqueWords.add("Java");
        uniqueWords.add("Python");
        uniqueWords.add("C++");
        uniqueWords.add("Java"); // Duplicate element, won't be added

        // Displaying the HashSet
        System.out.println("HashSet after adding elements: " + uniqueWords);

        // Removing an element from the HashSet
        boolean removed = uniqueWords.remove("Python");
        if (removed) {
            System.out.println("Element 'Python' removed.");
        } else {
            System.out.println("Element 'Python' not found.");
        }

        // Displaying the HashSet after removal
        System.out.println("HashSet after removing 'Python': " + uniqueWords);

        // Checking existence of an element
        boolean containsJava = uniqueWords.contains("Java");
        System.out.println("Does the HashSet contain 'Java'? " + containsJava);

        // Iterating over the HashSet using Iterator
        System.out.println("Elements in the HashSet:");
        Iterator<String> iterator = uniqueWords.iterator(); // Gives you a pointer to the first element
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
