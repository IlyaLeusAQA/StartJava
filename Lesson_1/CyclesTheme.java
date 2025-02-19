public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел");

        int sumEvenNumber = 0;
        int sumOddNumber = 0;
        int startSegment = -10;
        int endSegment = 21;
        int copystartSegment = startSegment;

        do {
            if (startSegment % 2 == 0) {
                sumOddNumber += startSegment;
            } else {
                sumEvenNumber += startSegment;
            }
            startSegment++;
        } while (startSegment <= endSegment);

        System.out.println("\nВ отрезке [" + copystartSegment + "," + endSegment + 
                "] сумма четных чисел = " + sumOddNumber + ", а нечетных = " + sumEvenNumber);

        System.out.println("\n2.Вывод чисел между min и max в порядке убывания");

        int number1 = -1;
        int number2 = 5;
        int number3 = 10;
        int min = number3;
        int max = number3;

        if (number1 < min) {
            min = number1;
        }
        if (number2 < min) {
            min = number2;
        }
        if (number1 > max) {
            max = number1;
        }
        if (number2 > max) {
            max = number2;
        }

        System.out.print("\nЧисла в интервале (" + min + ", " + max + ") в порядке убывания: ");

        for (int i = max - 1; i > min; i--) {
            System.out.print(i);
            if (i != min + 1) {
                System.out.print(", ");
            }
        }
        
        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");

        int originalNumber = 1234;
        int digitSum = 0;

        while (originalNumber > 0) {
            int digit = originalNumber % 10;
            digitSum += digit;
            System.out.print(digit + "");
            originalNumber /= 10;
        }

        System.out.println("\nСумма цифр: " + digitSum);

        System.out.println("\n4.Вывод чисел в несколько строк");

        startSegment = 1;
        endSegment = 30;
        int countInRow = 0;

        for (int i = startSegment; i < endSegment; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                countInRow++;
                if ((i + 1) % 5 == 0) {
                    System.out.println();
                    countInRow = 0;
                }
            }
        }
        if (countInRow > 0) {
            for (int i = countInRow; i < 5; i++) {
                System.out.printf("%3d ", 0);
            }
            System.out.println();
        }

        System.out.println("\n5.Проверка количества двоек числа на четность/нечетность");

        originalNumber = 3242592;
        int originalNumberCopy = originalNumber;
        int twoCount = 0;

        while (originalNumber > 0) {
            if (originalNumber % 10 == 2) {
                twoCount++;
            }
            originalNumber /= 10;
        }
        if (twoCount % 2 == 0) {
            System.out.println("\nВ " + originalNumberCopy + " четное (" + twoCount + ") количество двоек");
        } else {
            System.out.println("\nВ " + originalNumberCopy + " нечетное (" + twoCount + ") количество двоек");
        }

        System.out.println("\n6.Вывод геометрических фигур");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int lines = 5;

        while (lines > 0) {
            int count = lines;

            while (count > 0) {
                System.out.print("#");
                count--;
            }
            System.out.println();
            lines--;
        }
        System.out.println();

        lines = 5;
        int symbolNumber = 1;

        do {
            int symbolOut = symbolNumber;
            do {
                System.out.print("$");
                symbolOut--;
            } while (symbolOut > 0);
            lines--;
            if (lines < 3) {
                symbolNumber--;
            } else {
                symbolNumber++;
            }
            System.out.println();
        } while (lines > 0);

        System.out.println("\n7.Вывод ASCII-символов");

        System.out.printf("%-10s %-10s %-40s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        for (int i = 33; i <= 122; i += 2) {
            if ((i >= 33 && i < 48) || (i >= 98 && i <= 122)) {
                String description = "          " + Character.getName(i);
                System.out.printf("%5d %10c %-40s%n", i, (char) i, description);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");

        originalNumber = 1234321;
        int originNumberCopy = originalNumber;
        int reversedNumber = 0;

        while (originalNumber > 0) {
            int lastDigit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            originalNumber /= 10;
        }

        if (originNumberCopy == reversedNumber) {
            System.out.printf("Число %d - палиндром\n", originNumberCopy);
        } else {
            System.out.printf("Число %d - не палиндром", originNumberCopy);
        }

        System.out.println("\n9. Проверка, является ли число счастливым");

        originalNumber = 123321;
        originNumberCopy = originalNumber;
        int firstHalfSum = 0;
        int secondHalfSum = 0;

        for (int i = 0; i < 6; i++) {
            int digit = originalNumber % 10;
            originalNumber /= 10;

            if (i < 3) {
                secondHalfSum += digit;
            } else {
                firstHalfSum += digit;
            }
        }

        String result = (firstHalfSum == secondHalfSum) ? "счастливое" : "не счастливое";
        System.out.printf("Число %d - %s\n", originNumberCopy, result);

        System.out.printf("Сумма цифр %d = %d\n", originNumberCopy / 1000, firstHalfSum);
        System.out.printf("Сумма %d = %d\n", originNumberCopy % 1000, secondHalfSum);

        System.out.println();

        System.out.println("\n10. Отображение таблицы умножения Пифагора");

        System.out.println("     |  1  2  3  4  5  6  7  8  9");
        System.out.println("   ------------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%4d | ", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }
    }
}
    





