
package file_operation;

import java.util.*;
import java.io.*;
        
public class File_Operation {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner inFile = new Scanner(new FileReader("test.txt"));
        
        String Name,Surname;
        
       Name = inFile.next();
       Surname = inFile.next();
        
       System.out.println(Name+"\n"+Surname);
        
        
        inFile.close();
    }
    
}
