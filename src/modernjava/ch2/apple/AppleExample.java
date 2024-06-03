package modernjava.ch2.apple;

import static modernjava.ch2.apple.Color.*;

import java.util.List;

public class AppleExample {

    private static final List<Apple> inventory = List.of(
            new Apple(150, GREEN),
            new Apple(200, RED),
            new Apple(100, GREEN),
            new Apple(120, RED),
            new Apple(150, GREEN)
    );

    public static void main(String[] args) {
        List<Apple> greenApples = AppleResearcher.filterApplesByColor(inventory, GREEN);
        List<Apple> redApples = AppleResearcher.filterApplesByColor(inventory, RED);

        greenApples.forEach(apple -> System.out.println(apple.getColor()));
        redApples.forEach(apple -> System.out.println(apple.getColor()));
    }
}
