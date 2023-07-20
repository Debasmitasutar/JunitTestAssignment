import org.example.MaxElement;
import org.junit.Assert;
import org.junit.Test;

public class MaxElementTest {
    @Test
    public  void testFindMax(){
        MaxElement max = new MaxElement();
        Assert.assertEquals(4,max.findMax(new int[]{1,3,2,4}));
    }
}
