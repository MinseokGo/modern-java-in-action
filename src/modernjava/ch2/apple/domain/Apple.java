package modernjava.ch2.apple.domain;

public class Apple {

    private final int weight;
    private final Color color;

    public Apple(int weigh, Color color) {
        this.weight = weigh;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }
}
