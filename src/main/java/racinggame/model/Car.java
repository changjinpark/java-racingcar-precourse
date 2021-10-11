package racinggame.model;

public class Car {
    private static final int INIT_POSITION = 0;
    private CarName carName;
    private Position position;

    public Car(String carName) {
        this(new CarName(carName));
    }

    public Car(CarName carName) {
        this.carName = carName;
        this.position = new Position(INIT_POSITION);
    }

    public Car(CarName carName, Position position) {
        this.carName = carName;
        this.position = position;
    }

    public void move(RandomWay randomWay) {
        if (randomWay.movable()) {
            position.move();
        }
    }

    public String name() {
        return this.carName.carName();
    }

    public Position position() {
        return this.position;
    }

    public boolean isWinner(Position maxPosition) {
        return position.isSamePosition(maxPosition);
    }
}
