public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Man");
        wolfOne.setNickName("Bim");
        wolfOne.setWeight(40.0f);
        wolfOne.setAge(7);
        wolfOne.setColor("White");

        System.out.println("Пол = " + wolfOne.getGender());
        System.out.println("Кличка = " + wolfOne.getNickName());
        System.out.println("Вес = " + wolfOne.getWeight());
        System.out.println("Возраст = " + wolfOne.getAge());
        System.out.println("Окрас = " + wolfOne.getColor());

        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}