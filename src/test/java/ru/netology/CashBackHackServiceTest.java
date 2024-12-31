package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainLessThan1000() {
        Assert.assertEquals(service.remain(900), 100);
    }

    @Test
    public void testRemainExactly1000() {
        Assert.assertEquals(service.remain(1000), 0); // Этот тест должен падать
    }

    @Test
    public void testRemainMoreThan1000() {
        Assert.assertEquals(service.remain(1100), 900);
    }
}

