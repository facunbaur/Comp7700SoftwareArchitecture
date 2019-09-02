package Comp7700SoftwareArchitecture;

public class Finder{

    public static void main(String[] args) {
        int intArray[]= {1,5,-9,12,-3,89, 18,23,4,-6};
        findMax(intArray);
        findMin(intArray);
    }

    public static Integer findMax(int[] intArray)
    {
        if(intArray == null || intArray.length == 0)
        {
            System.out.println("array is Null or empty");
            return null;
        }
        else
        {
            int maxValue = intArray[0];
            for(int i=1;i<intArray.length;i++){
                if(intArray[i] > maxValue){
                    maxValue = intArray[i];
                }
            }
            System.out.println("Max Value is: " + maxValue);
            return maxValue;
        }
    }

    public static Integer findMin(int[] intArray)
    {
        if(intArray == null || intArray.length == 0)
        {
            System.out.println("array is Null or empty");
            return null;
        }
        else
        {
            int minValue = intArray[0];
            for(int i=1;i<intArray.length;i++){
                if(intArray[i] < minValue){
                    minValue = intArray[i];
                }
            }
            System.out.println("Min Value is: " + minValue);
            return minValue;
        }
    }
}