package in.balamt.practice.java8.optional;

import in.balamt.practice.util.JavaPracticeUtils;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {

        String[] names = new String[10];

        names[5] = "Java Practise";

        Optional<String> emptyOptional = Optional.empty();
        Optional<String> namesOptional = Optional.of(names[5]);

        JavaPracticeUtils.printLine("Optional isEmpty on Empty object ", emptyOptional.isEmpty());
        JavaPracticeUtils.printLine("Optional isEmpty on nonEmpty object ", namesOptional.isEmpty());

        JavaPracticeUtils.printLine("Optional isPresent on Empty object ", emptyOptional.isPresent());
        JavaPracticeUtils.printLine("Optional isPresent on nonEmpty object ", namesOptional.isPresent());

        JavaPracticeUtils.printLine("Optional ifPresent on Empty object ");
        emptyOptional.ifPresent(System.out::println);
        JavaPracticeUtils.printLine("Optional ifPresent on nonEmpty object ");
        namesOptional.ifPresent(System.out::println);

        JavaPracticeUtils.printLine("Optional map on Empty object ", emptyOptional.map(String::toUpperCase));
        JavaPracticeUtils.printLine("Optional map on nonEmpty object ", namesOptional.map(String::toUpperCase));

        JavaPracticeUtils.printLine("Optional filter on Empty object ", emptyOptional.filter(c->c.equalsIgnoreCase(names[5])));
        JavaPracticeUtils.printLine("Optional filter on nonEmpty object ", namesOptional.filter(c->c.equalsIgnoreCase(names[5])));

        JavaPracticeUtils.printLine("Optional orElse on Empty object returned ", emptyOptional.orElse("default value"));
        JavaPracticeUtils.printLine("Optional orElse on nonEmpty object returned ", namesOptional.orElse("default value"));

        JavaPracticeUtils.printLine("Optional orElseGet on Empty object returned ", emptyOptional.orElseGet(() -> "Default value"));
        JavaPracticeUtils.printLine("Optional orElseGet on nonEmpty object returned ", namesOptional.orElseGet(() -> "Default value"));

        try {
            JavaPracticeUtils.printLine("Optional orElseThrow on Empty object returned ", emptyOptional.orElseThrow());
        } catch (NoSuchElementException nsee) {
            JavaPracticeUtils.printLine("Optional orElseThrow on Empty object thrown with error message ", nsee.getMessage());
        }

        /**
         * Below is the output when executed.
         *  **************** 	optional.OptionalApp	 ****************
         * Optional isEmpty on Empty object 	true
         * Optional isEmpty on nonEmpty object 	false
         * Optional isPresent on Empty object 	false
         * Optional isPresent on nonEmpty object 	true
         * Optional ifPresent on Empty object
         * Optional ifPresent on nonEmpty object
         * Java Practise
         * Optional map on Empty object 	Optional.empty
         * Optional map on nonEmpty object 	Optional[JAVA PRACTISE]
         * Optional filter on Empty object 	Optional.empty
         * Optional filter on nonEmpty object 	Optional[Java Practise]
         * Optional orElse on Empty object returned 	default value
         * Optional orElse on nonEmpty object returned 	Java Practise
         * Optional orElseGet on Empty object returned 	Default value
         * Optional orElseGet on nonEmpty object returned 	Java Practise
         * Optional orElseThrow on Empty object thrown with error message 	No value present
         */


    }
}
