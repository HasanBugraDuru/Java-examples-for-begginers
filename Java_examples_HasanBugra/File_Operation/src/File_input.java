import java.util.*;
import java.io.*;
public class File_input {

    public static void main(String[] args) throws FileNotFoundException{
     
        Scanner inFile = new Scanner(new FileReader("test.txt"));
        
        PrintWriter outFile = new PrintWriter("test.txt");
        
        outFile.println("Eylul");
        System.out.println(inFile.next()); 
      
 
      inFile.close();
      outFile.close();
    }
    
}
