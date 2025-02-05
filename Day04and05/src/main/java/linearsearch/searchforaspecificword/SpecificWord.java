package linearsearch.searchforaspecificword;

public class SpecificWord {
    public static String findSpecificWord(String[] words, String target) {
        for (int i = 0; i < words.length; i++) {
            String sentence  = words[i];
            String[] res = sentence.split(" ");
            for (int j = 0; j < res.length; j++) {
                if (res[j].equalsIgnoreCase(target)) {
                    return words[i];
                }
            }

        }

        return "Not found";
    }
}
