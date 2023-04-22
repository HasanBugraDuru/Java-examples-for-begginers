        /*10 ogrencinin oldugu ve her ogrencinin bir dolabı oldugu okulda ilk 
        basta bütün dolablar kapalı olup ilk öğrenci hepsini acar sonra 2. öğreci
        içinde 2 olan ve 2 ye bölünün dolapları kapatır,ardından 3 öğrenci 3e 
        bölünebilen veya 3 içeren dolapları açıksa kapatır kapalıysa açar*/
package midterm;
public class Studentslocks {
    public static void main(String[] args){
        String dolaplar= "0000000000";
        System.out.println(dolaplar);
        dolaplar= "1111111111";
        System.out.println(dolaplar);
        int i=2,j=0;
        while(i<=10){
            for( j=0;j<10;j++){
                if(dolaplar.charAt(j)%i==0||i==j+1 ){
                    if(dolaplar.charAt(j)==0){
                      
                    }
                       
                    
                     
                }
            }
        }
        
        
    }
}
