
package pkg14.pkg12;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int[] sayilar ={2,4,6,7}; 
        int i=0,sum=0,avg=0;
        double temp = 0;
       i=0;
       while(i<sayilar.length){
           temp= Math.pow(avg-sayilar[i],2);
           i++;
       }
        temp=temp/sayilar.length;
        System.out.println(Math.sqrt(temp));
    }
    
}
