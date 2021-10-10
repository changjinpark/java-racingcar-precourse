package racinggame.model;

public class Position {
    private static final int INIT_DISTANCE = 0;
    private int distance;

    public Position(int distance) {
        this.distance = distance;
    }

    public void move() {
        this.distance++;
    }

    public int distance() {
        return this.distance;
    }
}
