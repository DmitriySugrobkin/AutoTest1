package ru.netology;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void TestHackServiceIfAmount500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void TestHackServiceIfAmount1900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;
        int expected = 100;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void TestHackServiceIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }

}