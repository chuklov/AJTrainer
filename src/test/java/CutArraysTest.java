import org.testng.Assert;
import org.testng.annotations.Test;

public class CutArraysTest {

    CutArrays ca = new CutArrays();

    @Test
    public void cutEven() {
        int[] in = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] out = {1, 3, 5, 7, 9};
        Assert.assertEquals(ca.solution(in), out);
    }

    @Test
    public void cutOdd() {
        int[] in = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] out = {2, 4, 6, 8};
        Assert.assertEquals(ca.solution(in), out);
    }
}
