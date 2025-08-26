package R_8_25;

import java.util.Scanner;
class SMPS1_5 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter km");
        float km = sc.nextFloat();

        float miles = km*0.60f;

        System.out.format("Your km in miles is : %.2f",miles);

    }


}