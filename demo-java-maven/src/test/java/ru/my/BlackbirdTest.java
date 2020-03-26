package ru.my;

import org.junit.Assert;
import org.junit.Test;
import ru.my.good.Blackbird;

public class BlackbirdTest {
    @Test
    public void flyingTest() {
        Blackbird blackbird = new Blackbird("Mag");
        blackbird.feed();
        Assert.assertTrue(blackbird.isFlying());
    }
}
