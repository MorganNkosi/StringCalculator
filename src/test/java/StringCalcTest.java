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
    void add() throws Exception {
        assertEquals(StringCalc.Add("//4\n142"),3);
    }

    @Test
    void except() throws Exception {
        StringCalc.Add("-1");
    }
}