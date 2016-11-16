package com.adactive.DemoAdsum.structure;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ambroise on 16/11/2016.
 */
public class LolTest {

    @Test
    public void testBite() {
        Lol lol = new LolBuilder().setBite("bite").createLol();

        Lol.Foo e = new Lol.Foo();
        Assert.assertEquals(lol.bite, "bijkte");
    }

}