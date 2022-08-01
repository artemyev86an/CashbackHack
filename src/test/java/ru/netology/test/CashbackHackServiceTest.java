package ru.netology.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    //Подробнее: кэшбек начисляется за каждую потраченную полную тысячу рублей,
    // поэтому если вы покупаете что-то на 900 рублей,
    // сервис должен посоветовать вам докупить "ещё чего-нибудь" на 100 рублей.


    @Test
    public void testAmount900() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testAmount1000() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testAmount1001() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testAmount999() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testAmount0() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }
}