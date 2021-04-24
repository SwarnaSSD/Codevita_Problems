import java.util.*;
public class LargestFactor
{
    public static void main(String[] args)
    {
        int n,k,i=0,f=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number n and k to find k-th highest factor :");
        n = sc.nextInt();
        k = sc.nextInt();
        for(i=n;i>=1;i--)
        {
            if((n%i)==0)
            f++;
            if(f==k)
            {
                System.out.println(i);
                break;
            }
        }
        System.out.println(f);
        if(f!=k)
        System.out.println("1");
    }
}