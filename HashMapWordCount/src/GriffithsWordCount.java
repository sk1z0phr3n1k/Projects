import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GriffithsWordCount {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("gettys.txt");
		Scanner inputFile = new Scanner(file);
		Map<String, Integer> numWords = new TreeMap<>();
		
		while(inputFile.hasNext()) {
			String body = inputFile.next();
			body = body.replaceAll("\\p{Punct}", "").toLowerCase();
			if(!numWords.containsKey(body)) {
				numWords.put(body, 1);
			}
			else {
				int i = numWords.get(body);
				numWords.put(body, i + 1);
			}
		
			
		}
		System.out.println(numWords);
	}

}
