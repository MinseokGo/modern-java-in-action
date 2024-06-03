package modernjava.ch2.apple;

import static modernjava.ch2.apple.domain.Color.*;

import java.util.List;
import modernjava.ch2.apple.domain.Apple;
import modernjava.ch2.apple.predicate.AppleGreenColorPredicate;
import modernjava.ch2.apple.predicate.AppleHeavyWeightPredicate;
import modernjava.ch2.apple.predicate.AppleRedAntHeavyPredicate;

public class AppleExample {

    private static final List<Apple> inventory = List.of(
            new Apple(150, GREEN),
            new Apple(200, RED),
            new Apple(100, GREEN),
            new Apple(120, RED),
            new Apple(150, GREEN)
    );

    public static void main(String[] args) {
        List<Apple> greenApples = AppleResearcher.filterApples(inventory, new AppleGreenColorPredicate());
        List<Apple> heavyApples = AppleResearcher.filterApples(inventory, new AppleHeavyWeightPredicate());
        List<Apple> redAndHeavyApples = AppleResearcher.filterApples(inventory, new AppleRedAntHeavyPredicate());
    }
}
