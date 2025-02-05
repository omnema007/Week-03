package challengeproblem.stringreadercomparison;
import java.io.*;
public class PerformanceComparison {
    public static void compareStringConcatenation(int iterations, String text) {
        // Measure time for StringBuffer
        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = (endTimeBuffer - startTimeBuffer) / 1_000_000;

        // Measure time for StringBuilder
        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = (endTimeBuilder - startTimeBuilder) / 1_000_000;

        System.out.println("\nString Concatenation Performance:");
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ms");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ms");
    }

    public static void compareFileReading(String filePath) {
        // FileReader test
        long startFileReader = System.nanoTime();
        int wordCountFileReader = countWordsUsingFileReader(filePath);
        long endFileReader = System.nanoTime();
        long durationFileReader = (endFileReader - startFileReader) / 1_000_000;

        // InputStreamReader test
        long startInputStreamReader = System.nanoTime();
        int wordCountInputStreamReader = countWordsUsingInputStreamReader(filePath);
        long endInputStreamReader = System.nanoTime();
        long durationInputStreamReader = (endInputStreamReader - startInputStreamReader) / 1_000_000;

        System.out.println("\nFile Reading Performance:");
        System.out.println("FileReader Word Count: " + wordCountFileReader + ", Time: " + durationFileReader + " ms");
        System.out.println("InputStreamReader Word Count: " + wordCountInputStreamReader + ", Time: " + durationInputStreamReader + " ms");
    }

    public static int countWordsUsingFileReader(String filePath) {
        int wordCount = 0;
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file with FileReader: " + e.getMessage());
        }
        return wordCount;
    }

    public static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
        return wordCount;
    }
}
