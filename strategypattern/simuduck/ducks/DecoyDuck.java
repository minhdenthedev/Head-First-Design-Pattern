package strategypattern.simuduck.ducks;

import strategypattern.simuduck.flybehavior.FlyNoWay;
import strategypattern.simuduck.quackbehavior.Squeak;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck!!");
    }
}
