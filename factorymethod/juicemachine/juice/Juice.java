package factorymethod.juicemachine;

public class Juice {
    String name;

    public Juice() {}

    public String getName() {
        return name;
    }

    public void cut() {
        System.out.println("Cutting the fruit");
    }

    public void press() {
        System.out.println("Pressing the fruit...");
    }

    public void prepare() {
        System.out.println("Putting into the cup...");
    }
}
