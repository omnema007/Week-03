package stringbuffer.comparestringbufferwithstringbuilder;

public class CompareStringbufferWithStringBuilder {
    public static void compare() {
        long startTime, endTime;
        String text = "hello";

        // Testing StringBuilder Performance
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder("Java");
        for (int i = 0; i < 1000000; i++) {
            sb.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime)/1000000 + " ns");

        // Testing StringBuffer Performance
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer("Java");
        for (int i = 0; i < 1000000; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime)/1000000 + " ns");

    }
}
