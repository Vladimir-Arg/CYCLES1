import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.java.cycles.services.VocationMonthsService;

public class VocationMonthsServiceTest {
    @Test
    void shoudCalculateMonthsVocations3() {
        VocationMonthsService calculation = new VocationMonthsService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int months = calculation.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected, months);

    }

    @Test
    void shoudCalculateMonthsVocations2() {
        VocationMonthsService calculation = new VocationMonthsService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int months = calculation.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected, months);

    }
}
