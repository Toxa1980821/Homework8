//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача № 1
        System.out.println("Задача № 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //Задача № 2
        System.out.println("Задача № 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //Задача № 3
        System.out.println("Задача № 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        //Задача № 4
        System.out.println("Задача № 4");
        for (int i = 10; i > -10; i--) {
            System.out.println(i);
        }
        //Задача № 5
        System.out.println("Задача № 5");
        for (int i = 1904; i < 2096; i += 4) {
            System.out.println(i + " год является високосным ");
        }
        //Задача № 6
        System.out.println("Задача № 6");
        for (int i = 7; i < 98; i += 7) {
            System.out.println(i);
        }
        //Задача № 7
        System.out.println("Задача № 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        //Задача № 8
        System.out.println("Задача № 8");
        int theAmount = 29000;
        int pot = 0;
        for (int i = 1; i <= 12; i++) {
            pot = theAmount + pot;
            System.out.println(" Месяц " + i + ", сумма накоплений равна " + pot);
        }
        //Задача № 9
        System.out.println("Задача № 9");
        int amount = 29000;
        int amountInBank = 0;
        for (int i = 1; i <= 12; i++) {
            amountInBank = amountInBank + amount / 100;
            amountInBank = amountInBank + amount;
            System.out.println(" Месяц " + i + ", сумма накоплений равна " + amountInBank);
        }
        //Задача № 10
        System.out.println("Задача № 10");
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + " = " + number * i);
        }


    }


}

