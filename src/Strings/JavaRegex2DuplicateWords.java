package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {

    private static final Pattern pattern = Pattern.compile(
        "((\\b\\w+\\b)\\s+)\\1*\\2\\b",
        Pattern.CASE_INSENSITIVE
    );

    private static String removeDuplicateWords(String line) {
        Matcher m = pattern.matcher(line);
        while (m.find()) {
            line = line.replaceAll(m.group(), m.group(2));
        }
        return line;
    }


    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            int numSentences = Integer.parseInt(in.nextLine());
            String line;
        
            for (int i = 0; i < numSentences; i++) {
                line = in.nextLine();
                System.out.println(removeDuplicateWords(line));
            }   
        }
    }
}
