import java.util.Arrays;

public class missingNumber {
    public static int missingNumber(int[] nums, int maxNum){
        int expectedSum = 0;
        for (int i=1; i <= maxNum; i++){
            expectedSum += i;
        }
        int actualSum = Arrays.stream(nums).sum();

        return expectedSum - actualSum;

    }}
