package NonRepeatableWords;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    static void main() {
        String[]examples = {
                "hello world",
                "Hello hello world World",
                "Привет, мир! Привет мир. Java? Python: java;"};
        for(String example : examples) {
            int res = NonRepeatableWordsApp.calculateUniqueWords(example);
            System.out.println("String \"" + example + "\" contains " + res + " unique words");
        }
    }
}
