class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.sex = "male";
        wolfOne.name = "Boris";
        wolfOne.weight = 30;
        wolfOne.age = 10;
        wolfOne.color = "black";
        System.out.println("Пол: " + wolfOne.sex);
        System.out.println("Кличка: " + wolfOne.name);
        System.out.println("Вес: " + wolfOne.weight);
        System.out.println("Возраст: " + wolfOne.age);
        System.out.println("Цвет: " + wolfOne.color);
        wolfOne.go();
        wolfOne.run();
        wolfOne.sit();
        wolfOne.howl();
        wolfOne.hunt();
    }
}