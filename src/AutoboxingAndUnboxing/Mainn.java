package AutoboxingAndUnboxing;

import java.util.ArrayList;
class intClass{
   private int myValue;

    public intClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }
//      wrapper
    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Mainn {
    public static void main(String[] args) {

        String [] srtArray=new String[10];
        int[]Array=new int[10];

        ArrayList<String> srtArrayList=new ArrayList<String>();
        srtArrayList.add("Tim");

//        ArrayList<int> intArrayList=new ArrayList<int>();
        ArrayList<intClass> intClassArrayList=new ArrayList<intClass>();
        intClassArrayList.add(new intClass(54));
        Integer Integer=new Integer(54);
        Double doubleValue=new Double(12.23);

        ArrayList<Integer> intArrayList=new ArrayList<Integer>();
        for (int i=0;i<=10;i++){
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i=0;i<=10;i++){
            System.out.println(i+"  --> "+intArrayList.get(i).intValue());
        }


        Integer myIntValue=56;//Integer.valueOf(56);
        int myInt=myIntValue.intValue();//myIntValue.intValue();

        ArrayList<Double>myDoubleValues=new ArrayList<Double>();
        for (double dbl=0.0;dbl<=10.0;dbl++)
        {
            myDoubleValues.add(Double.valueOf(dbl));
        }
        for (int i=0;i<=myDoubleValues.size();i++){
            double value=myDoubleValues.get(i).doubleValue();
            System.out.println(i+" --> "+ value);

        }

    }

}
