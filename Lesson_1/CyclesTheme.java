public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Подсчет суммы четных и нечетных чисел");

        int even = 0;
        int odd = 0;
        int someStartNumber = -10;
        int someEndNumber = 21;

        do {
            if (someStartNumber % 2 == 0) {
                odd += someStartNumber;
            } else {
                even += someStartNumber;
            }
            someStartNumber++;
        } while (someStartNumber <= someEndNumber);

        System.out.println("\nВ отрезке [-" + someStartNumber + "," + someEndNumber + 
                "] сумма четных чисел = " + odd + ", а нечетных = " + even);

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
        System.out.println();

        System.out.println("\n3.Вывод реверсивного числа и суммы его цифр");

        int someNumber = 1234;
        int sumOfSomeNumber = 0;

        while (someNumber > 0) {
            int digit = someNumber % 10;
            sumOfSomeNumber += digit;
            System.out.print(digit + " ");
            someNumber /= 10;
        }

        System.out.println("\nСумма цифр: " + sumOfSomeNumber);

        System.out.println("\n4.Вывод чисел в несколько строк");

        int startNumber = 1;
        int endNumber = 30;
        int countInRow = 0;

        for (int i = startNumber; i < endNumber; i++) {
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
            for (int j = countInRow; j < 5; j++) {
                System.out.printf("%3d ", 0);
            }
            System.out.println();
        }

        System.out.println("\n5.Проверка количества двоек числа на четность/нечетность");

        int originalNumber = 3242592;
        int countTwo = 0;
        int time = 0;

        while (originalNumber > 0) {
            int i = originalNumber % 10;
            if (i == 2) {
                time++;
            }
            originalNumber /= 10;
        }
        if (time % 2 == 0) {
            System.out.println("\nВ " + originalNumber + " четное (" + time + ") количество двоек");
        } else {
            System.out.println("\nВ " + originalNumber + " нечетное (" + time + ") количество двоек");
        }

        System.out.println("\n6.Вывод геометрических фигур");

        int sideRectangle = 50;

        for (int i = 1; i <= sideRectangle; i++) {
            int count = i;
            System.out.printf("%s", "*");
            if (count % 10 == 0) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println();

        int sideRectangularTriangle = 5;
        
        while (sideRectangularTriangle > 0) { 
            int countCycle = sideRectangularTriangle;  
            while (countCycle > 0) {
                System.out.printf("%s", "#");
                countCycle--;
            }
            System.out.println();
            sideRectangularTriangle--;
        }
        System.out.println();

        int height = 3; 
        int step = 1;

        do {
            int stepInCycle = 1;

            do {
                if (stepInCycle <= step) {
                    System.out.print("$");
                }
                stepInCycle++;
            } while (stepInCycle <= step);

            System.out.println();
            step++;
        } while (step <= height);
 
        step = height - 1; 
        do {
            int stepInCycle = 1;

            do {
                if (stepInCycle <= step) {
                    System.out.print("$");
                }
                stepInCycle++;
            } while (stepInCycle <= step);

            System.out.println();
            step--;
        } while (step >= 1);

        System.out.println("\n7.Вывод ASCII-символов");

        System.out.printf("%-10s %-10s %-40s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        for (int i = 33; i <= 122; i += 2) {
            if ((i >= 33 && i < 48) || (i >= 98 && i <= 122)) {
                char character = (char) i;
                String description = "          " + Character.getName(i);
                System.out.printf("%5d %10c %-40s%n", i, character, description);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");

        int randomNumber = 1234321;
        int copyRandomNumber = randomNumber;
        int reversedNumber = 0;

        while (randomNumber > 0) {
            int lastDigit = randomNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            randomNumber /= 10;
        }

        if (copyRandomNumber == reversedNumber) {
            System.out.printf("Число %d - палиндром\n", copyRandomNumber);
        } else {
            System.out.printf("Число %d - не палиндром", copyRandomNumber);
        }

        System.out.println("\n9. Проверка, является ли число счастливым");

        int originNumber1 = 123321;
        int copyOriginNumber1 = originNumber1;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        for (int i = 0; i < 6; i++) {
            int digit = originNumber1 % 10;
            originNumber1 /= 10;

            if (i < 3) {
                sumSecondHalf += digit;
            } else {
                sumFirstHalf += digit;
            }
        }

        String result = (sumFirstHalf == sumSecondHalf) ? "счастливое" : "не счастливое";
        System.out.printf("Число %d - %s\n", copyOriginNumber1, result);

        System.out.printf("Сумма цифр %d = %d\n", copyOriginNumber1 / 1000, sumFirstHalf);
        System.out.printf("Сумма %d = %d\n", copyOriginNumber1 % 1000, sumSecondHalf);

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
    





