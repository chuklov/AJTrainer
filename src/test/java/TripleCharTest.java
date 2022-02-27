import org.testng.Assert;
import org.testng.annotations.Test;

public class TripleCharTest {

    TripleChar tc = new TripleChar();

    @Test
    public void small() {
        Assert.assertEquals(tc.charCheck("aabbcccdddeeeefhhhjj"), "aabb3C3D3Eej3Hjj");
    }

    @Test
    public void withNumbers() {
        Assert.assertEquals(tc.charCheck("aaaabbcccccdeffggggjjjjjjttkkk11rrr333"), "3Aabb3Cccdeff3Gg3J3Jtt3K113R333");
    }

    @Test
    public void complicated() {
        Assert.assertEquals(tc.charCheck("abbcccddddeeeeeffffffgggjjjjhtyuirrrrrrrr"), "abb3C3Dd3Eee3F3F3G3Jjhtyui3R3Rrr");
    }

    @Test
    public void single() {
        Assert.assertEquals(tc.charCheck("a"), "a");
    }

    @Test
    public void noCHanges() {
        Assert.assertEquals(tc.charCheck("abcdefg"), "abcdefg");
    }
}
