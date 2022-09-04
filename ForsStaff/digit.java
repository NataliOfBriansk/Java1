package ForsStaff;

import java.util.Scanner;

public class digit {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.print("Введите исследуемое целое число: ");
        int example = number.nextInt();

        String per = Integer.toString(example);
        int dlinaStr = per.length();
        int sum = 0;
        int sumChet = 0;
        int max = 0;
        int promZn = 0;

        while (dlinaStr >= 1){
            promZn = example % 10;
            sum = sum + promZn;
            if(promZn > max){
                max = promZn;
            }
            if(promZn % 2 != 0){
                sumChet = sumChet + promZn;
            }
            --dlinaStr;
            example = example / 10;
        }

        System.out.println("Сумма цифр вашего числа: " + sum);
        System.out.println("Сумма нечетных цифр вашего числа: " + sumChet);
        System.out.println("Максимальная цифра вашего числа: " + max);
    }
}
