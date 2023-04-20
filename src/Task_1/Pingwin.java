package Task_1;

public class Pingwin extends Animal implements Swimable, Runable {

    public Pingwin(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedofRun() {
        return 5;
    }

    @Override
    public String voice() {
        return "Кричит: писк пингвинячий)";
    }

    @Override
    public int speedofSwim() {
        return 23;
    }

}
