//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int monthlyDeposit = 15000;
        int startSum = 0;
        int month = 0;
        while (startSum <= 2459000) {
            startSum = startSum + monthlyDeposit;
            month = month + 1;
            System.out.println("В " + month + "-й месяц сумма накоплений равна " + startSum);
        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 2");
        int i = 0;
        int n = 11;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        while (n > 1) {
            n = n - 1;
            System.out.print(n + " ");
        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 3");
        int population = 1200000;
        int time = 0;
        while (time < 10) {
            time += 1;
            population = population + population / 1000 * 17 - population / 1000 * 8;
            System.out.println("Год " + time + "-ый, численность населения составляет " + population);
        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 4");
        int monthlyPayment = 15000;
        float monthlySum = 0F;
        int monthNumber = 0;
        DecimalFormat dF = new DecimalFormat("###,###,###.00");
        do {
            monthlySum = monthlySum + monthlyPayment;
            monthlySum = (float) (monthlySum + monthlySum * 0.07);
            monthNumber = monthNumber + 1;
            System.out.println("Сумма накоплений в " + monthNumber + "-ый месяц равна " + dF.format(monthlySum));
        }
        while (monthlySum < 12000000);
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 5");
        int monthlyFee = 15000;
        float monthlyAmount = 0F;
        int monthCounter = 0;
        DecimalFormat dR = new DecimalFormat("###,###,###.00");
        while (monthlyAmount < 12000000) {
            monthlyAmount = monthlyAmount + monthlyFee;
            monthlyAmount = (float) (monthlyAmount + monthlyAmount * 0.07);
            monthCounter = monthCounter + 1;
            if (monthCounter % 6 != 0) {
                continue;
            }
            System.out.println("Сумма накоплений в " + monthCounter + "-ый месяц равна " + dR.format(monthlyAmount));
        }

        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 6");
        int depositTerm = 9;
        float monthlyLevy = 15000F;
        float amountByMonth = 0F;
        float halfYearSum;
        int j = 0;
        int halfYear = depositTerm * 2;
        DecimalFormat dS = new DecimalFormat("###,###,###.00");
        while (j < halfYear) {
            j = j + 1;
            amountByMonth = (float) (amountByMonth + monthlyLevy + monthlyLevy * 0.07);
            halfYearSum = amountByMonth * 6;
            System.out.println("Сумма накоплений в " + j + "-ое полугодие равна " + dS.format(halfYearSum));

        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 7");
        int fridayFirstDate = 3;
        while (fridayFirstDate <= 31) {
            System.out.println("Сегодня пятница, " + fridayFirstDate + "-е число. Необходимо подготовить отчет");
            fridayFirstDate = fridayFirstDate + 7;
        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 8");
        int currentYear = 2025;
        int cometAppearanceYear = 0;
        for (int comet = 0; comet < currentYear; comet += 79) {
            cometAppearanceYear = cometAppearanceYear + 79;
            if (cometAppearanceYear >= (currentYear - 200) && cometAppearanceYear < (currentYear + 100))
                System.out.println(cometAppearanceYear);
        }
        System.out.println(" ");
        System.out.println("____");
        System.out.println(" ");


        System.out.println("Задача 8а");
        int currentYear1 = 2025;
        int cometAppearanceYear1 = 0;
        int CometPeriod = 79;
        for (int comet = 0; comet < currentYear; comet += CometPeriod) {
            cometAppearanceYear1 = cometAppearanceYear1 + CometPeriod;
            if (cometAppearanceYear1 >= (currentYear1 - 200) && cometAppearanceYear1 < (currentYear1 + 100))
                System.out.println(cometAppearanceYear1);
        }

    }
}