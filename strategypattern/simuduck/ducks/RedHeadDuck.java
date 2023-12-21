package strategypattern.simuduck.ducks;

import strategypattern.simuduck.flybehavior.FlyWithWings;
import strategypattern.simuduck.quackbehavior.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a red head duck");
    }
}
