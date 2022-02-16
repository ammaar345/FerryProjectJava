package ferry;

public class Cars {
    String[] color;
    int numPassengers;
    int tripCount = 0;

    public Cars(String[] color, int numPassengers) {
        this.color = color;
        this.numPassengers = numPassengers;

    }
    public int carColorCount(String[] arrCarColors, String color) {
        int iCarCount = 0;
        for (int i = 0; i < arrCarColors.length; i++) {
            if (arrCarColors[i] == color) {
                iCarCount++;
            }
        }
        return iCarCount;
    }
    public String board(int maxCars, int maxPassengers, int numCars, int numPassengers) {

        String msg = "";
        if (maxCars < numCars || maxPassengers < numPassengers) {

            msg = "rejected";
        }
        if (numCars <= maxCars && numPassengers <= maxPassengers) {
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

//    public static void main(String[] args) {
//        Cars cars = new Cars(new String[]{"red", "blue"}, 5);
//        Ferry ferry = new Ferry(2, 10, 2, 10);
//        cars.board(2, 10, 2, 2);
//        cars.board(2, 10, 2, 2);
//        cars.board(2, 10, 2, 2);
//        cars.board(2, 10, 2, 2);
//        cars.board(2, 10, 2, 2);
//        cars.board(2, 10, 2, 2);
//        cars.board(2, 10, 2, 2);
//        cars.board(2, 10, 2, 2);
//    }
}
