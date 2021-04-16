package SwitchExample;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        int a= 1400%400;
        int b= 1400%100;
        int c= 1400%10;
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(9000);
        isLeapYear(2000);
        getDaysInMonth(1,1999);
        getDaysInMonth(2, 2024);
        getDaysInMonth(1,-1);
        getDaysInMonth(13,-1);

    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 || year <= 9999) {
            if (year % 400 == 0) {
                System.out.println("leep year");
                return true;
            }else{
                System.out.println("not leep year");
                return false;
            }
        } else {
            System.out.println("not correct year");
            return false;
        }

    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        } if (year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 days");
                    return 31;

                case 2:
                    if (year % 400 == 0) {
                        System.out.println("29 days ");
                        return 29;
                    } else {
                        System.out.println("28");
                        return 28;
                    }

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 days");
                    return 30;

                default:
                    System.out.println("enter a correct date");
                    break;

            }
        }
        return 0;
    }

}
