package in.balamt.practice.util;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class JavaPracticeUtils {

    static Logger logger = Logger.getLogger(JavaPracticeUtils.class.getName());

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

    public static void print(Object... msg) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (Object line : msg
        ) {
            sb.append(line);
            sb.append("\t");
            index++;
            if(index == msg.length){
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }

    public static void printDoc(Class className) {
        String packagePath = className.getPackageName().replace(".", "/");
        String docFileName = className.getSimpleName();
        System.out.println(("/" + packagePath + "/" + docFileName + ".md"));

        try {
            InputStream docFile = new ByteArrayInputStream(Class.forName(className.getSimpleName()).getResourceAsStream(packagePath + "/" + docFileName + ".md").readAllBytes());
            String content = new String(docFile.readAllBytes(), StandardCharsets.UTF_8);
            System.out.println(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(packagePath + " " + docFileName);
    }
}
