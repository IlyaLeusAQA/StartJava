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
        int discount = 11;
        double basePrice = penPrice + bookPrice;
        double discountAmount = basePrice / 100 * discount;
        double discountPrice = basePrice - discountAmount;

        System.out.println("\nCтоимость товаров без скидки " + basePrice);
        System.out.println("Сумма скидки " + discountAmount);
        System.out.println("Стоимость товаров со скидкой " + discountPrice);

        System.out.println("\n3.Вывод слова JAVA");

        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");

        byte maxByteValue = 127;
        System.out.println("\nByte " + maxByteValue);
        System.out.println("Byte increment " + ++maxByteValue);
        System.out.println("Byte decrement " + --maxByteValue);

        short maxShortValue = 32767;
        System.out.println("\nShort " + maxShortValue);
        System.out.println("Short increment " + ++maxShortValue);
        System.out.println("Short decrement " + --maxShortValue);

        int maxIntValue = 2147483647;
        System.out.println("\nInt " + maxIntValue);
        System.out.println("Int increment " + ++maxIntValue);
        System.out.println("Int decrement " + --maxIntValue);
        
        long maxLongValue = 9223372036854775807L;
        System.out.println("\nLong " + maxLongValue);
        System.out.println("Long increment " + ++maxLongValue);
        System.out.println("Long decrement " + --maxLongValue);

        char maxCharValue = 65535;
        System.out.println("\nChar " + (int) maxCharValue);
        maxCharValue++;
        System.out.println("Char increment " + (int) maxCharValue);
        maxCharValue--;
        System.out.println("Char decrement " + (int) maxCharValue);

        System.out.println("\n5.Перестановка значений переменных");

        int originNum1 = 2;
        int originNum2 = 5;

        System.out.println("\nСпособ 1: С помощью третьей переменной");
        System.out.println("Исходные значения: a = " + originNum1 + ", b = " + originNum2);

        int temp = originNum1;
        originNum1 = originNum2;
        originNum2 = temp;

        System.out.println("Новые значения: a = " + originNum1 + ", b = " + originNum2);
        System.out.println("\nСпособ 2: С помощью арифметических операций");
        System.out.println("Исходные значения: a = " + originNum1 + ", b = " + originNum2);

        originNum1 = originNum1 + originNum2;
        originNum2 = originNum1 - originNum2;
        originNum1 = originNum1 - originNum2;

        System.out.println("Новые значения: a = " + originNum1 + ", b = " + originNum2);
        System.out.println("\nСпособ 3: С помощью побитовой операции ^");
        System.out.println("Исходные значения: a = " + originNum1 + ", b = " + originNum2);

        originNum1 = originNum1 ^ originNum2;
        originNum2 = originNum1 ^ originNum2;
        originNum1 = originNum1 ^ originNum2;

        System.out.println("Новые значения: a = " + originNum1 + ", b = " + originNum2);

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

        String slash = "/";
        String backSlash = "\\";
        String quote = "_";
        String open = "(";
        String close = ")";

        System.out.println("\n    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + quote + open + " " + close + backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + quote + quote + quote + quote +
                         slash + backSlash + quote + quote + backSlash);

        System.out.println("\n8.Манипуляции с сотнями, десятками и единицами числа");

        int someNum = 123;
        int hundreds = someNum / 100;
        int tens = (someNum / 10) % 10;
        int ones = someNum % 10;
        int digitsSum = hundreds + tens + ones;
        int digitsMultiply = hundreds * tens * ones;

        System.out.println("\nЧисло " + someNum + " содержит:");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + ones);
        System.out.println("Сумма разрядов = " + digitsSum);
        System.out.println("Произведение разрядов = " + digitsMultiply);

        System.out.println("\n9.Перевод секунд в часы, минуты и секунды");

        int allSeconds = 86399;
        int hh = allSeconds / 3600;
        int mm = ((allSeconds - (hh * 3600)) / 60);
        int ss = allSeconds % 60;

        System.out.println("\n" + hh + ":" + mm + ":" + ss);

        System.out.println("\n10.*Расчет стоимости товара со скидкой");

        BigDecimal penPriceBd = new BigDecimal(105.5);
        BigDecimal bookPriceBd = new BigDecimal(235.83);
        BigDecimal discountBd = BigDecimal.valueOf(11);
        BigDecimal basePriceBd = penPriceBd.add(bookPriceBd)
                .setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountAmountBd = basePriceBd.divide(BigDecimal.valueOf(100))
                .multiply(discountBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountPriceBd = basePriceBd.subtract(discountAmountBd)
                .setScale(2, RoundingMode.HALF_UP);

        System.out.println("\nCтоимость товаров без скидки " + basePriceBd);
        System.out.println("Сумма скидки " + discountAmountBd);
        System.out.println("Стоимость товаров со скидкой " + discountPriceBd);
    }
}










