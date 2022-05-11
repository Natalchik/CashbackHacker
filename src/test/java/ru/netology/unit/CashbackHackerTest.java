package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {

    @Test
    public void shouldShowRemainderTo1000ToGetBonusIfLessThan1000() {
        CashbackHacker service = new CashbackHacker();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
    assertEquals(actual, expected);
    }

    @Test
    public void shouldShowRemainderToTheNext1000ToGetBonusIfMoreThan1000() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }
    @Test
    public void shouldNotShowRemainderWhen1000() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}