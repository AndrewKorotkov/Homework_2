package HomeworkTwo;

public class LongestWord {
    static String max(String par) {
        String[] words = par.split(" ");
        String resstring = "";
        for (String word : words) {
            if (word.length() > resstring.length())
                resstring = word;
        }
        return (resstring);
    }

    static public void main(String args[]) {
        String somestring = "one two three four five";
        String longeststring = max(somestring);
        System.out.println(longeststring);
        System.out.println(longeststring.length());
    }
}
