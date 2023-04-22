import java.util.Scanner;
public class e_sayısı {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
    double pi = 0;
    long i = 0;
    long n;
    System.out.print("Enter the value of n: ");
    n = input.nextInt();
   
   
    for (i = 0; i < n; i++)
    {
    if (i % 2 == 0)
    pi = pi + (1 / (2 * i - 1));
    else
    pi = pi - (1 / (2 * i + 1));
    }   
    pi = 4 * pi;
System.out.println("pi = " + pi);
}
    
}



