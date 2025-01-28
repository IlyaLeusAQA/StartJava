import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1.Вывод характеристик компьютера");

        byte cpuCore = 6;
        short cpuThread = 12;
        int ram = 64;
        long hddSpead = 7200; 
        float cpuFrequency = 4.2f;
        double graphicsMemory = 8048;
        char logo = 'i'; 
        boolean isPcAlive = true;

        System.out.println("\nКоличество ядер - " + cpuCore);
        System.out.println("Количество потоков - " + cpuThread);
        System.out.println("Объем оперативной памяти - " + ram);
        System.out.println("Скорость чтения жесткого диска - " + hddSpead);
        System.out.println("Тактовая частота процессора - " + cpuFrequency);
        System.out.println("Объем видеопамяти - " + graphicsMemory);
        System.out.println("Логотип - " + logo);
        System.out.println("Жив ли персональный компьютер? - " + isPcAlive);

        System.out.println("\n2.Расчет стоимости товара со скидкой");

        double penPrice = 105.5;
        double bookPrice = 235.83;
        int sale = 11;
        double sumGoods = penPrice + bookPrice;
        double discountAmount = sumGoods / 100 * sale;
        double discountPrice = sumGoods - discountAmount;

        System.out.println("\nCтоимость товаров без скидки " + sumGoods);
        System.out.println("Сумма скидки " + discountAmount);
        System.out.println("Стоимость товаров со скидкой " + discountPrice);

        System.out.println("\n3.Вывод слова JAVA");

        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");

        byte valueOne = 127;
        short valueTwo = 32767;
        int valueThree = 2147483647;
        long valueFour = 9223372036854775807L; 
        char valueFive = 65535; 

        System.out.println("\nByte " + valueOne);
        System.out.println("Byte increment " + ++valueOne);
        System.out.println("Byte decrement " + --valueOne);

        System.out.println("\nShort " + valueTwo);
        System.out.println("Short increment " + ++valueTwo);
        System.out.println("Short decrement " + --valueTwo);

        System.out.println("\nInt " + valueThree);
        System.out.println("Int increment " + ++valueThree);
        System.out.println("Int decrement " + --valueThree);
        
        System.out.println("\nLong " + valueFour);
        System.out.println("Long increment " + ++valueFour);
        System.out.println("Long decrement " + --valueFour);

        System.out.println("\nChar " + valueFive);
        System.out.println("Char increment " + ++valueFive);
        System.out.println("Char decrement " + --valueFive);

        System.out.println("\n5.Перестановка значений переменных");

        int originNum = 2;
        int originNumTwo = 5;

        System.out.println("\nСпособ 1: С помощью третьей переменной");
        System.out.println("Исходные значения: a = " + originNum + ", b = " + originNumTwo);

        int temp = originNum;
        originNum = originNumTwo;
        originNumTwo = temp;

        System.out.println("Новые значения: a = " + originNum + ", b = " + originNumTwo);
        System.out.println("\nСпособ 2: С помощью арифметических операций");
        System.out.println("Исходные значения: a = " + originNum + ", b = " + originNumTwo);

        originNum = originNum + originNumTwo;
        originNumTwo = originNum - originNumTwo;
        originNum = originNum - originNumTwo;

        System.out.println("Новые значения: a = " + originNum + ", b = " + originNumTwo);
        System.out.println("\nСпособ 3: С помощью побитовой операции ^");
        System.out.println("Исходные значения: a = " + originNum + ", b = " + originNumTwo);

        originNum = originNum ^ originNumTwo;
        originNumTwo = originNum ^ originNumTwo;
        originNum = originNum ^ originNumTwo;

        System.out.println("Новые значения: a = " + originNum + ", b = " + originNumTwo);

        System.out.println("\n6.Вывод символов и их кодов");

        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char caret = '^';
        char tilde = '~';

        System.out.println("\n" + (int) dollar);
        System.out.println(dollar);
        
        System.out.println((int) asterisk);
        System.out.println(asterisk);
        
        System.out.println((int) atSign);
        System.out.println(atSign);
        
        System.out.println((int) caret);
        System.out.println(caret);
        
        System.out.println((int) tilde);
        System.out.println(tilde);
        
        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");

        String a = "/";
        String b = "\\";
        String c = "_";
        String d = "(";
        String e = ")";

        System.out.println("\n    " + a + b + "  ");
        System.out.println("   " + a + "  " + b + "");
        System.out.println("  " + a + c + d + " " + e + b + "");
        System.out.println(" " + a + "      " + b + "  ");
        System.out.println("" + a + c + c + c + c + a + b + c + c + b);

        System.out.println("\n8.Манипуляции с сотнями, десятками и единицами числа");

        int someNumber = 123;
        int hundreds = someNumber / 100;
        int tens = (someNumber / 10) % 10;
        int units = someNumber % 10;
        int totalDigits = hundreds + tens + units;
        int multiplyDigits = hundreds * tens * units;

        System.out.println("\nЧисло " + someNumber + " содержит:");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + tens);
        System.out.println("Сумма разрядов = " + totalDigits);
        System.out.println("Произведение разрядов = " + multiplyDigits);

        System.out.println("\n9.Перевод секунд в часы, минуты и секунды");

        int allSeconds = 86399;
        int hours = allSeconds / 3600;
        int secondsLeft = allSeconds % 3600;
        int minutes = secondsLeft / 60;
        int seconds = secondsLeft % 60;

        System.out.println("\n" + hours + ":" + minutes + ":" + seconds);

        System.out.println("\n10.*Расчет стоимости товара со скидкой");

        BigDecimal takePenPrice = new BigDecimal(105.5);
        BigDecimal takeBookPrice = new BigDecimal(235.83);
        BigDecimal takeSale = new BigDecimal(11);
        BigDecimal takeSumGoods = takePenPrice.add(takeBookPrice)
                .setScale(2, RoundingMode.HALF_UP);
        BigDecimal takeDiscountAmount = takeSumGoods.divide(new BigDecimal(100))
                .multiply(takeSale).setScale(2, RoundingMode.HALF_UP);
        BigDecimal takeDiscountPrice = takeSumGoods.subtract(takeDiscountAmount)
                .setScale(2, RoundingMode.HALF_UP);

        System.out.println("\nCтоимость товаров без скидки " + takeSumGoods);
        System.out.println("Сумма скидки " + takeDiscountAmount);
        System.out.println("Стоимость товаров со скидкой " + takeDiscountPrice);
    }
}










