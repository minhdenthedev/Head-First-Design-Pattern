package strategypattern.simuduck.ducks;

import strategypattern.simuduck.flybehavior.FlyWithWings;
import strategypattern.simuduck.quackbehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck!");
    }
}
