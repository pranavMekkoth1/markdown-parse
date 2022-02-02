import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

//above commands imports libraries


public class MarkdownParseTest {
    @Test
    //defines method below as a junit test
    public void addition() {
        assertEquals(2, 1 + 1);//checks if input results in expected output
        //equivalent to the value of the second param
    }

    //javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
    @Test
    public void markdownTest() throws IOException{
        Path fileName = Path.of("nolinks.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> linksdata = new ArrayList<>();
        // MarkdownParse.getLinks("");
        assertEquals(linksdata, links);

        Path fileName1= Path.of("space_test.md");
        String contents2 = Files.readString(fileName);
        ArrayList<String> links2 = MarkdownParse.getLinks(contents2);
        ArrayList<String> linksdata2 = MarkdownParse.getLinks("links_with_chars.md");
        assertEquals(linksdata2, links);

        
        Path fileName2= Path.of("links_with_extra_chars.md");
        String contents3 = Files.readString(fileName);
        ArrayList<String> links3 = MarkdownParse.getLinks(contents);
        ArrayList<String> linksdata3 = MarkdownParse.getLinks("links_with__extra_chars.md");
        assertEquals(linksdata3, links);   
    }
}
