package ForsStaff;

import java.util.Scanner;

public class MiniProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String middleName = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String familyName = scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age = Integer.parseInt(scanner.nextLine());

        Person person = new Person(name, middleName, familyName, age);
        person.setName("noName");
        person.setFamilyName("Piu-piu");

        System.out.println("В классе Person был создан объект " + person + " с годом рождения " + Person.getAgePerson(age));
    }

}
