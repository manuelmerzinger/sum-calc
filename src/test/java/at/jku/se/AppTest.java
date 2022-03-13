package at.jku.se;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void calculateSumForOneAndOne()
    {
        int sum = App.sum(1,1);
        assertEquals(2,sum);
    }
}
