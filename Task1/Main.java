package Homework.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        floatEntry();
    }

    /**
     * @apiNote Метод запрашивает у пользователя число и выводит это число в консоль,
     * если введено не число, то метод запускается повторно
     */
    static void floatEntry() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        String number = sc.nextLine();
        try {
            Float.parseFloat(number);
            System.out.println("Ваше число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число, попробуйте еще раз! ");
            floatEntry();
        }
    }
}