import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.java.cycles.services.VocationMonthsService;

public class VocationMonthsServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/Month.csv")
    void shouldCalculateMonthsVocations3(int expected,int income, int expenses,int threshold ) {
        VocationMonthsService calculation = new VocationMonthsService();
// int income = 10_000;
// int expenses = 3_000;
// int threshold = 20_000;
// int expected = 3;
        int months = calculation.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected, months);

    }
/*
    @Test
    void shouldCalculateMonthsVocations2() {
        VocationMonthsService calculation = new VocationMonthsService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int months = calculation.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected, months);

   }
*/
}
