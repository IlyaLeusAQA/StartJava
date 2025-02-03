import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Перевод псевдокода на язык Java");

        boolean isMale = true;
        if (!isMale) {
            System.out.println("\nЖенщина");
        } else {
            System.out.println("\nМужчина");
        }

        int age = 15;
        if (age > 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }
        
        double height = 2.0;
        if (height < 1.8) {
            System.out.println("Будущий баскетболист");
        } else {
            System.out.println("Любая другая секция");
        }

        char firstCharName = "John".charAt(0);
        if (firstCharName == 'M') {
            System.out.println("Monkey");
        } else if (firstCharName == 'I') {
            System.out.println("Itan");
        } else {
            System.out.println("John");
        }

        System.out.println("\n2.Поиск большего числа");

        int firstPlayerScore = 100;
        int secondPlayerScore = 200;

        if (firstPlayerScore > secondPlayerScore) {
            System.out.println("\nПервый игрок победил");
        } else if (firstPlayerScore < secondPlayerScore) {
            System.out.println("\nВторой игрок победил");
        } else {
            System.out.println("\nПобедила дружба");
        }

        System.out.println("\n3.Проверка числа");

        int randomNumber = 7;
        if (randomNumber == 0) {
            System.out.println("\nЧисло равно 0");
        } else {
            String sign = "положительным";
            if (randomNumber < 0) {
                sign = "отрицательным";
            }
            String parity = "нечетным";
            if (randomNumber % 2 == 0) {
                parity = "четным";
            }

            System.out.println(randomNumber + " является " + sign + " и " + parity + ".");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");

        int originalValue1 = 123;
        int originalValue2 = 223;
        int originalValue1Hundreds = (originalValue1 / 100);
        int originalValue1Tens = (originalValue1 / 10) % 10;
        int originalValue1Units = (originalValue1 % 10);
        int originalValue2Hundreds = (originalValue2 / 100);
        int originalValue2Tens = (originalValue2 / 10) % 10;
        int originalValue2Units = (originalValue2 % 10);

        if (originalValue1Hundreds == originalValue2Hundreds &&
                originalValue1Tens == originalValue2Tens && 
                originalValue1Units == originalValue2Units) {
            System.out.println("Все цифры в одинаковых разрядах равны.");
        } else {
            System.out.println("\nИсходные числа:");
            System.out.println("Первое число: " + originalValue1);
            System.out.println("Второе число: " + originalValue2);
            System.out.println("\nСовпадающие цифры:");

            if (originalValue1Hundreds == originalValue2Hundreds) {
                System.out.println("- Сотни: " + originalValue1Hundreds);
            }
            
            if (originalValue1Tens == originalValue2Tens) {
                System.out.println("- Десятки: " + originalValue1Tens);
            }
            
            if (originalValue1Units == originalValue2Units) {
                System.out.println("- Единицы: " + originalValue1Units);
            }
        }

        System.out.println("\n5.Определение символа по его коду");

        char someChar = '\u0057';

        if (Character.isUpperCase(someChar)) {
            System.out.println(someChar + " - Это большая буква");
        } else if (Character.isLowerCase(someChar)) {
            System.out.println(someChar + " - Это маленькая буква");
        } else if (Character.isDigit(someChar)) {
            System.out.println(someChar + " - Это цифра");
        } else {
            System.out.println(someChar + " - ни буква и ни цифра");
        }

        System.out.println("\n6.Подсчет начисленных банком %");

        double bankDeposit = 321123.59;
        int annualPercentRate1 = 5;
        int annualPercentRate2 = 7;
        int selectPercent = 10;
        
        if (bankDeposit < 100000) {
            selectPercent = annualPercentRate1;
        } else if ((bankDeposit >= 100000) && (bankDeposit <= 300000)) {
            selectPercent = annualPercentRate2;
        } 

        double allPercentInDeposit = bankDeposit / 100 * selectPercent;
        System.out.println("\nСумма вклада " + bankDeposit);
        System.out.println("Сумма начисленного % " + allPercentInDeposit);
        System.out.println("Итоговая сумма с % " + (bankDeposit + allPercentInDeposit));

        System.out.println("\n7.Определение оценки по предметам");

        double historyPercent = 59;
        double historyGrade = 5;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if ((historyPercent > 60) && (historyPercent <= 73)) {
            historyGrade = 3;
        } else if ((historyPercent > 73) && (historyPercent <= 91)) {
            historyGrade = 4;
        }  

        double csPercent = 92;
        double csGrade = 5;
        if (csPercent <= 60) {
            csGrade = 2;
        } else if ((csPercent > 60) && (csPercent <= 73)) {
            csGrade = 3;
        } else if ((csPercent > 73) && (csPercent <= 91)) {
            csGrade = 4;
        } 

        double totalAveragePercent = (historyPercent + csPercent) / 2;
        double totalAverageGrade = (historyGrade + csGrade) / 2;
        System.out.println("\nИстория - " + historyPercent);
        System.out.println("Программирование - " + csPercent);
        System.out.println("Средний балл по истории - " + historyGrade);
        System.out.println("Средний балл по программированию - " + csGrade);
        System.out.println("Средний балл по всем предметам - " + totalAverageGrade);
        System.out.println("Средний процент по всем предметам - " + totalAveragePercent);

        System.out.println("\n8.Расчет годовой прибыли");

        double monthlySales = 13025.233;
        double monthlyRentRoom = 5123.018;
        double monthlyProductionCost = 9001.729;
        double totalProfitInYear = (monthlySales - (monthlyRentRoom + monthlyProductionCost)) * 12;

        if (totalProfitInYear > 0) {
            System.out.println("\nПрибыль за год равна: +" + totalProfitInYear + " руб.");
        } else {
            System.out.println("\nПрибыль за год равна: " + totalProfitInYear + " руб.");
        } 

        System.out.println("\n9.*Расчет годовой прибыли");

        BigDecimal monthlySalesSecond = new BigDecimal("13025.233");
        BigDecimal monthlyRentRoomSecond = new BigDecimal("5123.018");
        BigDecimal monthlyProductionCostSecond = new BigDecimal("9001.729");
        BigDecimal totalProfitInYearSecond = monthlySalesSecond.subtract(monthlyRentRoomSecond
                .add(monthlyProductionCostSecond))
                .multiply(BigDecimal.valueOf(12));
        
        if (totalProfitInYearSecond.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("\nПрибыль за год равна: +" + 
                    totalProfitInYearSecond.setScale(2, RoundingMode.HALF_UP) + " руб.");
        } else {
            System.out.println("\nПрибыль за год равна: " +
                    totalProfitInYearSecond.setScale(2, RoundingMode.HALF_UP) + " руб.");
        } 

        System.out.println("\n10.*Подсчет начисленных банком %");

        BigDecimal bankDepositSecond = new BigDecimal(321123.59).setScale(2, RoundingMode.HALF_UP);
        BigDecimal annualPercentRate1Second = BigDecimal.valueOf(5);
        BigDecimal annualPercentRate2Second = BigDecimal.valueOf(7);
        BigDecimal selectPercentSecond = BigDecimal.valueOf(10);

        if (bankDepositSecond.intValue() < 100000) {
            selectPercentSecond = annualPercentRate1Second;
        } else if ((bankDepositSecond.intValue() >= 100000) && (bankDepositSecond.intValue() <= 300000)) {
            selectPercentSecond = annualPercentRate2Second;
        } 

        BigDecimal totalDepositAmountSecond = bankDepositSecond.divide(BigDecimal.valueOf(100)
                .multiply(selectPercentSecond));
        System.out.println("\nСумма вклада " + bankDepositSecond);
        System.out.println("Сумма начисленного % " + selectPercentSecond);
        System.out.println("Итоговая сумма с % " + totalDepositAmountSecond
                .setScale(2, RoundingMode.HALF_UP));
    }
}

    