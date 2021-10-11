package racinggame.model;

public class RaceCount {
    private int raceCount;

    public RaceCount(String raceCount) {
            this.raceCount = Integer.parseInt(raceCount);
    }

    public int raceCount() {
        return this.raceCount;
    }
}
