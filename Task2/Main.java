package Homework.Task2;

public class Main {
    public static void main(String[] args) {
        int d = 8;
        if (d == 0) {
            System.out.println("На 0 делить нельзя! ");
        } else {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            double catchedRes1 = array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
    }
}
