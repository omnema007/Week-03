package filereader.counttheoccurenceofword;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountTheOccurrenceOfWord {
    public static int countWordOccurrences(String filePath, String targetWord) {
        int count = 0;

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // Convert line to lowercase and split into words
                String[] words = line.toLowerCase().split("\\s+");

                for (String word : words) {
                    // Compare words ignoring case
                    if (word.equals(targetWord.toLowerCase())) {
                        count++;
                    }
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return count;
    }
}
