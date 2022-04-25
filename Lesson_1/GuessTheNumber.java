class GuessTheNumber {
    public static void main(String[] args) {
        int hiddenNumber = 20;
        int playerNumber = 97;
        while (playerNumber != hiddenNumber) {
            if (playerNumber > hiddenNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                playerNumber /= 2;
            } else {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                playerNumber++;
            }
        }
        System.out.println("Вы победили!");
    }
}