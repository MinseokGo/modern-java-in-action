package modernjava.ch2.apple.predicate;

import modernjava.ch2.apple.domain.Apple;

@FunctionalInterface
public interface ApplePredicate {

    boolean filter(Apple apple);
}
