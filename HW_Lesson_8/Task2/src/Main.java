import java.util.Scanner;

public class Main {

    static int getNumber(Scanner sc){ //Метод для получения числа игроков
        int a;
        try {
            a = sc.nextInt();
        }
        catch (java.util.InputMismatchException e) { //Введены данные не типа int. Пользователь не прочитал условие ,программа обиделась и решила закончить свою работу
            System.out.println("Uncorrect data");
            System.out.println("Программа закончила свою работу");
            System.exit(0);
            return 0;
        }

        return a;
    }

    public static void main(String[] args) {
        int numOfPlayers;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество игроков");

        numOfPlayers = getNumber(sc);
        while(numOfPlayers<1){
            System.out.println("К сожалению такого количества игроков быть не может, попробуйте еще раз: ");
            numOfPlayers = getNumber(sc);
        }

        RandomNumberGame randomNumberGame1 = new RandomNumberGame(numOfPlayers);
        randomNumberGame1.gamePlay();



    }
}
