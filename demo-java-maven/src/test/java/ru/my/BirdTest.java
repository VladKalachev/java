package ru.my;

import org.junit.Assert;
import org.junit.Test;
import ru.my.good.Bird;
import ru.my.good.Crow;

public class BirdTest {

    @Test
    public void nameTest(){
        Bird bird = new Crow("Mag");
        Assert.assertEquals("Wrong name", "Mag", bird.getName());

//        if(!bird.getName().equals("Mag")){
//            throw new RuntimeException("Wtorn name");
//        }
    }

    @Test
    public void toStringTest(){
        Bird bird = new Crow("Mag");
        Assert.assertTrue(bird.toString().contains("Mag"));
    }
}
