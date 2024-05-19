package String_codes;

public class Remove_Special_Characters {
    public static void main(String[] args) {
        String s = "# Hello, World!@";
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Using String method : " + s1);

        //Another way - USing CharAt
        String s2 = "", s3 = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                s2 += s.charAt(i);
            }

            if (('a' <= s.charAt(i) && 'z' >= s.charAt(i)) || ('A' <= s.charAt(i) && 'Z' >= s.charAt(i))
                    || ('0' <= s.charAt(i) && '9' >= s.charAt(i))) {
                s3 += s.charAt(i);
            }

        }
        System.out.println("Using CharAt Method : " + s2);
        System.out.println("Using if condition : " + s3);
    }
}
