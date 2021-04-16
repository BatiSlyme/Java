package SwitchExample;


public class DayOfTheMonthMethodExample {

    public static void main(String[] args) {
        dayofthemonth(1);
        dayofthemonth(3);
        dayofthemonth(4);
        dayofthemonth(-1);
    }

    public static void dayofthemonth(int day) {
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("wrong day");
                break;
        }
    }
}
