import java.util.Scanner;
public class Oddsum
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);

        long N=ip.nextLong();
        long sum=0;

        for(int i=1;i<2*N;i++)
        {
            if(i%2==1)
               sum=sum+i;

        }
        system.out.println(sum);
    }
}