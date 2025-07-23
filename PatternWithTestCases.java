import java.util.Scanner;

public class PatternWithTestCases 
{
    public static void print1(int n)
    {
        for(int i =0; i<n; i++)
        {
            for(int j=0 ;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int testCases =sc.nextInt();
        for(int i=0; i<testCases;i++)
        {
            int n = sc.nextInt();
            print1(n);
        }
        sc.close();
    }
    
}
