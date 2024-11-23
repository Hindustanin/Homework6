//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

       for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        // Задача 2
        System.out.println();
        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        // Задача 3
        System.out.println();
        System.out.println("Задача 3");

        for (int i = 2; i <= 17; i = i + 2) {
            System.out.print(i + " ");
        }
        // Задача 4
        System.out.println();
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }

        // Задача 5
        System.out.println();
        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        // Задача 6
        System.out.println();
        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        // Задача 7
        System.out.println();
        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        // Задача 8
        System.out.println();
        System.out.println("Задача 8");

        int save = 29_000;
        int nakoplenia = 0;
        for (int i = 1; i <= 12; i++) {
            nakoplenia = nakoplenia + save;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + nakoplenia + " рублей");
        }
        // Задача 9
        System.out.println();
        System.out.println("Задача 9");

        nakoplenia = 0;
        for (int i = 1; i <= 12; i++) {
            nakoplenia = (nakoplenia + nakoplenia / 100) + save;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + nakoplenia + " рублей");
        }
        // Задача 10
        System.out.println();
        System.out.println("Задача 10");

        int mnogitel = 2;
        for (int i = 1; i <= 10; i++) {
            int proizved = mnogitel * i;
            System.out.println(mnogitel + "*" + i + "=" + proizved);
        }
    }
}