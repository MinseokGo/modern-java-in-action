package modernjava.ch2.apple.predicate;

import modernjava.ch2.apple.domain.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean filter(Apple apple) {
        return apple.getWeight() > 150;
    }
}
