import java.util.Scanner;

public class RandomNumberGame {
    private String enterFromUser;
    private int randomNumber;
    private int userNumber;
    private int numOfPlayers;
    private boolean isEndOfGame = false;

    public RandomNumberGame() { //По умолчанию 1 игрок
        numOfPlayers = 1;
    }

    public RandomNumberGame(int numOfPlayers) { //Конструктор для определения количества игроков
        this.numOfPlayers = numOfPlayers;
    }

    private void setRandomNumber() {//Определение рандомного числа
        randomNumber = (int) (Math.random() * 10);
    }

    private boolean isOneNumber() { // Контроль того, что введенное игроком нечто, является числом от 0 до 9
        return enterFromUser.matches("\\d");
    }

    private void stringToNumber() { //Перевод введенного значения в число
        userNumber = Integer.parseInt(enterFromUser);
    }

    private void getEnterFromUser() { //Для избежания ошибок, введенного игроком строка некая
        Scanner sc = new Scanner(System.in);
        enterFromUser = sc.nextLine();
    }

    public void gamePlay() {
        System.out.println("Поиграем в игру:)");

        System.out.println("Компьютер загадывает число от 0 до 9");
        setRandomNumber();
        //System.out.println(randomNumber);
        System.out.println("Попробуй угадать, число, которое загадал компьютер");
        for(int i = 1; isEndOfGame != true; i++) {//цикл для раундов
            for(int j = 1; j <= numOfPlayers; j++) { // цикл учета игроков
                System.out.println(" Выбор игрока " + j + ":");
                getEnterFromUser();
                if(isOneNumber()) {//Контроль введенного игроком
                    stringToNumber();
                    if(userNumber == randomNumber) {//Ты мега молодец)
                        System.out.println(" Игрок " + j + " победил!!! Поздравляем");
                        isEndOfGame = true;
                        break;
                    }
                    else
                        System.out.println("Постарайся еще раз");
                }
                else//значение, введенное игроком, что-то, но не число 0-9
                    System.out.println("Некоректные введенные данные. Попробуй еще раз в другом раунде");

            }
        }

    }

}


