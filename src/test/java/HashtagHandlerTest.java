import org.junit.jupiter.api.Test;
import taskTwo.HashtagHandler;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class HashtagHandlerTest {

    @Test
    public void validTest() {
        List<String> data = List.of(
                "hello #gym#amaterasu#print #gym #hp",
                "#gym hello #amaterasu ##print#pip",
                "#print #gym pass #hello ####hall",
                "#gym");

        List<String> actual = new HashtagHandler(data).topFive();
        List<String> extended = List.of(
                "#gym",
                "#print",
                "#amaterasu",
                "#hall",
                "#hello"
        );

        assertEquals(extended, actual);
    }

    @Test
    public void emptyTest() {
        List<String> data = List.of();


        List<String> actual = new HashtagHandler(data).topFive();
        List<String> extended = List.of();

        assertEquals(extended, actual);
    }

    @Test
    public void test() {
        List<String> data = List.of("##hello");

        List<String> actual = new HashtagHandler(data).topFive();
        List<String> extended = List.of("#hello");

        assertEquals(extended, actual);
    }

    @Test
    public void emptyTest1() {
        List<String> data = List.of("#####");

        List<String> actual = new HashtagHandler(data).topFive();
        List<String> extended = List.of();

        assertEquals(extended, actual);
    }
}
