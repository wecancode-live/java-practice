package in.balamt.practice.util;

import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public interface JavaPracticeLogger {
    @Slf4j
    final class LogHandler{}

    static void printLn(Object... msg) {

        StringBuilder sb = new StringBuilder();
        for (Object line : msg
        ) {
            sb.append(line);
            sb.append("\t");
        }
        LogHandler.log.error(sb.toString());
    }

    static void print(Object... msg){
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
        LogHandler.log.error(sb.toString());
    }

    static void printDoc(Class className){
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

        LogHandler.log.error(packagePath + " " + docFileName);
    }
}
