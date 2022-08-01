package ru.netology.test;

import static org.junit.Assert.*;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashBackHackServiceTest {

    @Test
    public void testAmount900() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void testAmount1000() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testAmount1001() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void testAmount999() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testAmount0() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }
}