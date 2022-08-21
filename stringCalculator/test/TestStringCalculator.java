package stringCalculator.test;

import stringCalculator.main.StringCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.InputStream;

public class TestStringCalculator{

    StringCalculator calculator = new StringCalculator();
    String inputString;
    int expected;

    @Test
    public void emptyStringInput(){
        // single value input should return 0
        inputString = "";
        expected = 0;
        assertEquals(expected, calculator.add(inputString));
    }

    @Test
    public void singleValueInput(){
        // single value input should return value itself
        inputString = "4";
        expected = 4;
        assertEquals(expected, calculator.add(inputString));
        
        inputString = " 36 781 ";
        expected = 36781;
        assertEquals(expected, calculator.add(inputString));
    }
}