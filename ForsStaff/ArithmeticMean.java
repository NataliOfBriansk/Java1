package ForsStaff;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите меньшее число: ");
        int min = scanner.nextInt();

        System.out.print("Введите большее число: ");
        int max = scanner.nextInt();

        int figure = min;
        int amount = 0;
        int amountEven = 0;
        int sum = 0;
        int sumEven = 0;
        double srAr = 0;

        do {
            sum = sum + figure;
            ++figure;
            ++amount;
            if (figure % 2 == 0) {
                ++amountEven;
                sumEven = sumEven + figure;
            }
        } while (!(figure > max));

        srAr = srAr + sum * 1.0 / amount;

        int srArEven = sumEven / amountEven;

        System.out.println("Среднее арифметическое чисел в интервале от " + min + " до " + max + " составляет " + srAr);
        System.out.println("Среднее арифметическое четных чисел в интервале от " + min + " до " + max + " составляет " + srArEven);
        }
    }