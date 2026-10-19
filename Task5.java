import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        double[] params=new double[2];

        while (choice!=4) {
            System.out.println("1 - Выполнить расчет");
            System.out.println("2 - Информация о программе");
            System.out.println("3 - Информация о разработчике");
            System.out.println("4 - Выход");
            System.out.print("Выберите пункт: ");
            choice=sc.nextInt();

            if (choice==1) {
                input(sc, params);
                if (check(params)) {
                    double e=calculate(params);
                    output(e);
                } else {
                    System.out.println("Ошибка: данные некорректны");
                }
            } else if (choice==2) {
                System.out.println("Программа вычисляет кинетическую энергию тела");
            } else if (choice==3) {
                System.out.println("Разработчик: студент 2 курса");
            } else if (choice==4) {
                System.out.println("Выход");
            } else {
                System.out.println("Неверный пункт меню");
