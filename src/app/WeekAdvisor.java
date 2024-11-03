package app;

public class WeekAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                    System.out.println("Будній день! Складіть план на день і дотримуйтеся його.");
            case FRIDAY ->
                    System.out.println("Happy Friday! Підведіть підсумки тижня і складіть план на вихідні.");
            case SATURDAY, SUNDAY ->
                    System.out.println("Вихідні! Рекомендуємо відвідати парк або музей для відпочинку.");
        }
    }
}