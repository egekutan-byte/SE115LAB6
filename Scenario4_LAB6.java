import java.util.Random;

public class Scenario4_LAB6 {
    public static void main(String[] args) {
        Random rn=new Random();
        int[] arr=new int[30];
        int peak=0;
        for(int i=0;i< arr.length;i++){
            arr[i]=rn.nextInt(1,101);
        }
        printArray(arr);
        int largestpeak=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                peak++;
                System.out.println(arr[i]);
                if(largestpeak<arr[i]){
                    largestpeak=arr[i];
                }
            }
        }




        System.out.println("total peak count= "+peak);
        System.out.println("The tallest peak is: "+ largestpeak);









    }
    public static void printArray(int[] arr){

        System.out.print("{");

        for (int i = 0; i < arr.length; i++){

            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");

            }

        }

        System.out.print("}");
        System.out.println();
    }
}
