package filereader.counttheoccurenceofword;

public class CountTheOccurrenceOfWordMain {
    public static void main(String[] args) {
        String filePath = "example";
        String targetWord = "hello";

        int wordCount = CountTheOccurrenceOfWord.countWordOccurrences(filePath, targetWord);
        System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file.");
    }
}
