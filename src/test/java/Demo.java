import org.junit.Assert;
import org.junit.Test;

public class Demo {

    @Test
    public void Addition(){
        Assert.assertEquals(5, 2+3);
        Assert.assertEquals(5, 5);
        Assert.assertEquals(5, 10-5);
    }

    @Test
    public void Wrong(){
        Assert.assertEquals(5, 2+3);
        Assert.assertEquals(5, 4);
        Assert.assertEquals(5, 10-5);
    }

    public void Ignored(){

    }

}
