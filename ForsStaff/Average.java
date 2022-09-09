package ForsStaff;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите меньшее число: ");
        int min = scanner.nextInt();

        System.out.print("Введите большее число: ");
        int max = scanner.nextInt();

        int amount = 0;
        int amountEven = 0;
        int sum = 0;
        int sumEven = 0;
        double average = 0;
        double averageEven = 0;

        do {
            sum = sum + min;
            ++amount;                         //количество чисел от min до max
            if (min % 2 == 0) {
                ++amountEven;                 //количество только четных чисел
                sumEven = sumEven + min;
            }
            ++min;                            //переходит к следующему числу
        } while (!(min > max));

        average = average + sum * 1.0 / amount;

        averageEven = sumEven * 1.0 / amountEven;

        System.out.println("Среднее арифметическое чисел в интервале от " + min + " до " + max + " составляет " + average);
        System.out.println("Среднее арифметическое четных чисел в интервале от " + min + " до " + max + " составляет " + averageEven);
    }
}