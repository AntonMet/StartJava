class CyclesTheme {
    public static void main(String [] args) {
        //Подсчет суммы четных и нечетных чисел
        System.out.println("Подсчет суммы четных и нечетных чисел");
        int a;
        int even = 0;
        int odd = 0;
        for(a = -10; a < 22; a++) {
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
        for(i = min + 1; i < max; i++) {
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
                System.out.println();
            }
        }
        for(; b % 5 != 0; b++) {
            System.out.printf("%4d", 0);
        }
        System.out.println();

        //Проверка количества единиц на четность
        a = 3141591;
        b = 0;
        while (a > 9) {
            if (a % 10 == 1) {
                b++;
            }
            a = a / 10;
        }
        if(b % 2 == 0) {
            System.out.println ("Количество единиц четное: " + b);
        } else {
            System.out.println ("Количество единиц нечетное: " + b);
        }

        //Отображение фигур в консоли
        for(a = 0; a < 5; a++) {
            for(b = 0; b < 10; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        a = 0;
        b = 0;
        c = 5;
        while (b < 5) {
            while (a < c) {
                a++;
                System.out.print("#");
            }
            System.out.println();
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
            System.out.println();
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
            System.out.println();
        } while (b < 2);
        System.out.println();

        //Отображение ASCII-символов
        for(a = 0; a < 128; a++) {
            if (a % 2 != 0) {
                System.out.println((char) a);
            }
        }

        //Проверка, является ли число палиндромом
        a = 12321;
    }
}