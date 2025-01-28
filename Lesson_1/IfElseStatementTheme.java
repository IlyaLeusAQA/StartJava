import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Перевод псевдокода на язык Java");

        boolean isGender = true;
        if (!isGender) {
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
            String sign;
            if (randomNumber < 0) {
                sign = "отрицательным";
            } else {
                sign = "положительным";
            }

            String parity;
            if (randomNumber % 2 == 0) {
                parity = "четным";
            } else {
                parity = "нечетным";
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
        boolean hasMathes = false;

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
        int percentRate1 = 5;
        int percentRate2 = 7;
        int percentRate3 = 10;
        int selectPercent = 0;
        double allPercentInDeposit = 0;

        if (bankDeposit < 100000) {
            selectPercent += percentRate1;
            allPercentInDeposit = bankDeposit / 100 * selectPercent;
        } else if ((bankDeposit >= 100000) && (bankDeposit <= 300000)) {
            selectPercent += percentRate2;
            allPercentInDeposit = bankDeposit / 100 * percentRate2;
        } else {
            selectPercent += percentRate3;
            allPercentInDeposit = bankDeposit / 100 * percentRate3;
        }

        System.out.println("\nСумма вклада " + bankDeposit);
        System.out.println("Сумма начисленного % " + allPercentInDeposit);
        System.out.println("Итоговая сумма с % " + (bankDeposit + allPercentInDeposit));

        System.out.println("\n7.Определение оценки по предметам");

        double percentEndScoreHistory = 59;
        double percentEndScoreProgramming = 92;
        double averageScoreHistory = 0;
        double averageScoreProgramming = 0;
        
        if (percentEndScoreHistory <= 60) {
            averageScoreHistory = 2;
        } else if ((percentEndScoreHistory > 60) && (percentEndScoreHistory <= 73)) {
            averageScoreHistory = 3;
        } else if ((percentEndScoreHistory > 73) && (percentEndScoreHistory <= 91)) {
            averageScoreHistory = 4;
        } else {
            averageScoreHistory = 5;
        } 

        if (percentEndScoreProgramming <= 60) {
            averageScoreProgramming = 2;
        } else if ((percentEndScoreProgramming > 60) && (percentEndScoreProgramming <= 73)) {
            averageScoreProgramming = 3;
        } else if ((percentEndScoreProgramming > 73) && (percentEndScoreProgramming <= 91)) {
            averageScoreProgramming = 4;
        } else {
            averageScoreProgramming = 5;
        } 

        double totalAverageScore = (percentEndScoreHistory + percentEndScoreProgramming) / 2;
        System.out.println("\nИстория - " + percentEndScoreHistory);
        System.out.println("Программирование - " + percentEndScoreProgramming);
        System.out.println("Средний балл по истории - " + averageScoreHistory);
        System.out.println("Средний балл по программированию - " + averageScoreProgramming);
        System.out.println("Средний балл по всем предметам - " + totalAverageScore);

        System.out.println("\n8.Расчет годовой прибыли");

        double monthlySales = 13025.233;
        double monthlyRentRoom = 5123.018;
        double monthlyProductionCost = 9001.729;
        double totalProfitInYear = ((monthlySales * 12) - (monthlyRentRoom + monthlyProductionCost) * 12);

        if (totalProfitInYear == 0) {
            System.out.println("Прибыль за год равна 0");
        } else if (totalProfitInYear < 0) {
            System.out.println("\nПрибыль за год равна: " + totalProfitInYear + " руб.");
        } else {
            System.out.println("Прибыль за год равна: +" + totalProfitInYear + " руб.");
        }

        System.out.println("\n9.*Расчет годовой прибыли");

        BigDecimal monthlySalesSecond = new BigDecimal("13025.233");
        BigDecimal monthlyRentRoomSecond = new BigDecimal("5123.018");
        BigDecimal monthlyProductionCostSecond = new BigDecimal("9001.729");
        BigDecimal totalAnnualInMonthSecond = monthlyRentRoomSecond.add(monthlyProductionCostSecond);
        BigDecimal totalAnnualInYearSecond = totalAnnualInMonthSecond.multiply(new BigDecimal(12));
        BigDecimal totalSalesInYear = monthlySalesSecond.multiply(new BigDecimal(12));
        BigDecimal totalProfitInYearSecond = totalSalesInYear.subtract(totalAnnualInYearSecond)
                .setScale(2, RoundingMode.HALF_UP);
        
        if (totalProfitInYearSecond == new BigDecimal(0)) {
            System.out.println("\nПрибыль за год равна 0");
        } else if (totalProfitInYearSecond.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("\nПрибыль за год равна: " + totalProfitInYearSecond + " руб.");
        } else {
            System.out.println("\nПрибыль за год равна: +" + totalProfitInYearSecond + " руб.");
        }

        System.out.println("\n10.*Подсчет начисленных банком %");

        BigDecimal bankDepositSecond = new BigDecimal(321123.59).setScale(2, RoundingMode.HALF_UP);
        BigDecimal percentRate1Second = new BigDecimal(5);
        BigDecimal percentRate2Second = new BigDecimal(7);
        BigDecimal percentOverThreeHundredThousandSecond = new BigDecimal(10);
        BigDecimal allPercentInDepositSecond = new BigDecimal(0);

        if (bankDepositSecond.intValue() < 100000) {
            allPercentInDepositSecond = bankDepositSecond
            .divide(new BigDecimal(100), 2, RoundingMode.HALF_UP)
            .multiply(percentRate1Second);
        } else if ((bankDepositSecond.intValue() >= 100000) && (bankDepositSecond.intValue() <= 300000)) {
            allPercentInDepositSecond = bankDepositSecond
            .divide(new BigDecimal(100), 2, RoundingMode.HALF_UP)
            .multiply(percentRate2Second);
        } else {
            allPercentInDepositSecond = bankDepositSecond
            .divide(new BigDecimal(100), 2, RoundingMode.HALF_UP)
            .multiply(percentOverThreeHundredThousandSecond);
        }

        BigDecimal totalDepositAmountSecond = bankDepositSecond
                .add(allPercentInDepositSecond).setScale(2, RoundingMode.HALF_UP);
        System.out.println("\nСумма вклада " + bankDepositSecond);
        System.out.println("Сумма начисленного % " + allPercentInDepositSecond);
        System.out.println("Итоговая сумма с % " + totalDepositAmountSecond);
    }
}