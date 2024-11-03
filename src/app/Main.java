package app;

public class Main {
    public static void main(String[] args) {
        WeekAdvisor advisor = new WeekAdvisor();

        advisor.advise(Day.MONDAY);
        advisor.advise(Day.FRIDAY);
        advisor.advise(Day.SATURDAY);
    }
}