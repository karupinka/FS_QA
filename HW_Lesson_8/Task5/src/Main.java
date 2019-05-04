import java.util.Scanner;

public class Main {


    static int getNumber(Scanner sc){ //Метод для получения границы диапазона
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
        int a;
        int b;
        int counter = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Хотите посчитать сколько чисел в вашем диапазоне делятся на 12? Программа вам поможет");
        System.out.println("Введите начало диапазона: ");
        a = getNumber(sc);
        System.out.println("Введите конец диапазона: ");
        b = getNumber(sc);
        if(a > b){ // ПРи ошибке пользователя, если он перепутал конец и начало , поменяем их местами
            int tmp;
            tmp = a;
            a = b;
            b = tmp;
        }

        for(int i = a; i <= b; i ++){
            if((i%12)==0)
                counter++;
        }

        System.out.println("В вашем диапазоне " + counter + "  чисел делятся на 12");

    }
}
