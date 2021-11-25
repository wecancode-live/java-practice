package in.balamt.practice.string;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;

public class CapitalCaseApp {

    public static void main(String[] args) {

        toCapitalCase("Hash Map App");

    }

    public static String toCapitalCase(String text){
        StringBuilder captialCase = new StringBuilder();

        Arrays.stream(text.split(" ")).forEach(val -> {
            captialCase.append(StringUtils.capitalize(val));
        });
        System.out.println(captialCase.toString());
        return captialCase.toString();

    }

}
