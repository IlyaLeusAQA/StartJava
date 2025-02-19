public class GuessNumber {
    public static void main(String[] args) {
        int hiddenNumber = 0;
        int userNumber = 44;

        while (userNumber != hiddenNumber) {
            if (userNumber < hiddenNumber) {
                System.out.println(userNumber + " больше того, что загадал компьютер");
                userNumber++;
            } else {
                System.out.println(userNumber + " меньше того, что загадал компьютер");
                userNumber--;
            }
        }
        System.out.println("Вы победили!");
    }
}