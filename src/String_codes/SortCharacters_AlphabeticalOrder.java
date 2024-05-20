package String_codes;

import java.util.Arrays;

public class SortCharacters_AlphabeticalOrder {
    public static void main(String[] args) {
        String str = "dkcab";

        // without sort method
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                while (ch[i] > ch[j]) {
                    char temp = str.charAt(i);
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.println(new String(ch));

        // with sort method
        char[] ch1 = str.toCharArray();
        Arrays.sort(ch1);
        System.out.println(new String(ch1));
    }
}
