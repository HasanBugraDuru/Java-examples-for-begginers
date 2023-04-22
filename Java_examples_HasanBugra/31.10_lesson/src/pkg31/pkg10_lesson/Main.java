
package pkg31.pkg10_lesson;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        double area=0,cevre=0;
        int radius=0;
     
        radius= Integer.parseInt(JOptionPane.showInputDialog("Please enter the radius")) ;
        
        area = Math.PI *radius*radius;
        cevre = Math.PI *2*radius;
        
         
        JOptionPane.showMessageDialog(null ,"Area :" + String.format("%.2f",area)+"\n Cevre = "+ String.format("%.2f",cevre) , "Message",JOptionPane.INFORMATION_MESSAGE);
        
        
        
    }
    
}
