package ru.netology;


//import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void TestHackServiceIfAmount500(){
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void TestHackServiceIfAmount1900(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;
        int expected = 100;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

}