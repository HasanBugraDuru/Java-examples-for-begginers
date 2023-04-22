
package unit5;

    import java.util.Scanner;

public class Unit5 {
        

    public static void main(String[] args) {
        
       Scanner input = new  Scanner(System.in);
       
       int number,sum=0,uzun;
       
        System.out.println("Lutfen Sayiyi giriniz =>");
       number = input.nextInt();
       
       String sayi;
       if (number<0){
           number= number * -1;
       }
       sayi= Integer.toString(number);
       uzun = sayi.length();
       for(int i=0 ; i<uzun;i++){
           System.err.println(sayi.charAt(i));
           sum = Character. getNumericValue(sayi.charAt(i)) + sum;
           
       }
          System.out.println("\n"+sum);
      
    }
    
}
