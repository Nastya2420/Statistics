package ru.netology.statistics.services;

public class StatsService {

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


    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth;

    }

    public int mediumSales(int[] sales) {
        int average = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int j = 0; j < sales.length; j++) {
                sum += sales[j];
            }
            average = sum / sales.length;
        }
        return average;
    }

    public int amountSales(int[] sales) {
        int average = 0;
        for (int i = 0; i < sales.length; i++) {
            average = average + sales[i];
        }
        return average;
    }

    // выше среднего
    public int aboveAverageSales(int[] sales) {
        int sum = 0;
        int average = 0;
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        average = sum / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;

    }

    public int belowAverageSales(int[] sales) {
        int sum = 0;
        int average = 0;
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        average = sum / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }

}
