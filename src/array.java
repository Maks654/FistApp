import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int A = scanner.nextInt();
        int[][] Arr = new int[A][];

        for (int i = 0; i < A; i++) {
            System.out.println("Введите количество ячеек в строке " + (i + 1));
            int size = scanner.nextInt();
            Arr[i] = new int[size];
        }
        System.out.println(Arr.length);
        for (int i = 0; i < Arr.length; i++) {
            int sum = 0;
            for (int n = 0; n < Arr[i].length; n++) {
                Arr[i][n] = i + n;
                sum = sum + Arr[i][n];
                if (n < (Arr[i].length - 1)) {
                    System.out.print(Arr[i][n] + "+");
                }
                else {
                    System.out.print(Arr[i][n]);
                }
            }
                System.out.println("=" + sum);
            }
            System.out.println();
        /*Scanner scanner1 = new Scanner(System.in);
        int a = parseInt(scanner1.nextLine());
        System.out.println(a);*/
        }


    }

