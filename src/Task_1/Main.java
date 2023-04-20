package Task_1;

public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Васька", 1, "серый"))
                .addAnimal(new Horse("Серебряный", 25))
                .addAnimal(new Duck("Утя", 17))
                .addAnimal(new Pingwin("Ковальски", 33));

        for (Animal an : zoo1.getAnimals()) {
            System.out.println(an);
            System.out.println(an.voice());
        }

        System.out.println("-------------------");

        System.out.println("Многообразие звуков в зоопарке:");

        for (Speakable speak : zoo1.getSpeakables()) {
            System.out.println(speak.voice());

        }

        System.out.println("-------------------");

        for (Runable run : zoo1.getRunables()) {
            System.out.println("Бегает со скоростью:" + run.speedofRun());

        }

        int max = zoo1.getMaxspeed();
        System.out.printf("Максимальная скорость которую развивают животные: %d%n", max);

        System.out.println("-------------------");

        for (Flyable flyable : zoo1.getFLyers()) {
            System.out.printf("Cкорость полета : %d", +flyable.speedofFly());
        }

        System.out.println("\n-------------------");

        for (Swimable swim : zoo1.getSwimables()) {
            System.out.println("Плавают со скоростью: " + swim.speedofSwim());

        }

        int maxs = zoo1.getMaxSwimspeed();
        System.out.printf("Максимальная скорость с которой плавают: % d", maxs);


    }

}
