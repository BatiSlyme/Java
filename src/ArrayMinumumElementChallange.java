import java.util.Scanner;

public class ArrayMinumumElementChallange {
    private static Scanner scanner= new Scanner(System.in);

    public static void main(String[] arg) {
        System.out.println("enter count");
        int intergers=scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray=readIntegers(intergers);
        int returnedMin=findMin(returnedArray);

        System.out.println("min= "+returnedMin);

    }


    public static int[] readIntegers(int integers){
        int[] count=new int[integers];

        for(int i=0;i<count.length;i++){
            System.out.println("enter a number");
            int number=scanner.nextInt();
            scanner.nextLine();
            count[i]=number;
        }
        return count;
    }


    public static int findMin(int[] array){

        int min=Integer.MAX_VALUE;

        for (int i=0;i<array.length;i++) {
            int value = array[i];

            if(value<min){
                min=value;
            }

        }
        return min;
    }




}
