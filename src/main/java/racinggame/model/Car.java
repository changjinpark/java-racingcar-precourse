package racinggame.model;

public class Car {
    private static final int INIT_POSITION = 0;
    private final String carName;
    private Position position;

    public Car(String carName) {
        this.carName = carName;
        this.position = new Position(INIT_POSITION);
    }

    public Car(String carName, Position position) {
        this.carName = carName;
        this.position = position;
    }

    public void move(RandomWay randomWay) {
        if (randomWay.movable()) {
            position.move();
        }
    }

    public String name() {
        return this.carName;
    }

    public Position position() {
        return this.position;
    }

    public boolean isWinner(Position maxPosition) {
        return position.isSamePosition(maxPosition);
    }
}
