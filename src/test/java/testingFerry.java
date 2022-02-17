import ferry.Cars;
import ferry.Ferry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testingFerry {
    @Test
    public void testingFreeFerry() {
        Ferry ferry = new Ferry(10, 30);
        ferry.board(1, 4);
        ferry.board(1, 4);
        ferry.board(1, 4);
        ferry.board(1, 4);
        ferry.board(1, 4);
        ferry.board(1, 4);
        ferry.board(1, 4);

        assertEquals(ferry.board(2, 2), "you go free!");
//        System.out.println(ferry.tripCounter());
    }

    @Test
    public void testingHalfPrice() {
        Ferry ferry = new Ferry(10, 30);
        ferry.board(1, 6);
        ferry.board(1, 9);
        assertEquals(ferry.board(4, 13), "half price!");
    }

    @Test
    public void testingRejects() {
        Ferry ferry = new Ferry(13, 12);
        assertEquals(ferry.board(14, 12), "rejected");
    }

    @Test
    public void testingRejects2() {
        Ferry ferry = new Ferry(13, 12);
        assertEquals(ferry.board(13, 15), "rejected");
    }

    @Test
    public void testingCarCountForGreen() {
        String[] carColors = new String[]{"red", "green", "green"};
        Cars cars = new Cars(carColors, 6);
        assertEquals(cars.carColorCount(carColors, "green"), 2);
    }

    @Test
    public void testingCarCountForRed() {
        String[] carColors = new String[]{"red", "green", "red", "red"};
        Cars cars = new Cars(carColors, 6);
        assertEquals(cars.carColorCount(carColors, "red"), 3);
    }

}
