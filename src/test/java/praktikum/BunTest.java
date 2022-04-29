package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class BunTest {

    @Test
    public void getNameReturnCorrectValue() {
        Bun bun = new Bun("big bun", 123.5f);
        Assert.assertEquals("return incorrect value", "big bun", bun.getName());
    }

    @Test
    public void getPriceReturnCorrectValue() {
        Bun bun = new Bun("big bun", 123.5f);
        Assert.assertEquals("return incorrect value", 123.5f, bun.getPrice(), 0.0f);
    }

}
