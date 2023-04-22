
package game;  

import java.util.Scanner;

public class game {

    public static void Yazdır(int[][] game){
        System.out.println("----------");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(game[i][j]+" ");
            }
            System.out.println();
        }
         System.out.println("----------");
    }
   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      int[][] game= new int[3][3];
      Yazdır(game);
      System.out.println("enter cord  row col");
      int row,col;
     
     row= input.nextInt();
     col= input.nextInt();
      game[row][col]=4;
      int x=5,pas_row,pas_col;
      while(x!=4){
          if(x==0)
             x=1;
       
          if(game[(1+row)%3][(1+col)%3]==0){
              row= (row+1)%3;
              col=(col+1)%3;
              game[row][col]=x;
              Yazdır(game);
              x=(x+1)%10;
          }
          else{
              if(row==0)
             row= (Math.abs(row-2))%3;
             else
             row= (Math.abs(row-1))%3;
             game[row][col]=x;
             Yazdır(game);
             x=(x+1)%10;
          }
             
      }
   
      Yazdır(game);
    }
   
}