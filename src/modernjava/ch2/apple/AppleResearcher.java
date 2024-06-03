package modernjava.ch2.apple;

import java.util.ArrayList;
import java.util.List;

public final class AppleResearcher {

    private AppleResearcher() {
    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> apples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                apples.add(apple);
            }
        }
        return apples;
    }
}
