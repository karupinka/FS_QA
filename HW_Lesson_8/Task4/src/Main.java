import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k=0;
        boolean isNumber = false;

        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<=90; i++) {
            stringBuilder.append((int) (Math.random() * 100 + 10));
        }
        System.out.println("Диапазон: \"" + stringBuilder + "\"");

        System.out.print("Введите число от 1 до 180: ");

        try {
                k = scanner.nextInt();
            }
        catch (java.util.InputMismatchException e) { //Введены данные не типа int. Пользователь не прочитал условие ,программа обиделась и решила закончить свою работу
                System.out.println("Uncorrect data");
                System.out.println("Программа закончила свою работу");
                System.exit(0);
            }


        if((k>0) && (k<=180)) {
            System.out.print("Цифра с этим индексом: ");
            System.out.print(stringBuilder.charAt(k - 1));
        }
        else
            System.out.print("Вы ищите что-то не то  (вне диапазона)");

    }
}
