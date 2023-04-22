
package com.mycompany.arrey;

import java.util.Scanner;

   
public class Arrey {
     public static void  WriteArrey(char[][] arry){
         System.out.println("--------------");
         for(int i=0;i<4;i++){
             for(int j=0;j<4;j++){
                 System.out.print("|"+arry[i][j] ); 
             }
             System.out.print("|");
             System.out.println();
         } 
         System.out.println("--------------");
    } 
     public static char[][] RandomO(char[][] arry){
        int x=0,y=0;
        while(arry[x][y]!='%'){
            x=  (int)Math.floor(Math.random()*3);
            y=  (int)Math.floor(Math.random()*3);
        }
        arry[x][y]='O';
        return arry; 
     }
     public static boolean Control(char[][] arry){
            for(int i=0 ;i<4;i++){
                for(int j=0;j<4;j++){
                    if(arry[i][j]!='%'&&    i<2&& j<2){
                    if( arry[i][j]==arry[i][j+1]){
                        if(arry[i][j+1]==arry[i][j+2]){
                            return false;
                        }    
                        
                    }
                    else if(i<2&& j<2 && arry[i][j]==arry[i+1][j+1]){
                        if(arry[i+1][j+1]==arry[i+2][j+2]){
                            return false;
                        }
                    }
                    else if(i<2&& j<2 && arry[i][j]==arry[i+1][j]){
                        if(arry[i+1][j]==arry[i+2][j]){
                            return false;
                        }    
                    }
               
                  }
                }
                
            }
         return true;
     }
     
     
     
    public static void main(String[] args) {
        char[][] xox=new char[4][4] ;
        for(int i=0;i<4;i++){
             for(int j=0;j<4;j++){
                 xox[i][j]= '%';
             }
         } 
        Scanner input = new Scanner(System.in);
        int x,y;
        boolean control=true;
        while(control==true){
        System.out.println("Lutfen 'X' yerlestirmek istediginiz konumu giriniz:");
        x = input.nextInt();
        y = input.nextInt();
        xox[x][y]='X';
        WriteArrey(xox);
        xox = RandomO(xox);
        WriteArrey(xox); 
        control= Control(xox);
        }
        
    }
}
