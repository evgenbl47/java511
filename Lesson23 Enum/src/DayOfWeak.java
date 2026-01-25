public enum DayOfWeak {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekend() {
        boolean res;
        return res = (this == SATURDAY || this == SUNDAY);
    }
}
//Monday — run day,
// Tuesday — news day,
// Wednesday — friends day,
// Thursday — bears day,
// Friday — my day,
// Saturday — flatter day,
// Sunday — fun day!

