package Task_1;

public abstract class Animal implements Speakable {

    private String name;
    private int box;

    public Animal(String name, int box) {
        this.name = name;
        this.box = box;
    }

    @Override
    public String toString() {
        return String.format("по кличке: %s , сидит в клетке под номером: %d", this.name, this.box);
    }

    public abstract String voice();
}
