
package midterm;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Midterm {
    
public static double Cevre(int radius){
    double cevre;
    cevre= (2*Math.PI*radius) ;
    return cevre;
} 
    
    public static void main(String[] args) {
        Scanner eylul = new Scanner(System.in);
        int a=0,b=0;
        a= (int)Math.pow(2, 3);
        System.out.println("Enter Hight");
        b= eylul.nextInt();
        if(b>10)
        System.out.println(b);
       
     a= Integer.parseInt(JOptionPane.showInputDialog(null,"enter the radius")) ;
        System.out.println(Cevre(a)); 
        
    }
    
}
