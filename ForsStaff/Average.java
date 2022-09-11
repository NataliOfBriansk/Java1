package ForsStaff;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите меньшее число: ");
        int min = scanner.nextInt();

        System.out.print("Введите большее число: ");
        int max = scanner.nextInt();

        int i = 0;
        int j = 0;
        int k = min;
        int sum = 0;
        int sumEven = 0;

        do {
            sum = sum + k;
            ++i;
            if (k % 2 == 0) {
                ++j;
                sumEven = sumEven + k;
            }
            ++k;
        } while (!(k > max));

        System.out.println("Среднее арифметическое чисел в интервале от " + min + " до " + max + " составляет " + (double) sum / i);
        System.out.println("Среднее арифметическое четных чисел в интервале от " + min + " до " + max + " составляет " + (double) sumEven / j);
    }
}