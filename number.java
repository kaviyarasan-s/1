import java.util.*;
class number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==0)
        {
            System.out.print("Zero");
        }
        else if(a>0)
        {
            System.out.print("Positive");
        }
        else
        {
            System.out.print("Negative");
        }
    }
}
