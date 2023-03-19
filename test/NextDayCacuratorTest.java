import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkei.academy.NextDayCacurator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCacuratorTest {
    @Test
    @DisplayName("testing day1month1")
    void testDay1Month1() {
        int day = 1;
        int month = 1;
        int year = 2018;

        String expected = 2 + "/" + 1 + "/" + 2018;
        String reusult = NextDayCacurator.nextDay(day, month, year);
        assertEquals(expected, reusult);
    }

    @Test
    void testDay31Month1() {
        int day = 31;
        int month = 1;
        int year = 2018;

        String expected = 1 + "/" + 2 + "/" + 2018;
        String reusult = NextDayCacurator.nextDay(day, month, year);
        assertEquals(expected, reusult);
    }

    @Test
    void testDay30Month4() {
        int day = 30;
        int month = 4;
        int year = 2018;

        String expected = 1 + "/" + 5 + "/" + 2018;
        String reusult = NextDayCacurator.nextDay(day, month, year);
        assertEquals(expected, reusult);
    }

    @Test
    void testDay28Month2() {
        int day = 28;
        int month = 1;
        int year = 2018;

        String expected = 1 + "/" + 3 + "/" + 2018;
        String reusult = NextDayCacurator.nextDay(day, month, year);
        assertEquals(expected, reusult);
    }
    @Test
    void testDay29Month2() {
        int day = 29;
        int month = 1;
        int year = 2018;

        String expected = 1 + "/" + 3 + "/" + 2018;
        String reusult = NextDayCacurator.nextDay(day, month, year);
        assertEquals(expected, reusult);
    }

    @Test
    void testDay31Month12() {
        int day = 31;
        int month = 12;
        int year = 2018;

        String expected = 1 + "/" + 1 + "/" + 2019;
        String reusult = NextDayCacurator.nextDay(day, month, year);
        assertEquals(expected, reusult);
    }
}
