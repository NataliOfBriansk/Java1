package ForsStaff;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Введите исследуемое целое число: ");
        int example = number.nextInt();

        int sum = 0;
        int max = 0;
        int sumEven = 0;

        while (example != 0) {
            int lastCharacter = example % 10;
            sum = sum + lastCharacter;
            if (lastCharacter > max) {
                max = lastCharacter;
            }
            if (lastCharacter % 2 != 0) {
                sumEven = sumEven + lastCharacter;
            }
            example = example / 10;
        }

        System.out.println("Сумма цифр вашего числа: " + sum);
        System.out.println("Сумма нечетных цифр вашего числа: " + sumEven);
        System.out.println("Максимальная цифра вашего числа: " + max);
    }
}
