class VariablesTheme {
    public static void main(String args[]) {
        byte numberOfCpuCore = 4;
        short amountOfRam = 12;
        int bitDepthOfTheSystem = 64;
        long amountOfHddMemory = 1024;
        float cpuFrequency = 2f;
        double gpuFrequency = 1.2;
        char numberOfGpuCore = 2;
        boolean availabilityOfAPrinter = false;
        System.out.println("Количсетво ядер центрального процессора: " + numberOfCpuCore);
        System.out.println("Объём оперативной памяти: " + amountOfRam);
        System.out.println("Разрядность оперативной системы " + bitDepthOfTheSystem);
        System.out.println("Объём памяти на жестком диске " + amountOfHddMemory);
        System.out.println("Частота центрального процессора: " + cpuFrequency);
        System.out.println("Частота графического процессора: " + gpuFrequency);
        System.out.println("Количсетво ядер графического процессора: " + numberOfGpuCore);
        System.out.println("Наличие принтера: " + availabilityOfAPrinter);

        // Объявляются переменные всех существующих в Java примитивных типов данных, объявленные переменные выводятся в консоль.
        System.out.println("Объявляются переменные всех существующих в Java примитивных типов данных, объявленные переменные выводятся в консоль. \n");

        int costOfTheFirstItem = 100;
        int costOfTheSecondItem = 200;
        double discountAmount = (costOfTheFirstItem + costOfTheSecondItem) * 0.11;
        double discountPrice = (costOfTheFirstItem + costOfTheSecondItem) - discountAmount;
        System.out.println ("Сумма скидки: " + discountAmount);
        System.out.println ("Общая стоимость товаров со скидкой: " + discountPrice);

        // Объявляются переменные со стоимостью двух товаров, расчитывается стоимость скидки в 11%, в консоль выводится сумма скидки и общая стоимость товаров со скидкой.
        System.out.println("Объявляются переменные со стоимостью двух товаров, расчитывается стоимость скидки в 11%, в консоль выводится сумма скидки и общая стоимость товаров со скидкой. \n");

        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        // На экран выводится слово "Java".
        System.out.println("На экран выводится слово Java. \n");

        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807l;
        float e = 3.4028235E+38f; 
        double f = 1.7976931348623157E+308d;
        System.out.println("Переменная типа bite: " + a);
        System.out.println("Переменная типа short: " + b);
        System.out.println("Переменная типа int: " + c);
        System.out.println("Переменная типа long: " + d);
        System.out.println("Переменная типа float: " + e);
        System.out.println("Переменная типа double: " + f);
        System.out.println("Инкрементированная переменная типа bite: " + a++);
        System.out.println("Инкрементированная переменная типа short: " + b++);
        System.out.println("Инкрементированная переменная типа int: " + c++);
        System.out.println("Инкрементированная переменная типа long: " + d++);
        System.out.println("Инкрементированная переменная типа float: " + e++);
        System.out.println("Инкрементированная переменная типа double: " + f++);
        System.out.println("Декрементированная переменная типа bite: " + a--);
        System.out.println("Декрементированная переменная типа short: " + b--);
        System.out.println("Декрементированная переменная типа int: " + c--);
        System.out.println("Декрементированная переменная типа long: " + d--);
        System.out.println("Декрементированная переменная типа float: " + e--);
        System.out.println("Декрементированная переменная типа double: " + f--);

        /*
            Создаются переменные всех числовых типов данных, присваиваются максимально возможные значения,
            переменные выводятся в консоль. Затем выводятся результаты инкрементирования и декрементирования
            данных переменных
        */
        System.out.println("Создаются переменные всех числовых типов данных, присваиваются максимально возможные значения, переменные выводятся в консоль. Затем выводятся результаты инкрементирования и декрементирования данных переменных. \n");

        float g = 2.02156f;
        float h = 5.15689f;
        System.out.println("Переменная g: " + g + ", переменная h: " + h);
        float i = g;
        g = h;
        h = i;
        System.out.println("Переменная g: " + g + ", переменная h: " + h);

        //Создаются переменные, переменным присваивается значение, значение переменных меняется местами с помощью третьей переменной.
        System.out.println("Создаются переменные, переменным присваивается значение, значение переменных меняется местами с помощью третьей переменной. \n");

        char j = 35;
        char k = 38;
        char l = 64;
        char m = 94;
        char n = 95;
        System.out.println ((int)j + ": " + j);
        System.out.println ((int)k + ": " + k);
        System.out.println ((int)l + ": " + l);
        System.out.println ((int)m + ": " + m);
        System.out.println ((int)n + ": " + n);

        //Переменным типа char присваивается значение, значение выводится на экран, напротив выводится соответствующий символ.
        System.out.println("Переменным типа char присваивается значение, значение выводится на экран, напротив выводится соответствующий символ. \n");

        int o = 345;
        System.out.println("Произведение цифр числа 345: " + ((345 / 100) * (345 % 100 / 10) * (345 % 10)));
        System.out.println("Сумма цифр числа 345: " + ((345 / 100) + (345 % 100 / 10) + (345 % 10)));

        //В консоль выводится произведение и сумма цифр числа 345.
        System.out.println("В консоль выводится произведение и сумма цифр числа 345. \n");

        char spaces = 32;
        char slash = 47;
        char backslash = 92; 
        char underscore = '_';
        char openBracket = 40;
        char closeBracket = 41;
        System.out.println(spaces + "" + spaces + "" + spaces + "" + spaces + "" + slash + "" + "" + backslash);
        System.out.println(spaces + "" + spaces + "" + spaces + "" + slash + "" + spaces + "" + "" + spaces + "" + backslash);
        System.out.println(spaces + "" + spaces + "" + slash + "" + underscore + "" + "" + openBracket + "" + spaces + "" + closeBracket + "" + backslash);
        System.out.println(spaces + "" + slash + "" + spaces + "" + spaces + "" + spaces + "" + "" + spaces + "" + spaces + "" + spaces + "" + backslash + "" + spaces + "" + spaces + "" + spaces);
        System.out.println(slash + "" + underscore + "" + underscore + "" + underscore + "" + underscore + "" + slash + "" + backslash + "" + underscore + "" + underscore + "" + backslash);

        //В консоль выводится Java талисман.
        System.out.println("В консоль выводится Java талисман. \n");

        int number = 123;
        System.out.println("Сотен в числе " + number + ": " + (number / 100));
        System.out.println("Десяток в числе " + number + ": " + ((number % 100) / 10));
        System.out.println("Единиц в числе " + number + ": " + number % 10);

        //В консоль выводится количество сотен, десяток и единиц числа 123.
        System.out.println("В консоль выводится количество сотен, десяток и единиц числа 123. \n");

        int seconds = 86399;
        System.out.println (seconds / 3600 + ":" + (seconds % 3600) / 60 + ":" + seconds % 60);
        //В консоль выводится количество часов, минут и секунд в формате ЧЧ:ММ:СС. Общее количество секунд 86399.
        System.out.println("В консоль выводится количество часов, минут и секунд в формате ЧЧ:ММ:СС. Общее количество секунд 86399.");
    }
}