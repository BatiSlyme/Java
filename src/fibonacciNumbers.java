public class fibonacciNumbers {

    public static void main(String[] arg) {
        int t1= 0;
        int t2= 1;

        for(int i=0;i<=10;i++){
            System.out.println(i+" number: "+t1);
            int sum=t1+t2;
            t1=t2;
            t2=sum;
        }

    }

}
