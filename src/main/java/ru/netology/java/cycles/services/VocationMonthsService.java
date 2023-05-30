package ru.netology.java.cycles.services;
public class VocationMonthsService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // стартовое количество денег на счету

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                int strtMoney = money;
                int vocationExpenses = (money - expenses) / 3 * 2;
                money = money - expenses - vocationExpenses; // деньги на счету = текущие деньги - ежемесячные траты -  траты на отпуск
                System.out.println(month + " месяц. Денег на начало месяца " + strtMoney + " потратил " + expenses + " потрачено на отдых " + vocationExpenses);
            } else {
                int strMoney = money;
                money = money + income - expenses; // деньги на счету = текущие деньги + зарплата
                System.out.println(month + " месяц. Денег на начало месяца " + strMoney + " заработал " + income + " потратил " + expenses);
            }
        }
        return count; //  количество месяцев отдыха
    }
}
