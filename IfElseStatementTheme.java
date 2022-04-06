class IfElseStatementTheme {
    public static void main(String [] args) {
        //Перевод псевдокода на язык Java
        System.out.println("Перевод псевдокода на язык Java");
        byte age = 25;
        if (age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше либо равен 20");
        }
        boolean male = false;
        if (!male) {
            System.out.println("Пол женский");
        }
        float height = 1.9f;
        if (height < 1.8) {
            System.out.println("Рост меньше 1,80");
        } else {
            System.out.println("Рост больше либо равен 1,8");
        }
        String name = "Jack";
        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква имени М");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква имени не M и не I" + "\n");
        }

        //Поиск максимального и минимального числа
        System.out.println("Поиск максимального и минимального числа");
        int number1 = 25;
        int number2 = 30;
        if (number1 > number2) {
            System.out.println("Максимальное число: " + number1 + ", минимальное число: " + number2);
        } else {
            System.out.println("Максимальное число: " + number2 + ", минимальное число: " + number1 + "\n");
        }

        //Работа с числом
        System.out.println("Работа с числом");
        number1 = 22;
        if (number1 != 0) {
            if (number1 > 0) {
                System.out.println(number1 + " положительное");
            } else {
                System.out.println(number1 + " отрицательное");
            }
            if (number1 % 2 == 0) {
                System.out.println(number1 + " четное число" + "\n");
            } else {
                System.out.println(number1 + " нечётное число" + "\n");
            }
        } else {
            System.out.println("Введён ноль" + "\n");
        }

        //Поиск общей цифры в числах
        System.out.println("Поиск общей цифры в числах");
        number1 = 759;
        number2 = 959;
        if (number1 / 100 == number2 / 100) {
            System.out.println("В первом разряде одинковая цифра " + (number1 / 100));
        }
        if ((number1 % 100) / 10 == (number2 % 100) / 10) {
            System.out.println("Во втором разряде одинковая цифра " + ((number2 % 100) / 10));
        }
        if (number1 % 10 == number2 % 10) {
            System.out.println("В третьем разряде одинковая цифра " + (number1 % 10) + "\n");
        }

        //Определение буквы, числа или символа по их коду
        System.out.println("Определение буквы, числа или символа по их коду");
        char unknownChar = '\u005A';
        if (unknownChar > '\u002F' && unknownChar < '\u003A') {
            System.out.println(unknownChar + " цифра");
        }else if (unknownChar > '\u0040' && unknownChar < '\u005B') {
            System.out.println(unknownChar + " заглавная буква" + "\n");
        } else if (unknownChar > '\u0060' && unknownChar < '\u007B') {
            System.out.println(unknownChar + " строчная буква" + "\n");
        } else {
            System.out.println(unknownChar + " не буква и не цифра" + "\n");
        }

        //Определение суммы вклада и начисленных банком %
        System.out.println("Определение суммы вклада и начисленных банком %");
        double deposit = 300000;
        double ratio;
        if (deposit < 100000) {
            ratio = 0.05;
        } else if (deposit >= 300000) {
            ratio = 0.1;
        } else {
            ratio = 0.07;
        }
        System.out.println("Сумма вклада: " + deposit + ". Начисленный процент: " + deposit * ratio + "%. Итоговая сумма: " + deposit * (1 + ratio) + "\n");

        //Определение оценки по предметам
        System.out.println("Определение оценки по предметам");
        int historyPercent = 59;
        int historyRating;
        if (historyPercent <= 60) {
            historyRating = 2;
        } else if (historyPercent < 73) {
            historyRating = 3;
        } else if (historyPercent < 92) {
            historyRating = 4;
        } else {
            historyRating = 5;
        }
        int programmingPercent = 91;
        int programmingRating;
        if (programmingPercent <= 60) {
            programmingRating = 2;
        } else if (programmingPercent < 73) {
            programmingRating = 3;
        } else if (programmingPercent < 92) {
            programmingRating = 4;
        } else {
            programmingRating = 5;
        }
        double averageRating = (historyRating + programmingRating) / 2;
        double averagePercent = (historyPercent + programmingPercent) / 2;
        System.out.println(historyRating + " по истории. " +"\n" + programmingRating + " по программированию." + "\n" + "Средний балл оценок по предметам: " + averageRating + "\n" + "Средний процент: " + averagePercent + "\n");

        //Расчет прибыли (убытка)
        System.out.println("Расчет прибыли (убытка)");
        int monthlyRent = 5000;
        int monthlyRevenue = 15000;
        int monthlyCost = 9000;
        double annualRevenue = (monthlyRevenue - monthlyCost - monthlyRent) * 12;
        if (annualRevenue >= 0) {
            System.out.println("Годовая прибыль: +" + annualRevenue + "\n");
        } else {
            System.out.println("Годовой убыток: " + annualRevenue + "\n");
        }

        //Определение существования треугольника
        System.out.println("Определение существования треугольника");
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        int hypotenuse = 0;
        int firstLeg = 0;
        int secondLeg = 0;
        if (sideA + sideB < sideC || sideB + sideC < sideA || sideA + sideC < sideB) {
            System.out.println("треугольник не существует");
        } else {
            if (sideA > sideB && sideA > sideC) {
                hypotenuse = sideA;
                firstLeg = sideB;
                secondLeg = sideC;
            } else if (sideB > sideA && sideB > sideC) {
                hypotenuse = sideB;
                firstLeg = sideA;
                secondLeg = sideC;
            } else {
                hypotenuse = sideC;
                firstLeg = sideA;
                secondLeg = sideB;
            }
        }
        System.out.println("Гипотенуза: " + hypotenuse + ". Катеты: " + firstLeg + ", " + secondLeg +"\n" + "Площадь равна " + (double) (firstLeg * secondLeg) / 2);
        System.out.println("|\\" + "\n" + "| \\" + "\n" + "|  \\" + "\n" + "|___\\" + "\n");

        //Подсчет количества банкнот
        System.out.println("Подсчет количества банкнот");
        int sum = 567;
        int denominationFifty = sum / 50;
        int denominationTen = sum % 50 / 10;
        int denominationOne = sum % 50 % 10;
        int sumCheck = denominationFifty * 50 + denominationTen * 10 + denominationOne;
        System.out.println("Банкнот номиналом 50: " + denominationFifty + ". Банкнот номиналом 10: " + denominationTen + ". Банкнот номиналом 1: " + denominationOne + ". Исходная сумма: " + sumCheck);
    }
}