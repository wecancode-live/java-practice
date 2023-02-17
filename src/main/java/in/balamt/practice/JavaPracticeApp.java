package in.balamt.practice;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

public class JavaPracticeApp {

    public static final String CLASSESLIST_YAML_FILE = "classeslist.yaml";
    public static final String MAIN_METHOD_NAME = "main";
    public static final String STAR_PRINT = " **************** ";
    public static final String NEW_LINE = System.lineSeparator();
    public static final String DOT_CHAR = ".";

    public static void main(String... arg) {

        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            File file = new File(classLoader.getResource(CLASSESLIST_YAML_FILE).getFile());
            ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
            objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
            ClassItem classList;
            classList = objectMapper.readValue(file, ClassItem.class);

            String rootPackage = classList.getRoot();
            classList.getCategories().forEach(
                    category -> {
                        String subpackage = category.getName();
                        category.getClasses().getClassname().forEach(
                                clsnm -> {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append(rootPackage);
                                    stringBuilder.append(DOT_CHAR);
                                    stringBuilder.append(subpackage);
                                    stringBuilder.append(DOT_CHAR);
                                    stringBuilder.append(clsnm);
                                    System.out.println(STAR_PRINT + clsnm + STAR_PRINT);
                                    try {
                                        String[] ar = null;
                                        Class.forName(stringBuilder.toString()).getMethod(MAIN_METHOD_NAME, String[].class).invoke(null, (Object) ar);
                                        System.out.println(NEW_LINE);
                                    } catch (IllegalAccessException e) {
                                        e.printStackTrace();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                        );
                    }
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

