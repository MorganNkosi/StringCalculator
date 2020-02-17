import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalcTest {

    private StringCalc calc;

    @BeforeEach
    void init()
    {
        calc = new StringCalc();
    }

    @Test
    void addTwoIntegers() throws Exception {
        assertEquals(StringCalc.Add(""),0);
        assertEquals(StringCalc.Add("1"),1);
        assertEquals(StringCalc.Add("1,1"),2);
    }

    @Test
    void addMultipleIntegers() throws Exception {
        assertEquals(StringCalc.Add("1,2,3,4"),10);
        assertEquals(StringCalc.Add(""),0);
        assertEquals(StringCalc.Add("1"),1);
        assertEquals(StringCalc.Add("1,1"),2);
    }

    @Test
    void addWithNewLine() throws Exception {
        assertEquals(StringCalc.Add("1\n2,3"),6);
    }

    @Test
    void addWithDiffDelimiters() throws Exception {
        assertEquals(StringCalc.Add("//;\n1;2"),3);
        assertEquals(StringCalc.Add("//4\n142"),3);
    }

    @Test
    void handleNegative() throws Exception {
        assertThrows(Exception.class, ()-> StringCalc.Add("-3;5"));
    }

    @Test
    void ignoreGreaterThan1000() throws Exception {
        assertEquals(StringCalc.Add("//;\n1000,1;2"),3);
    }

    @Test
    void anyLengthDelimiter() throws Exception {
        assertEquals(StringCalc.Add("//4\n142"),3);
    }

    @Test
    void diffDelimiterAnyLength() throws Exception {
        assertEquals(StringCalc.Add("//4\n142"),3);
    }

    @Test
    void invalidInput() throws Exception {
        assertEquals(StringCalc.Add("//4\n142"),3);
    }
}