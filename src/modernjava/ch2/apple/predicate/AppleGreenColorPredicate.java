package modernjava.ch2.apple.predicate;

import static modernjava.ch2.apple.domain.Color.GREEN;

import modernjava.ch2.apple.domain.Apple;

public class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean filter(Apple apple) {
        return GREEN.equals(apple.getColor());
    }
}
