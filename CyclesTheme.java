class CyclesTheme {
    public static void main(String[] args) {
        //Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = -10; i < 22; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Сумма четных: " + sumEven + ". Сумма нечетных: " + sumOdd + "\n");

        //Вывод чисел между max и min
        System.out.println("2. Вывод чисел между max и min");
        int a = 10;
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
        System.out.println("Числа между максимальным и минимальным:");
        for (int i = max - 1; i > min; i--) {
            System.out.println(i);
        }
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");

        //Вывод реверсивного числа и суммы его цифр
        a = 1234;
        int sum = 0;
        do {
            b = a % 10;
            a = a / 10;
            sum += b;
            System.out.print(b);
        } while (a > 9);
        sum += a;
        System.out.println(a + "\n" + "Сумма цифр: " + sum + "\n");

        //Вывод чисел на консоль в несколько строк
        System.out.println("4. Вывод чисел на консоль в несколько строк");
        a = 1;
        b = 0;
        for (a = 1; a <= 24; a += 2) {
            System.out.printf("%4d", a);
            b++;
            if (b % 5 == 0) {
                System.out.print("\n");
            }
        }
        for (; b % 5 != 0; b++) {
            System.out.printf("%4d", 0);
        }
        System.out.println("\n5. Проверка количества единиц на четность");

        //Проверка количества единиц на четность
        int scrNum = 3141591;
        int counter = 0;
        while (scrNum % 10 != 0) {
            if (scrNum % 10 == 1) {
                counter++;
            }
            scrNum /= 10;
        }
        if (counter % 2 == 0) {
            System.out.println ("Количество единиц четное: " + counter + "\n");
        } else {
            System.out.println ("Количество единиц нечетное: " + counter + "\n");
        }

        //Отображение фигур в консоли
        System.out.println("6. Отображение фигур в консоли");
        for (a = 0; a < 5; a++) {
            for (b = 0; b < 10; b++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        a = 0;
        b = 0;
        c = 5;
        while (b < 5) {
            while (a < c) {
                a++;
                System.out.print("#");
            }
            System.out.print("\n");
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
            System.out.print("\n");
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
            System.out.print("\n");
        } while (b < 2);
        System.out.println("\n7. Отображение ASCII-символов");

        //Отображение ASCII-символов
        System.out.println("Dec  Char");
        for (a = 0; a < 128; a++) {
            if (a % 2 != 0) {
                System.out.printf("%5d%5s", a, (char) a + "\n");
                if (a == 27) {
                    System.out.print("\n");
                }
            }
        }
        System.out.println("\n8. Проверка, является ли число палиндромом");

        //Проверка, является ли число палиндромом
        scrNum = 12321;
        a = 10000;
        boolean palindrome = true;
        for (int i = 0; i < 2; i++) {
            if (scrNum / a != scrNum % 10) {
                palindrome = false;
                scrNum %= a;
                scrNum /= 10;
                a /= 100;
            } else {
                scrNum %= a;
                scrNum /= 10;
                a /= 100;
            }
        }
        if (palindrome) {
            System.out.println("Число палиндром" + "\n");
        } else {
            System.out.println("Число не палиндром" + "\n");
        }

        //Определение, является ли число счастливым
        System.out.println("9. Определение, является ли число счастливым");
        int number = 325891;
        int firstHalfNumber = number / 1000;
        int secondHalfNumber = number % 1000;
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < 3; i++) {
            firstSum += firstHalfNumber % 10;
            firstHalfNumber /= 10;
        }
        for (int i = 0; i < 3; i++) {
            secondSum += secondHalfNumber % 10;
            secondHalfNumber /= 10;
        }
        System.out.println(number / 1000 + " = " + firstSum);
        System.out.println(number % 1000 + " = " + secondSum);
        if (firstSum == secondSum) {
            System.out.println("Число счастливое" + "\n");
        } else {
            System.out.println("Число несчастливое" + "\n");
        }

        //Вывод таблицы умножения Пифагора
        System.out.println("10. Вывод таблицы умножения Пифагора");
        System.out.printf("%5s", "|");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.print("\n");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%4s", "____");
        }
        System.out.print("\n");
        for (int i = 2; i < 10; i++) {
            System.out.printf(i + "%4s", "|");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.print("\n");
        }
    }
}