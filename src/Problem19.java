public class Problem19 {

    public static void main(String[] args) {
        int numofSun = 0;
        while (Sunday.year < 2001) {
            if (Sunday.day == 1) {
                numofSun++;

                System.out.println("Day:  " + Sunday.day + "  Month:  " + Sunday.month + " Year: " + Sunday.year + " Total: " + numofSun);
            }
            Sunday.next();

        }
        System.out.println(numofSun);

    }

    static class Sunday {
        static int month = 0;
        static int year = 1901;
        static int day = 6;

        private static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        public static void next() {
            day = (day + 7);
            if (day > daysInMonth[month]) {
                day = day % daysInMonth[month];
                month = month + 1;
                if (month == 1) {
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                        daysInMonth[1] = 29;
                    else
                        daysInMonth[1] = 28;
                }
                if (month > 11) {
                    month = 0;
                    year = year + 1;
                }
            }
        }

    }
}