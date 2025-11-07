public class Scenario1_LAB6 {
    public static void main(String[] args) {
        int[]stdID=new int[20];
        for(int i=0;i<stdID.length;i++){
            stdID[i]=1000+i;
            System.out.println(stdID[i]);
        }

    }
    public static int[] function(int[] old_array,int size){
        int[] newstdID=new int[size];

        for(int x=0;x< old_array.length;x++){
            newstdID[x]=old_array[x];

        }
        return newstdID;
    }
}
