public enum Month {

    JANUARY(1, "January"),
    FEBRUARY(2, "February"),
    MARCH(3, "March"),
    APRIL(4, "April"),
    MAY(5, "May"),
    JUNE(6, "June"),
    JULY(7, "July"),
    AUGUST(8, "August"),
    SEPTEMBER(9, "September "),
    OCTOBER(10, "October"),
    NOVEMBER(11, "November"),
    DECEMBER(12, "December");

    private final int numberMonth;
    private final String nameMonth;

    Month(int numberMonth, String nameMonth) {
        this.numberMonth = numberMonth;
        this.nameMonth = nameMonth;
    }

    public static String getNumberMonth(int numberMonth) {
        for (Month month : Month.values()) {
            if (month.numberMonth == numberMonth) {
                return month.nameMonth;
            }
        }
        return null;
    }
    static int getNameMonth(String nameMonth) {
        for (Month month : Month.values()) {
            if (month.nameMonth.equals(nameMonth)) {
                return month.numberMonth;
            }
        }
        return 0;
    }
}
