import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class BalancedTest {

    Balanced brackets = new Balanced();

    @Parameters
    public static Collection<Object[]> testConditions(){
        String balancedPar = "()";
        String openPar ="(()";
        String closePar ="))";
        String none =" ";
        String pointyBrackets="<>";

        Object[][] expectedOutputs = {
                {balancedPar, true},
                {openPar, false},
                {closePar, false},
                {none, false},
                {pointyBrackets, true}
        };
                return Arrays.asList(expectedOutputs);
        }

//    @Test
//    public void testBalancedBrackets_balancedPar() {
//        assertTrue(brackets.balanced("(1)"));
//    }
}