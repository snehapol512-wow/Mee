package strings;

public class BufferBuilderPerformance {
    public static void main(String[] args) {
        long StartTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Java");
        for (int i = 1; i <= 10000; i++) {
            buffer.append(" DSA");
        }
        System.out.println("Buffer time: " + (System.currentTimeMillis() - StartTime) + "ms");
        StartTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Java");
        for (int i = 1; i <= 10000; i++) {
            builder.append(" DSA");
        }
        System.out.println("Builder time: " + (System.currentTimeMillis() - StartTime) + "ms");
    }
}
