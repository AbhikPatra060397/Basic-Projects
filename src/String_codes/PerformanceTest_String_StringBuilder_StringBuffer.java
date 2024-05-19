package String_codes;

public class PerformanceTest_String_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Hello");
        for (int i = 0; i < 1000000; i++) {
            sb.append("Java");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Hello");
        for (int i = 0; i < 1000000; i++) {
            sb2.append("Java");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        String str = new String("Hello");
        String str1 = "Java";
        for (int i = 0; i <= 10000; i++) {
            str = str + str1;
        }
        System.out.println("Time taken by String: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
