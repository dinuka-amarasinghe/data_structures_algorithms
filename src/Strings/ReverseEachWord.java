package Strings;

public class ReverseEachWord {

    private static String reverse(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }
    private static String reverseEachWord(String sentence) {
        if(sentence==null || sentence.isEmpty()){
            return "";
        }

        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");

        for (String word : words) {
            result.append(reverse(word));
            result.append(" ");
        }
        result.trimToSize();
        return result.toString();
    }

    public static void main(String[] args) {
        String sentence = "Sally Is A Great Worker";
        System.out.println(reverseEachWord(sentence));
    }
}