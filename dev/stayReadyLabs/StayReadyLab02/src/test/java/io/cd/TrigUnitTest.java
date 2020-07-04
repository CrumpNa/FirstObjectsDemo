package io.cd;

import org.junit.Test;
import org.junit.Assert;

public class TrigUnitTest {

    @Test
    public void switchDisplayModeTest1() {
        // given
        TrigUnit trigUnit = new TrigUnit();

        // when
        trigUnit.switchDisplayMode();

        // then
        boolean actual = trigUnit.getCurrentDisplay();
        Assert.assertTrue(actual);
    }

    @Test
    public void switchDisplayModeTest2() {
        // given
        TrigUnit trigUnit = new TrigUnit();

        // when
        trigUnit.switchDisplayMode("radians");

        // then
        boolean actual = trigUnit.getCurrentDisplay();
        Assert.assertTrue(actual);
    }
}