import java.util.Scanner;
/* данный класс создает зубчатый массив  и заполняет его значениями
 после чего высчитывает сумму всех строк и общую сумму
 */
public class array {
    int sum = 0;
    public static void main (String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int A = scanner.nextInt();
        int[][] Arr = new int[A][];

        for (int i = 0; i < A; i++) {
            System.out.println("Введите количество ячеек в строке " + (i + 1));
            int size = scanner.nextInt();
            Arr[i] = new int[size]; // создаем зубчатый массив
        }
        System.out.println("Количество строк = " + Arr.length);
        for (int i = 0; i < Arr.length; i++) {
            int sumcell = 0;
            System.out.println("Сумма ячеек в строке " + (i + 1));
            for (int n = 0; n < Arr[i].length; n++) {
                Arr[i][n] = i + n; // заполняем ячейки значениями
                sumcell = sumcell + Arr[i][n];// считаем сумму значений в ячейке
                if (n < (Arr[i].length - 1)) {
                    System.out.print(Arr[i][n] + "+"); // выводим на экран значение каждой ячеки и знак +
                }
                else {
                    System.out.print(Arr[i][n]);// если ячейка всего 1, то знак + не выводим на экран
                }
            }
            sum = sum + sumcell;
            System.out.println("=" + sumcell); // выводим на экран сумму ячеек определеной строки
            }
        System.out.println("Сумма всех ячеек = " + sum);
        System.out.println();

        }


    }

