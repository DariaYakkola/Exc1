package Homework.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            stringEntry();
        } catch (RuntimeException e) {
            System.out.println("Пустые строки вводить нельзя!");
        }
    }

    /**
     * @throws RuntimeException ошибка при вводе пользователем пустой строки
     * @apiNote метод запрашивает у пользователя строку и выводит строку на экран
     */
    static void stringEntry() throws RuntimeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String message = sc.nextLine();
        if (message.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        } else {
            System.out.println("Вы ввели: " + message);
        }
    }
}
