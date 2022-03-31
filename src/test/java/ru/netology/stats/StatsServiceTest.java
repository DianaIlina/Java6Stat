package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int expected = 180;

        int actual = service.calculateSum(this.sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSale() {
        StatsService service = new StatsService();
        int expected = 15;

        int actual = service.calculateAverageSale(this.sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSaleMonth() {
        StatsService service = new StatsService();
        int expected = 8;

        int actual = service.calculateMaxSale(this.sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSaleMonth() {
        StatsService service = new StatsService();
        int expected = 9;

        int actual = service.calculateMinSale(this.sales);

        assertEquals(expected, actual);
    }

    @Test
     void shouldCalculateNumberOfMonthsBelowAverage() {
        StatsService service = new StatsService();
        int expected = 5;

        int actual = service.calculateNumberOfMonthsBelowAverage(this.sales);

        assertEquals (expected, actual);
    }

    @Test
    void shouldCalculateNumberOfMonthsAboveAverage() {
        StatsService service = new StatsService();
        int expected = 7;

        int actual = service.calculateNumberOfMonthsAboveAverage(this.sales);

        assertEquals (expected, actual);
    }

}
