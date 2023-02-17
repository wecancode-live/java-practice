package in.balamt.practice.util;

public class JavaPracticeUtils {

    private JavaPracticeUtils() {
    }
    public static void printLine(Object... msg) {
        StringBuilder sb = new StringBuilder();
        for (Object line : msg
        ) {
            sb.append(line);
            sb.append("\t");
        }
        System.out.println(sb);
    }
}
