public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "Man";
        wolfOne.nickName = "Bim";
        wolfOne.weight = 40.0f;
        wolfOne.age = 10;
        wolfOne.color = "White";

        System.out.println("Пол = " + wolfOne.gender);
        System.out.println("Кличка = " + wolfOne.nickName);
        System.out.println("Вес = " + wolfOne.weight);
        System.out.println("Возраст = " + wolfOne.age);
        System.out.println("Окрас = " + wolfOne.color);

        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}