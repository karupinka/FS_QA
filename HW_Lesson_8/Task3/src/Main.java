import java.util.Scanner;

public class Main {

    static void showArray(int[][] arr){
        System.out.println("Ваша матрица: ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int size;
        int[][] arr;
        System.out.println("Введите размер квадратной матрицы");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        arr = new int[size][size];


        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                arr[i][j] = (int)(Math.random()*100);
            }
        }

       showArray(arr);

        System.out.println("Видно завелся какой-то вирус и перепутал значения в Вашей матрице");

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){

                if(i==j); //Число само с сабой нечего менять
                else if(j<i);//Для исключенияповторной замены замененных чисел
                else {
                    arr[i][j] += arr[j][i];
                    arr[j][i] = arr[i][j] - arr[j][i];
                    arr[i][j] -= arr[j][i];
                }
            }
        }

        showArray(arr);
    }
}
