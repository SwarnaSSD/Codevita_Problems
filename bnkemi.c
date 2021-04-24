#include <stdio.h>
#include <math.h>
int main()
{
    double p,mi,sum=0,emi,bank[5],inf;
    int y,n,yrs,b=0;
    scanf("%lf", &p);
    scanf("%d", &y);
    for(int k=0; k<2;k++)
    {
        scanf("%d",&n);
        for(int i=0; i<n;i++)
        {
            scanf("%i", &yrs);
            scanf("%d", &mi);
            inf=pow((1+mi),yrs*12);
            emi=(p*(mi))/(1-1/inf);
            sum=sum+emi;
        }
        bank[b++]=sum;
    }
    if(bank[0]<bank[1])
    printf("Bank A");
    else 
    printf("Bank B");
    return 0;
}