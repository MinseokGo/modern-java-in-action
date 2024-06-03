package modernjava.ch2.apple.predicate;

import static modernjava.ch2.apple.domain.Color.RED;

import modernjava.ch2.apple.domain.Apple;

public class AppleRedAntHeavyPredicate implements ApplePredicate {

    @Override
    public boolean filter(Apple apple) {
        return RED.equals(apple.getColor()) &&
                apple.getWeight() > 150;
    }
}
