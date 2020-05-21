package headFirst.adapter;

public class WildTurkey implements Turkey {
    public void fly() {
        System.out.println("I'm flying. A short ways.");
    }

    public void gobble() {
        System.out.println("Gobble");
    }
}
