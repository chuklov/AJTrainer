import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * CutMultiArrayTest created by
 *
 * @Author Alex
 * 2/28/2022
 */
public class CutMultiArrayTest {

    CutMultiArray ca = new CutMultiArray();

    @Test
    public void cutOne() {
        int[] in = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] remove = {2, 8};
        int[] out = {1, 3, 4, 5, 6, 7, 9};
        Assert.assertEquals(ca.solution(in, remove), out);
    }

    @Test
    public void cutMulti() {
        int[] in = {1, 2, 3, 4, 5, 4, 7, 8, 4, 10, 14, 13, 84, 64, 33, 33, 33};
        int[] remove = {4, 33};
        int[] out = {1, 2, 3, 5, 7, 8, 10, 14, 13, 84, 64};
        Assert.assertEquals(ca.solution(in, remove), out);
    }

    @Test
    public void cutEmpty() {
        int[] in = {};
        int[] remove = {};
        int[] out = {};
        Assert.assertEquals(ca.solution(in, remove), out);
    }
}
