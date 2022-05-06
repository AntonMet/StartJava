class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex("male");
        wolfOne.setName("Boris");
        wolfOne.setWeight(30);
        wolfOne.setAge(5);
        wolfOne.setColor("black");
        System.out.println("Пол: " + wolfOne.getSex());
        System.out.println("Кличка: " + wolfOne.getName());
        System.out.println("Вес: " + wolfOne.getWeight());
        System.out.println("Возраст: " + wolfOne.getAge());
        System.out.println("Цвет: " + wolfOne.getColor());
        wolfOne.go();
        wolfOne.run();
        wolfOne.sit();
        wolfOne.howl();
        wolfOne.hunt();
    }
}