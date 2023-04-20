package Task_1;

public abstract class Animal implements Speakable {

    private final String name;
    private final int box;

    public Animal(String name, int box) {
        this.name = name;
        this.box = box;
    }

    @Override
    public String toString() {
        return String.format("Питомец: %s , клетка №: %d", this.name, this.box);
    }

    public abstract String voice();
}
