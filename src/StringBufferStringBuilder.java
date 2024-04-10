public class StringBufferStringBuilder {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println(buffer.capacity());
        for (int i = 0; i < 1000; i++) {
            buffer.append("World");
        }
        System.out.println("Time Taken By StringBuffer : " + (System.currentTimeMillis() - startTime));

        StringBuilder builder = new StringBuilder("Hello");
        System.out.println(builder.capacity());
        for (int i = 0; i < 1000; i++) {
            builder.append("World");
        }
        System.out.println("Time Taken By StringBuilder : " + (System.currentTimeMillis() - startTime));

    }
}
