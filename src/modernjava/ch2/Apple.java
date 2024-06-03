package modernjava.ch2;

public class Apple {

    private final int weigh;
    private final Color color;

    public Apple(int weigh, Color color) {
        this.weigh = weigh;
        this.color = color;
    }

    public int getWeigh() {
        return weigh;
    }

    public Color getColor() {
        return color;
    }
}
