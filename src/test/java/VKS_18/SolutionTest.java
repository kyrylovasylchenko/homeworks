package VKS_18;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void romanToIntTest(){

        Assert.assertEquals(3, solution.romanToInt("III"));
        Assert.assertEquals(58, solution.romanToInt("LVIII"));
        Assert.assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}
