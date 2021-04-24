import java.util.*;
public class RockSize
{
    public static void main(String[] args)
    {
        int s,r,f=0,i=0,j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Rock Samples and number of Ranges");
        s=sc.nextInt();
        r=sc.nextInt();
        int rock[]=new int[s];
        int ran[][]=new int[r][2];

        System.out.println("Enter list of sizes of rock samples : ");
        for(i=0;i<s;i++)
        rock[i]=sc.nextInt();

        for(i=0;i<s-1;i++)
        {
            for(j=0;j<s-1-i;j++)
            {
                if(rock[j]>rock[j+1])
                {
                    int t = rock[j];
                    rock[j] = rock[j+1];
                    rock[j+1] = t;
                }
            }
        }

        System.out.println("Sorted Rock Sizes : ");
        for(i=0;i<s;i++)
        System.out.print(rock[i] + " ");
        System.out.println();

        System.out.println("Enter ranges : ");
        for(i=0;i<r;i++)
        {
                ran[i][0]=sc.nextInt();
                ran[i][1]=sc.nextInt();
        }

        for(i=0;i<r;i++)
        {
            f = 0;
            for(j=0;j<s;j++)
            {
                if(rock[j]>=ran[i][0] && rock[j]<=ran[i][1])
                {
                    f++;
                } 
            }
            System.out.print(f + "  ");
        }
        System.out.println();
    }
}