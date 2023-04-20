package Task_1;

public class Cat extends Animal implements Runable {

    private String color;

    public Cat(String name, int box, String color) {
        super(name, box);
        this.color = color;
    }

    @Override
    public String voice() {
        return "Издает звук: Мяу";
    }

    @Override
    public String toString() {
        return "Кошка " + super.toString();
    }

    @Override
    public int speedofRun() {
        return 15;
    }

}
