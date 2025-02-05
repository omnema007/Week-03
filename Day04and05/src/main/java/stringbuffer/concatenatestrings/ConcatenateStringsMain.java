package stringbuffer.concatenatestrings;

public class ConcatenateStringsMain {
    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World", " Welcome", " to", " Java"};
        String result = ConcatenateStrings.concatenateStrings(words);
        System.out.println("Concatenated String: " + result);
    }
}
