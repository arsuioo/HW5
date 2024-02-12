package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        int income = 100_000;
        int expenses = 60_000;
        int thresold = 150_000;
        holidayService service = new holidayService();
        int moth = service.calculate(income, expenses, thresold);
        System.out.println("Отдыхаем " + moth + " месяца(ев)");
    }
}