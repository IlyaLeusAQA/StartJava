public class GuessNumber {
    public static void main(String[] args) {
        int hiddenNumber = 0;
        int playerNumber = 44;

        while (playerNumber != hiddenNumber) {
            if (playerNumber < hiddenNumber) {
                System.out.println(playerNumber + " больше того, что загадал компьютер");
                playerNumber++;
            } else {
                System.out.println(playerNumber + " меньше того, что загадал компьютер");
                playerNumber--;
            }
        }
        System.out.println("Вы победили!");
    }
}