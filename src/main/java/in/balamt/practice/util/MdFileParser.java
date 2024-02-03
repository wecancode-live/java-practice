package in.balamt.practice.util;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.text.TextContentRenderer;

public class MdFileParser {

    public static void parse(String fileContent){
        Parser parser = Parser.builder().build();
        Node document = parser.parse(fileContent);

        // Render the text content
        TextContentRenderer renderer = TextContentRenderer.builder().build();
        JavaPracticeUtils.print(renderer.render(document));
    }
}
