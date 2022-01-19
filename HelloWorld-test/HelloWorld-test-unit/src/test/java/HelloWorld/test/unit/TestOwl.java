package HelloWorld.test.unit;

import HelloWorld.domain.Owl;
import org.junit.Assert;
import org.junit.Test;

public class TestOwl {

    @Test
    public void testOwlConstructor(){
        Owl owl = new Owl(90, "male","bosse");
        Assert.assertEquals("bosse" , owl.getName());
    }
}
