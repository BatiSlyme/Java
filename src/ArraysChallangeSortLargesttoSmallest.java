import java.util.Scanner;

public class ArraysChallangeSortLargesttoSmallest {

    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] arg) {

        int[] value=getIntegers(5);
        int[] sorted=sortIntegers(value);
        printArray(sorted);

    }
    public static int[] getIntegers(int number){
        int []array=new int[number];
        System.out.println("Enter "+number+" integer values.\r");
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }
    public static int[] sortIntegers(int[] array){
        int[] sortedArray=new int[array.length];
        for(int i=0;i<array.length;i++){
            sortedArray[i]=array[i];//creating a copy
        }
        //int[] sortedArray= Arrays.copyOf(array,array.length); // moje da izpolzvame tva vmesto for cikula

        boolean flag=true;
        int temp;
        while(flag){
            flag=false;
            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("element "+i+" with value "+array[i]);
        }

    }

}
