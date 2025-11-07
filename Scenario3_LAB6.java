import java.util.Random;

public class Scenario3_LAB6 {
    public static void main(String[] args) {
        Random rn=new Random();
        int ek=1000000;
        int[]probabilities={40,30,20,10};
        int sunnydays=0;
        int cloudydays=0;
        int rainydays=0;
        int stormydays=0;

        for(int i=0;i<ek;i++){
            int probabilities1= rn.nextInt(100)+1;
            if(probabilities1<=probabilities[0]){
                sunnydays++;
            }else if(probabilities1<=probabilities[0]+probabilities[1]){
                cloudydays++;
            }else if(probabilities1<=probabilities[0]+probabilities[1]+probabilities[2]){
                rainydays++;
            }else{
                stormydays++;
            }

        }
        float sunnyPercentage=(sunnydays/1000000f)*100f;
        float cloudyPercentage=(cloudydays/1000000f)*100f;
        float rainyPercentage=(rainydays/1000000f)*100f;
        float stormyPercentage=(stormydays/1000000f)*100f;
        System.out.print(sunnydays);
        System.out.print(" ");
        System.out.printf("sunnypercentage=%.2f",sunnyPercentage);
        System.out.print(" ");
        System.out.print(cloudydays);
        System.out.print(" ");
        System.out.printf("cloudypercentage=%.2f",cloudyPercentage);
        System.out.print(" ");
        System.out.print(rainydays);
        System.out.print(" ");
        System.out.printf("rainypercentage=%.2f",rainyPercentage);
        System.out.print(" ");
        System.out.print(stormydays);
        System.out.print(" ");
        System.out.printf("stormypercentage=%.2f",stormyPercentage);
    }
}
