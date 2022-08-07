package junit5Tutorials;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class J01Assertions {

    @Test

    void testToAssert(){
        int actual = "ABCDE".length();
        int expected =5;

        //assertEquals(expected,actual,"actuel and expected not equal");
        //assertEquals(expected,actual,"");
        assertEquals("Beklenen ve gercek degerler esit degil",expected,actual);
    }
}
