package modernjava.ch2.apple;

import java.util.ArrayList;
import java.util.List;
import modernjava.ch2.apple.domain.Apple;
import modernjava.ch2.apple.predicate.ApplePredicate;

public final class AppleResearcher {

    private AppleResearcher() {
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> apples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.filter(apple)) {
                apples.add(apple);
            }
        }
        return apples;
    }
}
