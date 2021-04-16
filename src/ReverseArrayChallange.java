import java.util.Arrays;

public class ReverseArrayChallange {

    public static void main(String[] arg) {
        int[] myArray = {1, 2, 3, 4, 5,11,9,15};
        System.out.println("array = "+ Arrays.toString(myArray));

        reverse(myArray);

        System.out.println("reversed= "+ Arrays.toString(myArray));
        }
        private static void reverse(int[] array){
            int maxIndex=array.length-1;
            int halfLenght=array.length/2;

            for (int i = 0; i <halfLenght; i++) {
                int temp=array[i];
                array[i]=array[maxIndex -i];
                array[maxIndex-i]=temp;
            }
        }
    }

