package NonRepeatableWords;

import java.util.Arrays;

public class NonRepeatableWordsApp {
    public static int calculateUniqueWords(String str) {
        if (str == null || str.isEmpty()) return 0;
        int res = 0;
        str = str.toLowerCase().trim().replaceAll("[^a-zA-Zа-яА-Я]", " ");
        String[] words = str.split(" +");
        for (String word : words) {
            if (Arrays.stream(words).filter(w -> w.equals(word)).count() == 1)
                res++;
        }
        return res;
    }

}
