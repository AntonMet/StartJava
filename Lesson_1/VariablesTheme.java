class VariablesTheme {
    public static void main(String args[]) {
        // Создание переменных и вывод их значений на консоль
        System.out.println("Создание переменных и вывод их значений на консоль");
        byte numberOfCpuCore = 4;
        short amountOfRam = 12;
        int bitDepthOfSystem = 64;
        long amountOfHddMemory = 1024;
        float cpuFrequency = 2f;
        double gpuFrequency = 1.2;
        char numberOfGpuCore = 2;
        boolean availabilityOfPrinter = false;
        System.out.println("Количсетво ядер центрального процессора: " + numberOfCpuCore);
        System.out.println("Объём оперативной памяти: " + amountOfRam);
        System.out.println("Разрядность оперативной системы " + bitDepthOfSystem);
        System.out.println("Объём памяти на жестком диске " + amountOfHddMemory);
        System.out.println("Частота центрального процессора: " + cpuFrequency);
        System.out.println("Частота графического процессора: " + gpuFrequency);
        System.out.println("Количсетво ядер графического процессора: " + numberOfGpuCore);
        System.out.println("Наличие принтера: " + availabilityOfPrinter + "\n");

        // Расчет стоимости товара со скидкой
        System.out.println("Расчет стоимости товара со скидкой");
        int priceX = 100;
        int priceY = 200;
        double discountAmount = (priceX + priceY) * 0.11;
        double discountPrice = (priceX + priceY) - discountAmount;
        System.out.println ("Сумма скидки: " + discountAmount);
        System.out.println ("Общая стоимость товаров со скидкой: " + discountPrice + "\n");

        // Вывод на консоль слова JAVA
        System.out.println("Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a" + "\n");

        //Отображение min и max значений числовых типов данных
        System.out.println("Отображение min и max значений числовых типов данных");
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807l;
        float e = 3.4028235e+38f; 
        double f = 1.7976931348623157e+308d;
        System.out.println("Переменная типа bite: " + a);
        System.out.println("Переменная типа short: " + b);
        System.out.println("Переменная типа int: " + c);
        System.out.println("Переменная типа long: " + d);
        System.out.println("Переменная типа float: " + e);
        System.out.println("Переменная типа double: " + f);
        System.out.println("Инкрементированная переменная типа bite: " + ++a);
        System.out.println("Инкрементированная переменная типа short: " + ++b);
        System.out.println("Инкрементированная переменная типа int: " + ++c);
        System.out.println("Инкрементированная переменная типа long: " + ++d);
        System.out.println("Инкрементированная переменная типа float: " + ++e);
        System.out.println("Инкрементированная переменная типа double: " + ++f);
        System.out.println("Декрементированная переменная типа bite: " + --a);
        System.out.println("Декрементированная переменная типа short: " + --b);
        System.out.println("Декрементированная переменная типа int: " + --c);
        System.out.println("Декрементированная переменная типа long: " + --d);
        System.out.println("Декрементированная переменная типа float: " + --e);
        System.out.println("Декрементированная переменная типа double: " + --f + "\n");

        //Перестановка значений переменных
        System.out.println("Перестановка значений переменных");
        float g = 2.02156f;
        float h = 5.15689f;
        System.out.println("Переменная g: " + g + ", переменная h: " + h);
        float i = g;
        g = h;
        h = i;
        System.out.println("Переменная g: " + g + ", переменная h: " + h + "\n");

        //Вывод символов и их кодов
        System.out.println("Вывод символов и их кодов");
        char j = 35;
        char k = 38;
        char l = 64;
        char m = 94;
        char n = 95;
        System.out.println ((int) j + ": " + j);
        System.out.println ((int) k + ": " + k);
        System.out.println ((int) l + ": " + l);
        System.out.println ((int) m + ": " + m);
        System.out.println ((int) n + ": " + n + "\n");

        //Произведение и сумма цифр числа
        System.out.println("Произведение и сумма цифр числа");
        int srcNum = 345;
        int firstDigit = srcNum / 100;
        int secondDigit = srcNum % 100 / 10;
        int thirdDigit = srcNum % 10;
        System.out.println("Произведение цифр числа 345: " + firstDigit * secondDigit * thirdDigit);
        System.out.println("Сумма цифр числа 345: " + (firstDigit + secondDigit + thirdDigit) + "\n");

        //Вывод на консоль ASCII-арт Дюка
        System.out.println("Вывод на консоль ASCII-арт Дюка");
        char space = 32;
        char slash = 47;
        char backslash = 92; 
        char underscore = '_';
        char openBracket = 40;
        char closeBracket = 41;
        System.out.println("" + space + space + space + space + slash + backslash);
        System.out.println("" + space + space + space + slash + space + space + backslash);
        System.out.println("" + space + space + slash + underscore + openBracket + space + closeBracket + backslash);
        System.out.println("" + space + slash + space + space + space + space + space + space + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash + "\n");

        //Отображение количества сотен, десятков и единиц числа
        System.out.println("Отображение количества сотен, десятков и единиц числа");
        int number = 123;
        System.out.println("Сотен в числе " + number + ": " + (number / 100));
        System.out.println("Десяток в числе " + number + ": " + ((number % 100) / 10));
        System.out.println("Единиц в числе " + number + ": " + number % 10 + "\n");

        //Преобразование секунд
        System.out.println("Преобразование секунд");
        int seconds = 86399;
        System.out.println (seconds / 3600 + ":" + (seconds % 3600) / 60 + ":" + seconds % 60);
    }
}