import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class contacts {
   public static String[][] contact;
   public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Напишите Help для отображения всех команд");
        int A = 0;

        while (true) {
            System.out.println("Введите команду");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("Help")){
               Help();
            }
            if (command.equalsIgnoreCase("New")) {
                A++;
                contact = new String[A][2];
                System.out.println("Введите номер");
                String number = scanner.nextLine();
                System.out.println("Введите Имя");
                String name = scanner.nextLine();
                contact[A-1][0] = number;
                contact[A-1][1] = name;
                System.out.println(Arrays.toString(contact[A-1]));
            }
            if (command.equalsIgnoreCase("Search")) {
                Search();
            }
            if (command.equalsIgnoreCase("Exit")) {
                System.out.println("Всего контактов " + A);
                return;
            }
        }
    }
    public static void Help(){
        System.out.println("1. New - создать новый контакт");
        System.out.println("2. Exit - закрыть программу");
    }
    public static void Search(){
        System.out.println("Введите искомое имя");
        String search = scanner.nextLine();
        System.out.println(Arrays.asList(contact).contains(search));


    }
}





