import java.util.Scanner;

public class Main {

    static int getNumber(Scanner sc){ //Получает число
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

    static boolean isSumma(int S){ //Существует ли сумма. Формула ввыведена из формулы Суммы арифметической прогресии. С последовательным поиском искомого значения через квадратное уравнение
        boolean isSum = false;
        int D = 1 + 8 * S;
        int sqrtD;
        sqrtD = (int)Math.sqrt(D);

        if((sqrtD*sqrtD) == D)
            isSum = true;
        return isSum;
    }

    static int getN(int number){ // Подсчитаное значение х1 из решения квадратного уравнения
        int n = 0;
        if(isSumma(number)){
            n = (-1 + ((int)(Math.sqrt((number*8+1)))))/ 2;
        }

        return n;
    }

    static void solutionText(int number){ //Вывод сообщения с результатом
        if(getN(number)>0)
            System.out.println("N = " + getN(number));
        else
            System.out.println("Такого числа n не существует" );
    }


    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число, а я посмотрю, явлется ли оно суммой последовательности \"1+2+3+...+n\"  посчитаю число n, если является:");

        number = getNumber(sc);

        solutionText(number);

    }
}
