
package classapps;

public class RollDie {
    private String Roman;
    private int num;
    
    public RollDie(int b){
        
                this.num=b;
    }
    public void SetRoman(String R_Num){
        Roman = R_Num;   
    }
    public int GetNum(){
        return num;
    }
    public boolean Control(int indx,char b){
      String values ="MDCLXVI";
        if(indx + 1==Roman.length())
          return true;
      else if(b==Roman.charAt(indx + 1))
          return true;
      else 
          return false;
               
    }
    public int RomantoInt(){
        int length_R= Roman.length();
        int i;
        for(i=0;i<length_R;i++){
            switch (Roman.charAt(i)) {
                case 'M':
                        num= num +1000;
                    break;
                case 'D':
                    if(Control(i,'D'))
                        num= num +500;
                    else
                       num= num -500;
                    break;
                case 'C':
                    if(Control(i,'C'))
                        num= num +100;
                    else
                       num= num -100;
                    break;
                case 'L':
                    if(Control(i,'L'))
                        num= num +50;
                    else
                       num= num -50;
                    break;
                    case 'X':
                    if(Control(i,'X'))
                    
                        num= num +10;
                    else
                       num= num -10;
                    break;
                    case 'V':
                    if(Control(i,'V'))
                        num= num +5;
                    else
                       num= num -5;
                    break;
                    case 'I':
                    if(Control(i,'I'))
                        num= num +1;
                    else
                       num= num -1;
                    break;
            }
        }
        return num; 
    }
}
