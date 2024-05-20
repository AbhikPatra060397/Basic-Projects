package String_codes;

public class ReplaceCharacter_WithOccurrence {
    public static void main(String[] args) {
        String input = "opentext";
        char replaceCharcter = 't';

        String inputLowerCase = input.toLowerCase();
        System.out.println(inputLowerCase);

        if (inputLowerCase.indexOf(replaceCharcter) == -1) {
            System.out.println("Character not found");
            System.exit(0);
        }

        int occurCount = 1;
        for (int i = 0; i < inputLowerCase.length(); i++) {
            char ch = inputLowerCase.charAt(i);
            if (ch == replaceCharcter) {
                input = input.replaceFirst(String.valueOf(replaceCharcter), String.valueOf(occurCount));
                ++occurCount;
            }
        }
        System.out.println(input);
    }
}
