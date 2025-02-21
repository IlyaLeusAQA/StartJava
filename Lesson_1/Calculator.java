public class Calculator {
    public static void main(String[] args) {
        int operand1 = 2;
        int operand2 = 35;
        char operator = '^';
        int result = 0;

        if (operator == '+') {
            result = operand1 + operand2;
        } else if (operator == '-') {
            result = operand1 - operand2;
        } else if (operator == '*') {
            result = operand1 * operand2;
        } else if (operator == '/') {
            result = operand1 / operand2;
        } else if (operator == '%') {
            result = operand1 % operand2;
        } else {
            result = 1;
            for (int i = 0; i < operand2; i++) {
                result *= operand1;
            }
        }
        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
    }
}