import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class BasicMath_SubtractTest {

    BasicMath math = new BasicMath();
    double result;

    @Before
    public void setUp() throws Exception{
        result = 0;
    }

    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void test_subtract_normal_case(){
        result = math.subtract(1900, 6);
        assertTrue(result == 1894);
    }

    @Test
    public void test_subtract_with_negative_ints(){
        result = math.subtract(-640, -200);
        assertTrue(result == -440);
    }

    @Test
    public void test_subtract_with_one_positive_and_one_negative_int(){
        result = math.subtract(246, -1998);
        assertTrue(result == 2244);
    }

    @Test
    public void test_subtract_with_one_negative_and_one_positive_int(){
        result = math.subtract(-1245, 1525);
        assertTrue(result == -2770);
    }
}