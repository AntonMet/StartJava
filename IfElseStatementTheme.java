class ifElseStatementTheme {
    public static void main(String [] args) {
        //Перевод псевдокода на язык Java
        System.out.println("Перевод псевдокода на язык Java");
        byte age = 25;
        boolean male = false;
        float growth = 1.9f;
        String name = "Jack";
        if (age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше либо равен 20");
        }
        if (!male) {
            System.out.println("Пол женский");
        }
        if (growth < 1.8) {
            System.out.println("Рост меньше 1,80");
        } else {
            System.out.println("Рост больше либо равен 1,8");
        }
        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква имени М");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Первая буква имени I");
            } else {
                System.out.println("Первая буква имени не M и не I" + "\n");
            }
    }
}