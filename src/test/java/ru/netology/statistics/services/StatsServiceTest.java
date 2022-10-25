package ru.netology.statistics.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test // Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public void minimumSales() {
        StatsService servise = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        long actualMonth = servise.minSales(sales);

        System.out.print("Mинимальные продаж (месяц) " + actualMonth);

    }

    @Test // Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public void maxSales() {
        StatsService servise = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int actualMonth = servise.maxSales(sales);

        System.out.print("Максимальные продажи(месяц) " + actualMonth);

    }

    @Test // Среднюю сумму продаж в месяц

    public void mediumSales() {
        StatsService servise = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int actualMonth = servise.mediumSales(sales);

        System.out.print("Среняя сумма " + actualMonth);

    }

    @Test // Сумма

    public void amountSales() {
        StatsService servise = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int actualMonth = servise.amountSales(sales);

        System.out.print("Сумма " + actualMonth);
    }

    @Test // выше среднего

    public void aboveAverageSales() {
        StatsService servise = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int actualMonth = servise.aboveAverageSales(sales);

        System.out.print("Выше среднего " + actualMonth);
    }

    @Test // ниже среднего

    public void belowAverageSales() {
        StatsService servise = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int actualMonth = servise.belowAverageSales(sales);

        System.out.print("Ниже среднего " + actualMonth);
    }
}