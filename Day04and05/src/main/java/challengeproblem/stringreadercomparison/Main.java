package challengeproblem.stringreadercomparison;

public class Main {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";
        String filePath = "largefile";

        // Compare StringBuilder and StringBuffer
        PerformanceComparison.compareStringConcatenation(iterations, text);

        // Compare FileReader and InputStreamReader
        PerformanceComparison.compareFileReading(filePath);
    }
}
