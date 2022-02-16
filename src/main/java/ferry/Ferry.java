package ferry;

public class Ferry {
    private final int maxCars;
    private final int maxPassengers;
    private int people_Count;
    private int car_Count;
    int tripCount = 0;

    public Ferry(int maxCars, int maxPassengers) {
        this.maxCars = maxCars;
        this.maxPassengers = maxPassengers;
    }

    public String board(int numCars, int numPassengers) {

        String msg = "";
        people_Count += numPassengers;
        car_Count += numCars;
        if (maxCars < getCarCount() || maxPassengers < getPeopleCount()) {

            msg = "rejected";
        }
        if (getCarCount() <= maxCars && getPeopleCount() <= maxPassengers) {
            msg = "accepted";
            tripCount++;
        }
        if (tripCount >= 3) {
            msg = "half price!";
        }
        if (tripCount > 7) {
            msg = "you go free!";
        }
        return msg;
    }

    public int tripCounter() {
        return tripCount;
    }

    public int getPeopleCount() {
        return people_Count;
    }

    public int getCarCount() {
        return car_Count;
    }



    public void update() {
        car_Count = 0;
        people_Count = 0;
    }
}
