package ru.netology.unit;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerTest {

    @Test

    public void shouldShowRemainderTo1000ToGetBonusIfLessThan1000() {
        CashbackHacker service = new CashbackHacker();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowRemainderToTheNext1000ToGetBonusIfMoreThan1000() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotShowRemainderWhen1000() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}