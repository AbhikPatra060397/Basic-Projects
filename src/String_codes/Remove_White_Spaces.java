package String_codes;

public class Remove_White_Spaces {
    public static void main(String[] args) {
        String str = "hello world : its Java";
        System.out.println("using //s & replaceAll : " + str.replaceAll("\\s", ""));
//        System.out.println("using replaceAll : "+str.replaceAll("[^a-zA-z0-9:]","")); // it will not work it there is multiple kind special character

        String str1 = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (!(str.charAt(i) == ' ')) {
                str1 += str.charAt(i);
            }
        }
        System.out.println("using charAt method with if condition : " + str1);
    }
}
