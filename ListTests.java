
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

class MyChecker implements StringChecker {

    String key;

    public MyChecker(String s) {
        this.key = s;
    }

    public boolean checkString(String s) {
        return s.contains(this.key);
    }
}

public class ListTests {
    
    @Test
    public void testFilter() {
        StringChecker filter1 = new MyChecker("b");
        List<String> input1 = Arrays.asList("a", "b", "c", "banana", "bo");
        assertThat(ListExamples.filter(input1, filter1), is(Arrays.asList("b", "banana", "bo")));

    }

    @Test
    public void testMerge() {
        List<String> input1 = Arrays.asList("a", "d");
        List<String> input2 = Arrays.asList("a", "c", "f");
        assertThat(ListExamples.merge(input1, input2), is(Arrays.asList("a", "a", "c", "d", "f")));
    }
}