package String_codes;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_Characters {
    public static void main(String[] args) {
        String str = "abcd aecnb";


        // approach-1
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                continue;
            }
            int j = i + 1;
            while (j < sb.length()) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    sb.deleteCharAt(j);
                } else {
                    j++;
                }
            }
        }
        System.out.println("approach-1 : " + sb);



        // approach-2
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c -> sb1.append((char) c));
        System.out.println("approach-2 : " + sb1);



        // apporach-3
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int check = str.indexOf(ch, i + 1);
            if (check == -1)
                sb2.append(ch);
        }
        System.out.println("approach-3 : " + sb2);



        // apporach-4
        char[] charArray = str.toCharArray();
        StringBuilder sb4 = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (charArray[i] == charArray[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                sb4.append(charArray[i]);
        }
        System.out.println("approach-4 : " + sb4);



        // apporach-5
        StringBuilder sb5 = new StringBuilder();
        Set<Character> characterSet = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            characterSet.add(str.charAt(i));
        }
        for (Character character : characterSet) {
            sb5.append(character);
        }
        System.out.println(sb5);
    }
}
