// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1() {
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
    public static void task2() {
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
    public static void task3() {
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }
    public static void task4() {
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }
    public static void task5() {
        System.out.println("Задание 5");
        for (int year = 1904; year <= 2096; year = year + 4) { // 1904 год - високосный.
            System.out.println(year + " год является високосным.");
        }
    }
    public static void task6() {
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " "); // Вывод в строку для удобства чтения.
        }
    }
    public static void task7() {
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i = i * 2 ) {
            System.out.print(i + " "); // Вывод в строку для удобства чтения.
        }
    }
    public static void task8() {
        System.out.println("Задание 8");
        int accumulation = 0; // переменная, отвечающая за сумму накоплений.
        int accumulatiuonPerMounth = 29000; // каждый месяц откладываем эту сумму.
        for (int i = 1; i <= 12; i++) {
            accumulation = accumulation + accumulatiuonPerMounth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + accumulation + " рублей.");
        }
    }
    public static void task9() {
        System.out.println("Задание 9");
        int accumulation = 0; // переменная, отвечающая за сумму накоплений.
        int accumulatiuonPerMounth = 29000; // каждый месяц откладываем эту сумму.
        for (int i = 1; i <= 12; i++) {
            accumulation = (int) ((accumulation + accumulatiuonPerMounth) * 1.01); // По 1 проценту ежемесячно от текущей суммы. Для простоты учета переведем в тип integer
            System.out.println("Месяц " + i + ", сумма накоплений равна " + accumulation + " рублей.");
        }
    }
    public static void task10() {
        System.out.println("Задание 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}