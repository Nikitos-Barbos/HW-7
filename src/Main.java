public class Main {
    public static void main(String[] args) {

        int salary = 65535;
        int total = 0;
        int i = 0;
        for (; total < 1_000_000; i++) {
            total = total + total / 100;
            total = total + salary;
            if (i % 5 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
        System.out.println(total);

        int start = 5;
        do {
            System.out.println(start);
            start = start - 1;
        }
        while (start > 0);

        System.out.println();
        System.out.println("Задание 1");

        int wholeАmount = 2_459_000;
        int totalSavings = 0;
        int money = 15000;
        int month = 0;
        while (totalSavings < wholeАmount) {
            month++;
            totalSavings = totalSavings + totalSavings / 100;
            totalSavings = totalSavings + money;
            System.out.println(("Месяц " + month + " ,сумма накоплений равна " + totalSavings + " рублей"));
        }

        System.out.println();
        System.out.println("Задание 2");

        int b = 0;
        while (b < 10) {
            b++;
            System.out.print(b + " ");
        }
        System.out.println();
        for (int c = 10; c > 0; c--) {
            System.out.print(c + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Задание 3");

        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * birthRate / 1000 - population * mortalityRate / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }


        System.out.println();
        System.out.println("Задание 4");

        int depositAmount = 15_000;
        int suma = 12_000_000;
        int months = 0;

        for (int tools = depositAmount; tools <= suma; tools += (tools * 0.07)) {
            months++;
            System.out.println("Месяц " + months + " текущая сумма " + tools);
        }

        System.out.println();
        System.out.println("Задание 5");
        ;

        for (int tools = depositAmount; tools <= suma; tools += (tools * 0.07)) {
            months++;
            if(months % 6 == 0)
            System.out.println("Месяц " + months + " текущая сумма " + tools);
        }






    }
}