package ru.netology.statistics.services;

public class StatsService {


    // сумма
    public long amountSales(long[] sales) {
        long average = 0;
        for (long sale : sales) {
            average += sale;
        }
        return average;
    }

    // среднее

    public long mediumSales(long[] sales) {
        return amountSales(sales) / 12;
    }


    //минимум

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //максимум
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth;

    }


    // выше среднего
    public int aboveAverageSales(long[] sales) {
        long average = mediumSales(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;

    }

    // ниже среднего

    public int belowAverageSales(long[] sales) {

        long average = mediumSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }

}
