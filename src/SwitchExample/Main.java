package SwitchExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        char charSet = 'A';
        switch (charSet){
            case 'A':
                System.out.println("A");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'B': case 'D': case 'F':
                System.out.println("BDF found");
                break;
            default:
                System.out.println("could not find ABC");

        }
        String month = "JAnuray";
        switch (month.toLowerCase()){
            case "januray":
                System.out.println("yey u got it");
                break;
        }

    }
}
