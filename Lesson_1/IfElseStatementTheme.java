import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Перевод псевдокода на язык Java");

        boolean gender = true;
        int age = 15;
        double height = 2.0;

        if (!gender) {
            System.out.println("\nЖенщина");
        } else {
            System.out.println("\nМужчина");
        }

        if (age > 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }

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
        } else if ((randomNumber % 2 == 0) && (randomNumber > 0)) {
            System.out.println(randomNumber + " является положительным и четным");
        } else if ((randomNumber % 2 == 0) && (randomNumber < 0)) {
            System.out.println(randomNumber + " является отрицательным и четным ");
        } else if ((randomNumber % 2 == 1) && (randomNumber > 0)) {
            System.out.println(randomNumber + " является положительным и нечетным ");
        } else {
            System.out.println(randomNumber + " является отрицательным и нечетным ");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");

        int firstReferenceValue = 123;
        int secondReferenceValue = 223;
        int firstReferenceValueHundreds = (firstReferenceValue / 100);
        int firstReferenceValueTens = (firstReferenceValue / 10) % 10;
        int firstReferenceValueUnits = (firstReferenceValue % 10);
        int secondReferenceValueHundreds = (secondReferenceValue / 100);
        int secondReferenceValueTens = (secondReferenceValue / 10) % 10;
        int secondReferenceValueUnits = (secondReferenceValue % 10);
        boolean hasMathes = false;

        if (firstReferenceValueHundreds == secondReferenceValueHundreds) {
            hasMathes = true;
        }
        if (firstReferenceValueTens == secondReferenceValueTens) {
            hasMathes = true;
        }
        if (firstReferenceValueUnits == secondReferenceValueUnits) {
            hasMathes = true;
        }

        if (!hasMathes) {
            System.out.println("Совпадения отсутствуют");
        }

        System.out.println("\nИсходные числа:");
        System.out.println("Первое число: " + firstReferenceValue);
        System.out.println("Второе число: " + secondReferenceValue);
        System.out.println("\nСовпадающие цифры:");

        if (firstReferenceValueHundreds == secondReferenceValueHundreds) {
            System.out.println("- Сотни: " + firstReferenceValueHundreds);
        }
        
        if (firstReferenceValueTens == secondReferenceValueTens) {
            System.out.println("- Десятки: " + firstReferenceValueTens);
        }
        
        if (firstReferenceValueUnits == secondReferenceValueUnits) {
            System.out.println("- Единицы: " + firstReferenceValueUnits);
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
        int percentLessThanHundredThousand = 5;
        int percentInRangeHundredThousandAndThreeHundredThousand = 7;
        int percentOverThreeHundredThousand = 10;
        double allPercentInDeposit = 0;

        if (bankDeposit < 100000) {
            allPercentInDeposit = bankDeposit / 100 * percentLessThanHundredThousand;
        } else if ((bankDeposit >= 100000) && (bankDeposit <= 300000)) {
            allPercentInDeposit = bankDeposit / 100 * percentInRangeHundredThousandAndThreeHundredThousand;
        } else {
            allPercentInDeposit = bankDeposit / 100 * percentOverThreeHundredThousand;
        }

        double totalDepositAmount = bankDeposit + allPercentInDeposit;
        System.out.println("\nСумма вклада " + bankDeposit);
        System.out.println("Сумма начисленного % " + allPercentInDeposit);
        System.out.println("Итоговая сумма с % " + totalDepositAmount);

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
        BigDecimal percentLessThanHundredThousandSecond = new BigDecimal(5);
        BigDecimal percentInRangeHundredThousandAndThreeHundredThousandSecond = new BigDecimal(7);
        BigDecimal percentOverThreeHundredThousandSecond = new BigDecimal(10);
        BigDecimal allPercentInDepositSecond = new BigDecimal(0);

        if (bankDepositSecond.intValue() < 100000) {
            allPercentInDepositSecond = bankDepositSecond
            .divide(new BigDecimal(100), 2, RoundingMode.HALF_UP)
            .multiply(percentLessThanHundredThousandSecond);
        } else if ((bankDepositSecond.intValue() >= 100000) && (bankDepositSecond.intValue() <= 300000)) {
            allPercentInDepositSecond = bankDepositSecond
            .divide(new BigDecimal(100), 2, RoundingMode.HALF_UP)
            .multiply(percentInRangeHundredThousandAndThreeHundredThousandSecond);
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








