import java.util.Random;

public class Scenario2_LAB6 {
    public static int[] rotatedArray(int[] arr){
        int[]new_arr=new int[arr.length];
        new_arr[0] = arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            new_arr[i+1]=arr[i];
        }
        return new_arr;
    }
    public static int[] createRandomArray(int minSize, int maxSize, int maxValue){
        Random rn=new Random();
        int size=rn.nextInt(minSize-1,maxSize);
        int[] rn_array=new int[size];
        for(int i=0;i<rn_array.length;i++){
            rn_array[i]=rn.nextInt(maxValue-1);
        }
        return rn_array;
    }
    public static void printArray(int[] x){
        System.out.print("{");
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]);
            if(i!=x.length-1){
            System.out.print(",");
            }
            else{
                System.out.print("}");
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1=createRandomArray(10,20,100);
        printArray(arr1);
        int[] arr2=rotatedArray(arr1);
        printArray(arr2);
    }
}