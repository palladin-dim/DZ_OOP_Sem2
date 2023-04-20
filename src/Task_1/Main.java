package Task_1;

public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Мурзик", 1, "чёрный"))
                .addAnimal(new Horse("Блестящий", 25))
                .addAnimal(new Duck("Утёнок", 17))
                .addAnimal(new Pingwin("Рыбак", 33));

        for (Animal an : zoo1.getAnimals()) {
            System.out.println(an);
            System.out.println(an.voice());
        }

        System.out.println("-------------------");

        System.out.println("Издают звуки животные:");

        for (Speakable speak : zoo1.getSpeakables()) {
            System.out.println(speak.voice());

        }

        System.out.println("-------------------");

        for (Runable run : zoo1.getRunables()) {
            System.out.println("Скорость передвижения:" + run.speedofRun());

        }

        int max = zoo1.getMaxspeed();
        System.out.printf("Максимальная скорость передвиженияе: %d%n", max);

        System.out.println("..........................");

        for (Flyable flyable : zoo1.getFLyers()) {
            System.out.printf("Летает со скоростью : %d", +flyable.speedofFly());
        }

        System.out.println("\n-------------------");

        for (Swimable swim : zoo1.getSwimables()) {
            System.out.println("Плавают со скоростью: " + swim.speedofSwim());

        }

        int maxs = zoo1.getMaxSwimspeed();
        System.out.printf("Максимальная скорость плавающих: % d", maxs);


    }

}
