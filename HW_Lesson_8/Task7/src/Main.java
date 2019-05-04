import java.util.Scanner;

public class Main {

    enum Seasons {
        WINTER, SPRING, SUMMER, AUTUMN;
    }

    static int getNumber(Scanner sc){ //Метод для получения границы диапазона
        int a;
        try {
            a = sc.nextInt();
        }
        catch (java.util.InputMismatchException e) { //Введены данные не типа int. Пользователь не прочитал условие ,программа обиделась и решила закончить свою работу
            System.out.println("Uncorrect data");
            return 0;
        }

        return a;
    }

    public static void main(String[] args) {
        int numOfMonth;

        Scanner sc = new Scanner(System.in);
        System.out.println("По номеру месяца я угадаю время года");
        System.out.println("Введите номер месяца: ");

        numOfMonth = getNumber(sc);




        switch(numOfMonth){
            case 1:;
            case 2:;
            case 12:
                System.out.println("Season is: " + Seasons.WINTER.name());
                break;
            case 3:;
            case 4:;
            case 5:
                System.out.println("Season is: " + Seasons.SPRING.name());
                break;
            case 6:;
            case 7:;
            case 8:
                System.out.println("Season is: " + Seasons.SUMMER.name());
                break;
            case 9:;
            case 10:;
            case 11:
                System.out.println("Season is: " + Seasons.AUTUMN.name());
                break;
             default:
                 System.out.println("Месяца с таким номером не существует");
        }
    }
}
