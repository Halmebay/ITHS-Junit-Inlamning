import org.junit.Before;
import org.junit.Test;

import java.sql.SQLOutput;

import static org.junit.Assert.*;

public class BasicMathTestDiv {

    @Before
    public void setUp() throws Exception  {
        System.out.println("Vad ska stå här?");
    }


    @Test
    public void simpleDivTest() {
        BasicMath mathTest = new BasicMath();
        int a = 4;
        int b = 2;
        int result = mathTest.div(a, b);
        assertTrue(result == 2);
    }
}