import ru.netology.java.cycles.services.VocationMonthsService;

public class Main {
    public static void main(String[] args) {
        VocationMonthsService calculation = new VocationMonthsService();

        int months = calculation.calculate(10_000,3_000,20_000);
        System.out.println("Количество месяцев отдаха " + months);

    }
}
