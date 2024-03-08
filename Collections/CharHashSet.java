import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CharHashSet {
	public static void main(String[] args) {
		// Creating a HashSet of Characters
        HashSet<Character> uniqueCharacters = new HashSet<>(); 
        // You can use user defined classes 
        
        // Stores " " as well
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = scanner.nextLine();
        
        for(int i = 0; i<string.length(); i++) {
        	uniqueCharacters.add(string.charAt(i));
        }
        
        System.out.println("Unique elements");
        Iterator<Character> iterator = uniqueCharacters.iterator(); 
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(" ");
        }
        scanner.close();
    }

}
	        

