import java.util.Scanner;
import java.lang.Math;

public class QUAD1{

    public static void main(String[] args) {
        
        Scanner i = new Scanner(System.in);
        Scanner j = new Scanner(System.in);
        Scanner k = new Scanner(System.in);
        
        
        System.out.println("Enter The 1st number:" );
        int a=i.nextInt();
        System.out.println("Enter The 2nd number:" );
        int b=j.nextInt();
        System.out.println("Enter The 3rd number:" );
        int c=k.nextInt();
        
        double d,x,x1,x2;
        
        d= b*b - 4*a*c;
       
        
        if (d==0)
        {
            x=-b/2*a;
            System.out.println("The Root is"+x);
        }
        else if (d>0)
        {
            x1=-b+Math.sqrt(d)/2*a;
            x2=-b-Math.sqrt(d)/2*a;
            System.out.println("Equation is the : "+x1 +x2);
        }
        else
        {
            System.out.println("Root is Error");
        }
    }
    
}

