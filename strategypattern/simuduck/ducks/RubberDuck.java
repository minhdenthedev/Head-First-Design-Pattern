package strategypattern.simuduck.ducks;

import strategypattern.simuduck.flybehavior.FlyNoWay;
import strategypattern.simuduck.quackbehavior.MuteQuack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
