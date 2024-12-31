package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceJUnit4Test {

    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainLessThan1000() {
        Assert.assertEquals(100, service.remain(900));
    }

    @Test
    public void testRemainExactly1000() {
        Assert.assertEquals(0, service.remain(1000)); // Этот тест должен падать
    }

    @Test
    public void testRemainMoreThan1000() {
        Assert.assertEquals(900, service.remain(1100));
    }
}

