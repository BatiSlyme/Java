import java.util.Scanner;

public class Hello {

    private String firstName;
    private String lastName;
    private int age;

    private double firstNumber;
    private double secondNumber;



    private static Scanner scanner=new Scanner(System.in); // TOVA E READLINE PRI C#

    public static void main(String[] arg) {
        String firstNumber;
        String secondNumber;
        //      isTeen();




/*
        long miles=toMillesPerHour(10.5);


        System.out.println("Miles: "+miles);
        Conversion(10.5);*/


        //SPEED CONVERTER
   /* public static long toMillesPerHour(double killometersPerHour) {

        if (killometersPerHour < 0)
            return -1;
        return Math.round(killometersPerHour / 1.609);


    }

    public static void Conversion(double killometersPerHour) {

        if(killometersPerHour<0)
            System.out.println("Invalid value");
        else {
            long miles = toMillesPerHour(killometersPerHour);
            System.out.println(killometersPerHour + "km/h = " + miles + "mi/h");
        }

    }
       // printMegaByteAndKiloByte(2500);
     boolean yes=  shouldWakeUp(true,1);
      yes= shouldWakeUp(false,2);

}
        public static void printMegaByteAndKiloByte(int kiloBytes){

        if(kiloBytes<0)
            System.out.println("Invalid Value");
        else {
            System.out.println(kiloBytes+"KB ="+kiloBytes/1024+"MB and "+kiloBytes%1024+"KB");
        }


        }

        public static boolean shouldWakeUp(boolean isBarking,int hour){
         isBarking=true;
           if(isBarking){
                if(hour<=8||hour>=23)
                    return true;
                else
                    System.out.println("dog is not barking");
                    return false;
           }

               return isBarking;
        }

   //sum calculator
   public double getFirstNumber(){
        return this.firstNumber;
   }

    public double getSecondNumber(){
       return this.secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        return (this.firstNumber + this.secondNumber);
    }
    public double getSubtractionResult(){
        return this.firstNumber-this.secondNumber;
    }
    public double getMultiplicationResult(){
        return (this.firstNumber*this.secondNumber);
    }
    public double getDivisionResult(){
       if (this.secondNumber==0)
                return 0;
       else
                return (this.firstNumber/this.secondNumber);
    }


   //classes- person
        public String getFirstName(){
            return this.firstName;
        }

        public String getLastName(){
            return this.lastName;
        }
        public int getAge(){
            return this.age;
        }
        public String setFirstName(String firstName){
            return this.firstName=firstName;
        }

        public String setLastName(String lastName){
            return this.lastName=lastName;
        }

        public int setAge(int age){
            if(this.age<=0||this.age>=100)
                return 0;
            else
                return this.age=age;
        }
        public boolean isTeen(){
            if (this.age>12&&this.age<20)
                return true;
            else
                return false;
        }
        public String getFullName(){
             if(firstName.isEmpty()||lastName.isEmpty())
                 return null;
             else if(lastName.isEmpty()||firstName.isEmpty())
                 return null;
             else if(lastName.isEmpty()||firstName.isEmpty())
                 return null;
             else
                 return (firstName+" "+lastName);

        }
      ---------------------------------------------------------------------------------------------------------------------------------------------------
//ARRAYS
        int[] myArray = new int[25];//new int{1,2,3,4,5,6,7,8,9,10};//assign these numbers in the array STIGA OT 0 DO 9 elemneti
        System.out.println(myArray[5]);
        for (int i = 0; i < myArray.length; i++) {//lengh=25 ili kakto zadadam na arraya
            myArray[i] = i * 10;
            //  System.out.println("element"+i+", value is "+myArray[i]);
        printArray(myArray);
        }
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++)
            System.out.println("element"+i+", value is "+array[i]);
    }

    */

    int[] myIntergers=getIntegers(5);
    for(int i=0;i<myIntergers.length;i++){
        System.out.println("Enter "+i+", types vlaue was "+myIntergers[i]);
    }

    System.out.println("the average is "+getAverage(myIntergers));

    }
    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" integer values.\r");
        int []values=new int[number];

        for(int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum +=array[i];//adding to it
        }

        return (double)sum/(double)array.length;

    }



}

