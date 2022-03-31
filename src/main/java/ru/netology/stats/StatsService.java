package ru.netology.stats;

public class StatsService {

    public int calculateSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        System.out.println("Сумма всех продаж: " + sum);
        return sum;
    }

    public int calculateAverageSale(long[] sales) {
        int average = calculateSum(sales) / sales.length;

        System.out.println("Средняя сумма продаж в месяц: " + average);
        return average;
    }

    public int calculateMaxSale(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        System.out.println("Месяц с максимальной продажей: " + maxMonth);
        return maxMonth + 1;
    }

    public int calculateMinSale(long[] sales) {
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
        System.out.println("Месяц с минимальной продажей: " + (minMonth + 1));
        return minMonth + 1;
    }

    public int calculateNumberOfMonthsBelowAverage(long[] sales) {
        int counter = 0;
        int average = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale < average ) {
                counter++;
            }
        }
        System.out.println("Количество месяцев с продажами ниже среднего: " + counter);
        return counter;
    }

    public int calculateNumberOfMonthsAboveAverage(long[] sales) {
        int counter = 0;
        int average = calculateAverageSale(sales);
        for (long sale : sales) {
            if (sale >= average) {
                counter++;
            }
        }
        System.out.println("Количество месяцев с продажами выше среднего: " + counter);
        return counter;
    }


}
