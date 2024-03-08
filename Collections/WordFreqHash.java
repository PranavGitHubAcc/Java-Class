import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFreqHash {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String paraString = scanner.nextLine();
		
		Map<String, Integer> wordCount = new HashMap<>();
		
		String arr[] = paraString.split(" ");
		for(int i = 0; i<arr.length; i++) {
			if(wordCount.containsKey(arr[i])) {
				int count = wordCount.get(arr[i]);
				wordCount.put(arr[i], count+1);
			}else {
				wordCount.put(arr[i], 1);
			}
		}
		System.out.println(wordCount);
		scanner.close();
	}
	
	
}
