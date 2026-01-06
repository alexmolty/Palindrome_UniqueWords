package NonRepeatableWords;

public class Main {
    public static void main(String args[]) {
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
