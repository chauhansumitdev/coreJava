enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Enum {
    public static void main(String[] args) {
        Day today = Day.SATURDAY;
        System.out.println("Today is: " + today);

        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday!");
                break;
            default:
                System.out.println("It's another day of the week.");
        }
    }
}
