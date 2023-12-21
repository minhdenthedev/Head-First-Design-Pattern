package strategypattern.simuduck;

import strategypattern.simuduck.ducks.*;
import strategypattern.simuduck.flybehavior.FlyNoWay;
import strategypattern.simuduck.flybehavior.FlyWithWings;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("Mallard Duck: ");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("\nDecoy Duck: ");
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        System.out.println("\nRed Head Duck: ");
        Duck redheadDuck = new RedHeadDuck();
        redheadDuck.performFly();
        redheadDuck.performQuack();

        System.out.println("\nRubber Duck: ");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
