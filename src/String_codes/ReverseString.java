package String_codes;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";

        System.out.print("by using charAt : ");
        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.print(str.charAt(str.length() - 1 - i));
        }
        System.out.println();

        System.out.print("by using String concept : ");
        String rstr = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            rstr += str.charAt(str.length() - 1 - i);
        }
        System.out.println(rstr);

        StringBuffer sb = new StringBuffer(str);
        System.out.println("By using StringBuffer : "+ sb.reverse());

        StringBuilder sb1 = new StringBuilder(str);
        System.out.println("By using StringBuilder : "+ sb1.reverse());
    }
}
