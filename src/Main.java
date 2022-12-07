import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО отрудника - " + fullName);
    }

    public static void task4() {
        System.out.println("Задача 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your name:");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }

    public static void task5() {
        System.out.println("Задача 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи температуру:");
        int t = scanner.nextInt();
        System.out.println("Температура воздуха сегодня: " + t + " градусов.");
    }

    public static void task6() {
        System.out.println("Задача 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи день:");
        String day = scanner.next();
        System.out.println("Введи месяц:");
        String  month = scanner.next();
        System.out.println("Введи день:");
        String year = scanner.next();
        System.out.println(day + ":" + month + ":" + year);
    }

    public static void task7() {
        System.out.println("Задача7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи имя:");
        String name = scanner.nextLine();
        System.out.println("Введи имя помощника:");
        String helpName = scanner.nextLine();
        System.out.println("Введи количество сообщений:");
        int message = scanner.nextInt();
        System.out.println("Привет, " + name + "! Это твой помощник " + helpName + ".");
        System.out.println("У тебя " + message + " новых писем.");
    }
}