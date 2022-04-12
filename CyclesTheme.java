class CyclesTheme {
    public static void main(String [] args) {
        //Подсчет суммы четных и нечетных чисел
        System.out.println("Подсчет суммы четных и нечетных чисел");
        int a;
        int even = 0;
        int odd = 0;
        for (a = -10; a < 22; a++) {
            if (a % 2 == 0) {
                even = even + a;
            } else {
                odd = odd + a;
            }
        }
        System.out.println("Сумма четных: " + even + ". Сумма нечетных: " + odd + "\n");

        //Вывод чисел между max и min
        System.out.println("Вывод чисел между max и min");
        a = 10;
        int b = 5;
        int c = -1;
        int max = 0;
        int min = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }
        System.out.println("Числа между минимальным и максимальным:");
        int i;
        for (i = min + 1; i < max; i++) {
            System.out.println(i);
        }
        System.out.println();

        //Вывод реверсивного числа и суммы его цифр
        System.out.println("Вывод реверсивного числа и суммы его цифр");
        a = 1234;
        int sum = 0;
        do {
            b = a % 10;
            a = a / 10;
            sum = sum + b;
            System.out.print(b);
        } while (a > 9);
        sum = sum + a;
        System.out.println(a + "\n" + "Сумма цифр: " + sum + "\n");

        //Вывод чисел на консоль в несколько строк
        System.out.println("Вывод чисел на консоль в несколько строк");
        a = 1;
        b = 0;
        for (a = 1; a <= 24; a += 2) {
            System.out.printf("%4d", a);
            b++;
            if (b % 5 == 0) {
                System.out.println("");
            }
        }
        for (; b % 5 != 0; b++) {
            System.out.printf("%4d", 0);
        }
        System.out.println("");

        //Проверка количества единиц на четность
        System.out.println("Проверка количества единиц на четность");
        a = 3141591;
        b = 0;
        while (a > 9) {
            if (a % 10 == 1) {
                b++;
            }
            a = a / 10;
        }
        if (b % 2 == 0) {
            System.out.println ("Количество единиц четное: " + b + "\n");
        } else {
            System.out.println ("Количество единиц нечетное: " + b + "\n");
        }

        //Отображение фигур в консоли
        System.out.println("Отображение фигур в консоли");
        for (a = 0; a < 5; a++) {
            for (b = 0; b < 10; b++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        a = 0;
        b = 0;
        c = 5;
        while (b < 5) {
            while (a < c) {
                a++;
                System.out.print("#");
            }
            System.out.println("");
            a = 0;
            b++;
            c--;
        }
        a = 0;
        b = 0;
        c = 1;
        do {
            do {
                System.out.print("$");
                a++;
            } while (a < c);
            a = 0;
            b++;
            c++;
            System.out.println("");
        } while (b < 3);
        a = 0;
        b = 0;
        c = 2;
        do {
            do {
                System.out.print("$");
                a++;
            } while (a < c);
            a = 0;
            b++;
            c--;
            System.out.println("");
        } while (b < 2);
        System.out.println("");

        //Отображение ASCII-символов
        System.out.println("Отображение ASCII-символов");
        for (a = 0; a < 128; a++) {
            if (a % 2 != 0) {
                System.out.println((char) a);
            }
        }
        System.out.println("");

        //Проверка, является ли число палиндромом
        System.out.println("Проверка, является ли число палиндромом");
        a = 12321;
        if (a / 10000 == a % 10) {
            if ((a / 1000) % 10 == (a % 100) / 10) {
                System.out.println("число палиндром" + "\n");
            } else {
                System.out.println("число не палиндром" + "\n");
            }
        } else {
            System.out.println("число не палиндром" + "\n");
        }

        //Определение, является ли число счастливым
        System.out.println("Определение, является ли число счастливым");
        a = 325891;
        b = a / 1000;
        c = a % 1000;
        int firstSum = 0;
        int secondSum = 0;
        for (i = 0; i < 3; i++) {
            firstSum = firstSum + b % 10;
            b = b / 10;
        }
        for (i = 0; i < 3; i++) {
            secondSum = secondSum + c % 10;
            c = c / 10;
        }
        System.out.println(a / 1000 + " = " + firstSum);
        System.out.println(a % 1000 + " = " + secondSum + "\n");

        //Вывод таблицы умножения Пифагора
        System.out.println("Вывод таблицы умножения Пифагора");
        System.out.printf("%5s", "|");
        for (i = 2; i < 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (i = 1; i < 10; i++) {
            System.out.printf("%4s", "____");
        }
        System.out.println("");
        for (i = 2; i < 10; i++) {
            System.out.printf(i + "%4s", "|");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println("");
        }
    }
}