import org.testng.Assert;
import org.testng.annotations.Test;

public class CutArraysTest {

    CutArrays ca = new CutArrays();

    @Test
    public void cutOne() {
        int[] in = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] out = {1, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertEquals(ca.solution(in, 2), out);
    }

    @Test
    public void cutMulti() {
        int[] in = {1, 2, 3, 4, 5, 4, 7, 8, 4};
        int[] out = {1, 2, 3, 5, 7, 8};
        Assert.assertEquals(ca.solution(in, 4), out);
    }

    @Test
    public void cutEmpty() {
        int[] in = {};
        int[] out = {};
        Assert.assertEquals(ca.solution(in, 4), out);
    }
}
