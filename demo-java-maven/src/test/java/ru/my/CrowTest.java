package ru.my;

import org.junit.Assert;
import org.junit.Test;
import ru.my.good.Crow;

public class CrowTest {
    @Test
    public void flyingTest() {
        Crow crow = new Crow("Mag");
        crow.feed();
        Assert.assertFalse(crow.isFlying());
    }
}
