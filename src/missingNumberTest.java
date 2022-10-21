import org.junit.Test;

import static org.junit.Assert.*;

public class missingNumberTest {
    private int[] missingHighest = {1,2,3,4,5,6,7,8,9};
    private int[] missingOne = {2,3,4,5,6,7,8,9,10};
    private int[] notMissing = {1,2,3,4,5,6,7,8,9,10};
    private missingNumber missNum = new missingNumber();

    @Test
    public void testMissingNumber_notMissing() {
        assertEquals(0, missNum.missingNumber(notMissing, 10));
    }

    @Test
    public void testMissingNumber_missingOne(){
        assertEquals(1, missNum.missingNumber(missingOne, 10));
    }
    @Test
    public void testMissingNumber_missingHighest(){
        assertEquals(10, missNum.missingNumber(missingHighest, 10));
    }
}