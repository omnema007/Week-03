package linearsearch.searchforaspecificword;


public class SpecificWordMain {
    public static void main(String[] args) {
        String[] words = {"Hello World", "Hello Java", "How are you"};
        String target = "are";
        String res = SpecificWord.findSpecificWord(words,target);
        System.out.println(res);
    }
}
