package Task_1;

public class Horse extends Animal implements Runable {

    public Horse(String name, int box) {
        super(name, box);
    }

    @Override
    public String voice() {
        return "Издает звук: И-ГО-ГО";
    }

    @Override
    public String toString() {
        return "Конь " + super.toString();
    }

    @Override
    public int speedofRun() {

        return 60;
    }
}
